package pratica.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;

        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Giselle", 123456);
        agendaContatos.adicionarContato("Monique", 456531);
        agendaContatos.adicionarContato("Monique", 984522);
        agendaContatos.adicionarContato("Rosana", 365457);
        agendaContatos.adicionarContato("Teresinha", 7458961);
        agendaContatos.adicionarContato("Maria", 111111);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Rosana"));
    }
}
