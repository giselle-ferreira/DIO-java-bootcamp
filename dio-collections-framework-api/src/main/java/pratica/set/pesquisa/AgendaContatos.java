package pratica.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    private void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    private void exibirContatos(){
        System.out.println(contatoSet);
    }

    private Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatorPorNome = new HashSet<>();
        for(Contato contato : contatoSet){
            if(contato.getNome().startsWith(nome)){
                contatorPorNome.add(contato);
            }
        }
        return contatorPorNome;
    }

    private Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato contato : contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Giselle", 9999999);
        agendaContatos.adicionarContato("Giselle Trabalho", 24516126);
        agendaContatos.adicionarContato("Rosana", 9845623);
        agendaContatos.adicionarContato("Monique", 91548793);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Giselle"));

        System.out.println("Contato Atualizado: " +
                agendaContatos.atualizarNumeroContato("Giselle Trabalho", 123456));
    }

}
