package ads.poo;

public class Batedeira {
    private final int VELOCIDADE_MAXIMA = 5;
    private final int VELOCIDADE_MINIMA = 1;

    private boolean ligada;
    private int nivelVelocidade = 0;
    
    public void desligar() {
        ligada = false;
        nivelVelocidade = 0;
    }

    public void ligar() {
        ligada = true;
        nivelVelocidade = 1;
    }

    public void definirVelocidade(int velocidade) {
        if (velocidade <= VELOCIDADE_MAXIMA && velocidade >= VELOCIDADE_MINIMA && ligada) {
            nivelVelocidade = velocidade;
        }
    }

    public void aumentarVelocidade() {
        if (nivelVelocidade < VELOCIDADE_MAXIMA && ligada) {
            nivelVelocidade++;
        }
    }

    public void reduzirVelocidade() {
        if (nivelVelocidade > VELOCIDADE_MINIMA && ligada) {
            nivelVelocidade--;
        }
    }

    public boolean obterEstado() {
        return ligada;
    }

    public int obterVelocidade() {
        return nivelVelocidade;
    }
}