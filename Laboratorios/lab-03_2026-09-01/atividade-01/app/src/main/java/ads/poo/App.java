package ads.poo;

public class App {
    public static void main(String[] args) {
        Ponto a = new Ponto(2, 4);
        Ponto b = new Ponto(2, 8);

        IO.println("Ponto A: " + a.getX() + ", " + a.getY());
        IO.println("Ponto B: " + b.toString());

        IO.println("Distância entre o ponto A e o ponto B: " + String.format("%.2f", Ponto.getDistancia(a, b)));
        
        b.setX(4);
        b.setY(12);
        IO.println("Ponto B após alteração: " + b.toString());
        IO.println("Distância entre o ponto A e o ponto B: "  + String.format("%.2f", Ponto.getDistancia(a, b)));
    }
}