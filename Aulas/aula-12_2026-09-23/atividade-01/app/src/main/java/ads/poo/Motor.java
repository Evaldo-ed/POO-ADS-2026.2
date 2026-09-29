package ads.poo;

public class Motor {
    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor(int hp, int cilindros) {
        this.hp = hp;
        giroAtual = 0;
        this.cilindros = cilindros;
    }

    public void acelerar(int v) {
        giroAtual += v;
    }
}