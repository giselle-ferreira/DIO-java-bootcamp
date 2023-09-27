package pratica.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        convidadosSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigo){
        Convidado convidadoParaRemover = null;

        for(Convidado guest : convidadosSet){
            if(guest.getCodigo() == codigo){
                convidadoParaRemover = guest;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Giselle", 1);
        conjuntoConvidados.adicionarConvidado("Monique", 2);
        conjuntoConvidados.adicionarConvidado("Rosana", 3);
        conjuntoConvidados.adicionarConvidado("Teresinha", 4);
        conjuntoConvidados.adicionarConvidado("Melino", 5);
        conjuntoConvidados.adicionarConvidado("Joãozinho", 6);

//        conjuntoConvidados.exibirConvidados();
//        System.out.println("Existem: " +
//                + conjuntoConvidados.contarConvidados() + " convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(6);
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem: " +
                + conjuntoConvidados.contarConvidados() + " convidados.");
    }

}
