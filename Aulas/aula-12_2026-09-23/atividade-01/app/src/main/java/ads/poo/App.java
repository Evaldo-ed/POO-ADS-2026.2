package ads.poo;

public class App {
    public static void main(String[] args) {
        Retangulo a = new Retangulo(4, 8);
        Carro b = new Carro();

        IO.println("Área do Retângulo: " + a.getArea());
    }
}