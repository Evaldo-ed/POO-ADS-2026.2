package ads.poo;

public class Bateria {
    private int capacidade;
    private int cargaAtual;

    public Bateria(int capacidade, int cargaInicial) {
        this.capacidade = capacidade;
        cargaAtual = cargaInicial;
    }

    public boolean reduzirCarga(int unidade, int consumo) {
        if (cargaAtual - unidade * consumo < 0) {
            cargaAtual -= unidade * consumo;
            return true;
        } else {
            return false;
        }
    }
}