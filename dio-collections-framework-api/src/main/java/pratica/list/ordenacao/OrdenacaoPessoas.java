package pratica.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        // Cria uma lista trazendo a lista inicial
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        // Ordena a lista usando o sort, através do Comparable
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        // ou pessoasPorAltura.sort(new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Giselle", 40, 1.74);
        ordenacaoPessoas.adicionarPessoa("Monique", 39, 1.75);
        ordenacaoPessoas.adicionarPessoa("Rosana", 47, 1.70);
        ordenacaoPessoas.adicionarPessoa("Anna Julia", 21, 1.68);

        System.out.println("Ordenar por Idade: \n" + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("------------------------------");
        System.out.println("Ordenar por Altura: \n" + ordenacaoPessoas.ordenarPorAltura());
    }
}

// nova classe para o Comparator
class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }
}
