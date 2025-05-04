import seuprojeto.iphonepoo.Iphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Iphone iphone = new Iphone("Iphone 14", "ios");

    iphone.selecionarMusica("Garota de Ipanema");
    iphone.tocar();
    iphone.pausar();

    iphone.ligar("11999998877");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    iphone.exibirPagina("https://www.google.com");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();

    }
    }
