package pratica.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;

        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto : estoqueProdutosMap.values()){
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto : estoqueProdutosMap.values()){
                if(produto.getPreco() > maiorPreco){
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){

        Produto produtoMaisBarato = null;
        double maiorPreco = Double.MAX_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto : estoqueProdutosMap.values()){
                if(produto.getPreco() < maiorPreco){
                    produtoMaisBarato = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisBarato;

    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidade = null;
        double maiorValorTotal = 0d;

        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto : estoqueProdutosMap.values()){
                if(produto.getPreco() * produto.getQuantidade() > maiorValorTotal){
                    produtoMaiorQuantidade = produto;
                    maiorValorTotal = produto.getPreco() * produto.getQuantidade();
                }
            }
        }
        return produtoMaiorQuantidade;

        // implementação Camila
//        Produto produtoMaiorQuantidade = null;
//        double maiorValorTotal = 0d;
//
//        if(!estoqueProdutosMap.isEmpty()){
//            for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
//                double valorProduto = entry.getValue().getPreco() * entry.getValue().getQuantidade();
//
//                if(valorProduto > maiorValorTotal){
//                    maiorValorTotal = valorProduto;
//                    produtoMaiorQuantidade = entry.getValue();
//                }
//            }
//        }
//        return produtoMaiorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Teclado", 10, 120.0);
        estoqueProdutos.adicionarProduto(2L, "monitor", 2, 1345.70);
        estoqueProdutos.adicionarProduto(3L, "mouse", 10, 75.50);
        estoqueProdutos.adicionarProduto(4L, "mouse 2", 70, 75.50);
        estoqueProdutos.adicionarProduto(5L, "monitor curvo", 2, 2125.5);

        estoqueProdutos.exibirProdutos();
        System.out.println("Valor total: R$ " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Produto de maior quantidade: " +
                estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
