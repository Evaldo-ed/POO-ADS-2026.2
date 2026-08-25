package ads.poo;

public class App {
    public static void main(String[] args) {
        Caneta a = new Caneta("Preta", 75); //Preta, 75.0
        Caneta b = new Caneta(50); //Azul, 50.0
        Caneta c = new Caneta(); //Azul, 100.0

        IO.println("* Caneta A *\n" + a.toString() + "\n");
        IO.println("* Caneta B *\n" + b.toString() + "\n");
        IO.println("* Caneta C *\n" + c.toString() + "\n");

        IO.println("Tinta restante: " + String.format("%.2f", a.desenhar(2, 1, 5, 3)));
        IO.println("Tinta restante: " + String.format("%.2f", b.desenhar(1, 1, 52, 1)));
    }
}