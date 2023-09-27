package pratica.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaASerRemovida = null;

        for(Tarefa task : tarefaSet){
            if(task.getDescricao().equalsIgnoreCase(descricao)){
                tarefaASerRemovida = task;
                break;
            }
        }

        if (tarefaASerRemovida != null) {
            tarefaSet.remove(tarefaASerRemovida);
            System.out.println("Tarefa [" + tarefaASerRemovida.getDescricao() +"] foi removida");
        } else {
            System.out.println("A tarefa não existe.");
        }

    }

    public void exibirTarefas(){
        System.out.println("Tarefas: \n" + tarefaSet);
    }

    public void contarTarefas(){
        System.out.println("Número de tarefas: " + tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){

        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa task : tarefaSet){
            if(task.isConcluida()){
                tarefasConcluidas.add(task);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa task : tarefaSet){
            if(!task.isConcluida()){
                tarefasPendentes.add(task);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa task : tarefaSet){
            if(task.getDescricao().equalsIgnoreCase(descricao)){
                task.setConcluida(true);
                System.out.println("Tarefa Atualizada para Concluída: " + task.getDescricao() + ".");
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa task : tarefaSet){
            if(task.getDescricao().equalsIgnoreCase(descricao)
            && task.isConcluida()){
                task.setConcluida(false);
                System.out.println("Tarefa Atualizada para Pendente: " + task.getDescricao() + ".");
                break;
            }
        }
    }

    public void limparListaTarefas(){
        Set<Tarefa> tarefasASeremRemovidas = new HashSet<>();

        for(Tarefa task : tarefaSet){
            tarefasASeremRemovidas.addAll(tarefaSet);
        }
        tarefasASeremRemovidas.removeAll(tarefaSet);
        System.out.println("Lista vazia: " + tarefasASeremRemovidas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Subir projeto no github");
        listaTarefas.adicionarTarefa("Finalizar bootcamp");
        listaTarefas.adicionarTarefa("Ir à academia.");

        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();
        listaTarefas.removerTarefa("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Finalizar bootcamp");
        listaTarefas.marcarTarefaConcluida("Ir à academia.");
//        listaTarefas.exibirTarefas();
        listaTarefas.marcarTarefaPendente("Ir à academia.");
        System.out.println("Tarefas Concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();

    }
}
