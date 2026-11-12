package ads.poo.veiculos;

public class FerrariPortoFino extends Veiculo implements Conversivel {
    private boolean capotaAberta;
    private boolean controleEstabilidadeLigado;

    public FerrariPortoFino() {
        super();
        capotaAberta = false;
        controleEstabilidadeLigado = false;
    }

    @Override
    public boolean acelerar(double quantidade) {
        if (super.velocidadeAtual + quantidade <= 200) {
            super.velocidadeAtual += quantidade;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean frear(double quantidade) {
        if (super.velocidadeAtual - quantidade >= 0) {
            super.velocidadeAtual -= quantidade;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean fecharAbrirCapota() {
        capotaAberta = !capotaAberta;
        return capotaAberta;
    }

    public boolean ligarDesligarControleEstabilidade() {
        controleEstabilidadeLigado = !controleEstabilidadeLigado;
        return controleEstabilidadeLigado;
    }
}