package ads.poo;

public class App {
    public static void main(String[] args) {
        Carro fusca = new Carro();

        for (int i = 0; i < 4; i++) {
            fusca.acelerar(30);
        }
        IO.println("Velocidade Atual: " + fusca.obterVelocidadeAtual());
    }
}