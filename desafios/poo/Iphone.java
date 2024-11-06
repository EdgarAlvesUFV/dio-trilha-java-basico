public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    private String musicaAtual;
    public void tocar(){
        if (this.musicaAtual == null){
            System.out.println("Nenhuma música selecionada");
        }
        else{
            System.out.println("Reproduzindo música:" + this.musicaAtual);
        }
    }
    public void pausar(){
        System.out.println("Música pausada");
    }
    public void selecionarMusica(String musica){
        this.musicaAtual = musica;
        tocar();
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo página da internet");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }

    public void ligar(String numero){
        System.out.println("Realizando ligação");
    }
    public void atender(){
        System.out.println("Atendendo ligação");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
}