package ads.poo;

public class Personagem {
    private String nome;
    private int level = 1;
    private int maxHp;
    private int hp;
    private int maxMp;
    private int mp;

    public void definirNome(String buffer) {
        nome = buffer;
    }

    public void definirMaxHP(int valor) {
        maxHp = valor;
        hp = maxHp;
    }

    public void definirMaxMP(int valor) {
        maxMp = valor;
        mp = maxMp;
    }

    public void incrementarLevel() {
        level++;
        maxHp *= 1.20;
        hp = maxHp;
        maxMp *= 1.20;
        mp = maxMp;
    }

    public void reduzirHP(int valor) {
        hp = Math.max(hp - valor, 0);
    }

    public void aumentarHP(int valor) {
        hp = Math.min(hp + valor, maxHp);
    }

    public void reduzirMP(int valor) {
        mp = Math.max(mp - valor, 0);
    }

    public void aumentarMP(int valor) {
        mp = Math.min(mp + valor, maxMp);
    }

    public String obterNome() {
        return nome;
    }

    public int obterLevel() {
        return level;
    }

    public int obterMaxHP() {
        return maxHp;
    }

    public int obterHP() {
        return hp;
    }

    public int obterMaxMP() {
        return maxMp;
    }

    public int obterMP() {
        return mp;
    }
}
