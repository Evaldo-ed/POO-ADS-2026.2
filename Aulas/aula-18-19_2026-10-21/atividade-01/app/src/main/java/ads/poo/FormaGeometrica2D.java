package ads.poo;

public abstract class FormaGeometrica2D extends Forma {
    public FormaGeometrica2D(String cor, double coordenadaInicialX, double coordenadaInicialY) {
        super (cor, coordenadaInicialX, coordenadaInicialY);
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}