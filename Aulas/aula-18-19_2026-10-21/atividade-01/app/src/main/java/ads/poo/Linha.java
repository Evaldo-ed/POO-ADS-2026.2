package ads.poo;

public class Linha extends Forma {
    private double coordenadaFinalX;
    private double coordenadaFinalY;

    public Linha(String cor, double coordenadaInicialX, double coordenadaInicialY, double coordenadaFinalX, double coordenadaFinalY) {
        super (cor, coordenadaInicialX, coordenadaInicialY);
        this.coordenadaFinalX = coordenadaFinalX;
        this.coordenadaFinalY = coordenadaFinalY;
    }

    @Override
    public String desenhar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Forma: ").append("Linha");
        sb.append("\nCor da Linha: ").append(super.getCor());
        sb.append("\nCoordenada Inicial: ").append(String.format("(%.1f;%.1f)", super.getCoordenadaInicialX(), super.getCoordenadaInicialY()));
        sb.append("\nCoordenada Final: ").append(String.format("(%.1f;%.1f)", coordenadaFinalX, coordenadaFinalY));
        return sb.toString();
    }
}