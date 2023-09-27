package pratica.set.ordenacao;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        // o hashset não deixa organizado, por isso utiliza-se o treeset
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 1", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 2", 20d, 8);
        cadastroProdutos.adicionarProduto(3L, "Produto 3", 45d, 10);
        cadastroProdutos.adicionarProduto(4L, "Produto 4", 70d, 2);

        System.out.println("Produtos: " + cadastroProdutos.produtoSet);

        System.out.println("Por Nome: " + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Por Preço: " + cadastroProdutos.exibirProdutosPorPreco());
    }
}
