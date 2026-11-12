package ads.poo.veiculos;

public abstract class Veiculo {
    protected static final double VELOCIDADE_MAXIMA = 200;
    private static int totalVeiculos;
    protected int id;
    protected double velocidadeAtual;

    public Veiculo() {
        id = totalVeiculos++;
        velocidadeAtual = 0;
    }

    public abstract boolean acelerar(double quantidade);
    public abstract boolean frear(double quantidade);
}