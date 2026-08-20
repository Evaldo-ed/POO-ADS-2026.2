package ads.poo;

public class Contador {
    private int valorAtual;

    public void definirValor(int valor) {
        valorAtual = valor;
    }

    public void incrementar() {
        valorAtual++;
    }

    public int obterValorAtual() {
        return valorAtual;
    }
}