package ads.poo;

public class Motor {
    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor() {
        hp = 200;
        giroAtual = 0;
        cilindros = 4;
    }

    public void acelerar(int v) {
        giroAtual += v;
    }
}