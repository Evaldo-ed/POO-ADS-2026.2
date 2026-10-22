package ads.poo;

public class Personagem {
    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String atacar() {
        return "";
    }

    public String mover() {
        return "";
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public double getVelocidade() {
        return velocidade;
    }
}