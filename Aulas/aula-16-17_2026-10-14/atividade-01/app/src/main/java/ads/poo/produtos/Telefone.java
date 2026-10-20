package ads.poo.produtos;

import ads.poo.Dimensao;

public class Telefone extends Produto {
    private boolean disco;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, boolean disco) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.disco = disco;
    }
}