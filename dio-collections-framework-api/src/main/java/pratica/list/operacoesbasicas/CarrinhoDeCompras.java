package pratica.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
       List<Item> itensARemover = new ArrayList<>();

       if(!listaItens.isEmpty()){
           for (Item item : listaItens){
               if(item.getNome().equalsIgnoreCase(nome)){
                   itensARemover.add(item);
               }
           }
           listaItens.removeAll(itensARemover);
       } else {
           System.out.println("A lista está vazia.");
       }
    }

    public double calcularValorTotal(){
        double total = 0;

        if(!listaItens.isEmpty()){
            for (Item item : listaItens){
                double precoItem = item.getPreco() * item.getQuantidade();
                total += precoItem;
            }
            return total;

        } else {
            System.out.println("A lista está vazia.");
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras listaItens = new CarrinhoDeCompras();

//        listaItens.exibirItens();
        listaItens.adicionarItem("maçã", 4.10, 4);
        listaItens.adicionarItem("feijão", 8.50, 2);
        listaItens.adicionarItem("macarrão", 13.30, 3);
//        listaItens.exibirItens();

        listaItens.removerItem("maçã");
        listaItens.exibirItens();

        System.out.println("Valor Total: R$ " + String.format("%.2f", listaItens.calcularValorTotal()));

    }
}
