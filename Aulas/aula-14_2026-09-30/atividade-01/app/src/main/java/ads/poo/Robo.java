package ads.poo;

public class Robo {
    private Bateria bateria;
    private int consumo;
    private int posicaoX;
    private int posicaoY;
    private int dimensaoMapaX;
    private int dimensaoMapaY;

    public Robo(int dimensaoMapaX, int dimensaoMapaY, int posicaoInicialX, int posicaoInicialY, int consumoPorAcao, int capacidadeBateria, int cargaInicial) {
        this.dimensaoMapaX = dimensaoMapaX;
        this.dimensaoMapaY = dimensaoMapaY;
        posicaoX = posicaoInicialX;
        posicaoY = posicaoInicialY;
        consumo = consumoPorAcao;
        bateria = new Bateria(capacidadeBateria, cargaInicial);
    }

    public boolean mover (char direcao, int unidade) {
        if (bateria.reduzirCarga(unidade, consumo)) {
            if (direcao == 'n' && posicaoY + unidade <= dimensaoMapaY) {
                posicaoY += unidade;
            } else if (direcao == 'l' && posicaoX + unidade <= dimensaoMapaX){
                posicaoX += unidade;
            }
            else if (direcao == 's' && posicaoY - unidade >= 0){
                posicaoY -= unidade;
            } else if (direcao == 'o' && posicaoX - unidade >= 0){
                posicaoX -= unidade;
            }
            return true;
        } else {
            return false;
        }
    }
}