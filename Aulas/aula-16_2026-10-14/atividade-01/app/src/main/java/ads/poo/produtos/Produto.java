package ads.poo.produtos;

import ads.poo.Dimensao;

public class Produto {
    private int codigo;
    private String numSerie;
    private String modelo;
    private double peso;
    private Dimensao dimensao;

    public Produto(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPeso() {
        return peso;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }


    @Override // Sobreescrita de método
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código: ").append(codigo);
        sb.append("\nNúmero de Série: ").append(numSerie);
        sb.append("\nModelo: ").append(modelo);
        sb.append("\nPeso: ").append(peso);
        sb.append("\nAltura: ").append(dimensao.getAltura());
        sb.append("\nLargura: ").append(dimensao.getLargura());
        sb.append("\nProfundidade: ").append(dimensao.getProfundidade());
        return sb.toString();
    }
}