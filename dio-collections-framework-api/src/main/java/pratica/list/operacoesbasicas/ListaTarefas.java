package pratica.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasARemover = new ArrayList<>();

        for (Tarefa task : tarefaList){
            if(task.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasARemover.add(task);
            }
        }
        tarefaList.removeAll(tarefasARemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

//        System.out.println("Numero total de tarefas: " +
//                listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 3");

//        System.out.println("Numero total de tarefas: " +
//                listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("Numero total de tarefas: " +
                listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
