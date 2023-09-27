package pratica.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        listaLivros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosNoIntervalo = new ArrayList<>();

        if(!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros){
                if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal){
                    livrosNoIntervalo.add(livro);
                }
            }
        }
        return livrosNoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo ){

        Livro livroPorTitulo = null;

        if(!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public void exibirCatalogo() {
        System.out.println(listaLivros);
    }

    public static void main(String[] args) {
        CatalogoLivros listaLivros = new CatalogoLivros();

        listaLivros.adicionarLivro("Titulo 1", "Autor A", 1971);
        listaLivros.adicionarLivro("Titulo 123", "Autor A", 1954);
        listaLivros.adicionarLivro("Titulo 345", "Autor A", 1977);
        listaLivros.adicionarLivro("Titulo 123", "Autor B", 1981);
        listaLivros.adicionarLivro("Titulo 3", "Autor C", 1991);

        listaLivros.exibirCatalogo();

        System.out.println("Livros do Autor: " + listaLivros.pesquisarPorAutor("Autor A"));

        System.out.println("Livros no intervalo: " + listaLivros.pesquisarPorIntervaloAnos(1952, 1982));
        System.out.println("Título encontrado: " + listaLivros.pesquisarPorTitulo("Titulo 123"));
    }
}
