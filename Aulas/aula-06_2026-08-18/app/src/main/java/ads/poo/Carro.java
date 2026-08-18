package ads.poo;

public class Carro {
    // atributos
    private int velocidadeAtual;

    // métodos
    public void acelerar(int incremento) {
        if (velocidadeAtual + incremento > 100) {
            velocidadeAtual = 100;
        } else {
            velocidadeAtual += incremento;
        }
    }

    public int obterVelocidadeAtual() {
        return velocidadeAtual;
    }
}
