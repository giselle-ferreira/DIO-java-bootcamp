package desafio.iphone.uml;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando " + numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo " + numero);
    }

    @Override
    public void iniciarCorreioVoz(String numero) {
        System.out.println("Iniciando Correio de voz para " + numero);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música... ");
    }

    @Override
    public void pausar() {
        System.out.println("Em pausa...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar musica... " + musica);
    }

}
