package ads.poo;

public class MotorAviao {
    private String tipo;
    private boolean ligado;

    public MotorAviao(String tipo) {
        this.tipo = tipo;
    }

    public void ligarDesligar() {
        ligado = !ligado;
    }

    public boolean isLigado() {
        return ligado;
    }
}