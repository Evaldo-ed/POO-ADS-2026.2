package ads.poo;

public class App {
    public static void main(String[] args) {
        Contador cont = new Contador();

        cont.definirValor(128);
        IO.println(cont.obterValorAtual());

        cont.incrementar();
        IO.println(cont.obterValorAtual());
    }
}