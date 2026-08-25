package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private final double CONSUMO = 1;

    public Caneta(String cor, double nivelTinta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }

    public Caneta(double nivelTinta) {
        this("Azul", nivelTinta);
    }

    public Caneta() {
        this(100);
    }

    public String getCor() {
        return cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public String toString() {
        return "Cor: " + cor + "\nTinta: " + nivelTinta;
    }

    public double desenhar(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        if ((nivelTinta - distancia) < 0) {
            return -1;
        }
        nivelTinta -= distancia * CONSUMO;
        return nivelTinta;
    }
}