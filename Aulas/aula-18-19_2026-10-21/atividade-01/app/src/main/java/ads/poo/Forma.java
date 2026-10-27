package ads.poo;

public class Forma {
    private String cor;
    private double coordenadaInicialX;
    private double coordenadaInicialY;

    public Forma (String cor, double coordenadaInicialX, double coordenadaInicialY) {
        this.cor = cor;
        this.coordenadaInicialX = coordenadaInicialX;
        this.coordenadaInicialY = coordenadaInicialY;
    }

    public String desenhar() {
        return "";
    }

    public String getCor() {
        return cor;
    }

    public double getCoordenadaInicialX() {
        return coordenadaInicialX;
    }

    public double getCoordenadaInicialY() {
        return coordenadaInicialY;
    }
}