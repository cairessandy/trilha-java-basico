package entities;

public class IPhone implements IPod, Safari, Phone{

    @Override
    public void tocar() {
      System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
       System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Música %s selecionada%n", musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo página %s...%n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para %s...%n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
       System.out.println("Iniciando correio de voz...");
    }
    
}
