package pratica.map.ordenacao;

import jdk.jfr.Event;
import pratica.map.operacoesbasicas.AgendaContatos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        // treeMap já organiza em ordem crescente
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        // treeMap já organiza em ordem crescente
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();

                System.out.println("O próximo evento: " + proximoEvento
                        + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, 9, 25), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 2), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 10, 13), "Evento 3", "Atracao 3");
//        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 27), "Evento 4", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 28), "Evento 5", "Atracao 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }

}
