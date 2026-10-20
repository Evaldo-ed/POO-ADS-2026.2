package ads.poo.produtos;

import ads.poo.Dimensao;

public class Pager extends Produto {
    private int numLinhasDisplay;

    public Pager(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, int numLinhasDisplay) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.numLinhasDisplay = numLinhasDisplay;
    }
}