package ads.poo;

public class Retangulo extends FormaGeometrica2D{
    private double coordenadaFinalX;
    private double coordenadaFinalY;

    public Retangulo(String cor, double coordenadaInicialX, double coordenadaInicialY, double coordenadaFinalX, double coordenadaFinalY) {
        super (cor, coordenadaInicialX, coordenadaInicialY);
        this.coordenadaFinalX = coordenadaFinalX;
        this.coordenadaFinalY = coordenadaFinalY;
    }

    @Override
    public double calcularArea() {
        double base = coordenadaFinalX - super.getCoordenadaInicialX();
        double altura = coordenadaFinalY - super.getCoordenadaInicialY();
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        double base = coordenadaFinalX - super.getCoordenadaInicialX();
        double altura = coordenadaFinalY - super.getCoordenadaInicialY();
        return base*2 + altura*2;
    }

    @Override
    public String desenhar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Forma: ").append("Retângulo");
        sb.append("\nCor da Linha: ").append(super.getCor());
        sb.append("\nCoordenada Inicial: ").append(String.format("(%.1f;%.1f)", super.getCoordenadaInicialX(), super.getCoordenadaInicialY()));
        sb.append("\nCoordenada Final: ").append(String.format("(%.1f;%.1f)", coordenadaFinalX, coordenadaFinalY));
        return sb.toString();
    }
}