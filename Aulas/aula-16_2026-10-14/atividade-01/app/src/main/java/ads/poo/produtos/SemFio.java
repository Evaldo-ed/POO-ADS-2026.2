package ads.poo.produtos;

import ads.poo.Dimensao;

public class SemFio extends Telefone {
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, dimensao, false);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public void setDistanciaOperacao(double distanciaOperacao) {
        this.distanciaOperacao = distanciaOperacao;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public int getCanais() {
        return canais;
    }

    public double getDistanciaOperacao() {
        return distanciaOperacao;
    }

    @Override // Sobreescrita de método
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nFrequência: ").append(frequencia);
        sb.append("\nCanais: ").append(canais);
        sb.append("\nDistância de Operação: ").append(distanciaOperacao);
        return sb.toString();
    }
}