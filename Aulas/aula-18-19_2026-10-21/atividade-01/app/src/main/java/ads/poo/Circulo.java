package ads.poo;

public class Circulo extends FormaGeometrica2D{
    private double raio;

    public Circulo(String cor, double coordenadaInicialX, double coordenadaInicialY, double raio) {
        super (cor, coordenadaInicialX, coordenadaInicialY);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularDiametro() {
        return raio * 2;
    }

    @Override
    public String desenhar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Forma: ").append("Círculo");
        sb.append("\nCor da Linha: ").append(super.getCor());
        sb.append("\nCoordenada: ").append(String.format("(%.1f;%.1f)", super.getCoordenadaInicialX(), super.getCoordenadaInicialY()));
        return sb.toString();
    }
}