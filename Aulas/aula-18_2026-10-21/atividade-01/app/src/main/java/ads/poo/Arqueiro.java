package ads.poo;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super (35, 2, 1);
    }

    @Override
    public String atacar() {
        return "Arqueiro atacou " + getAtaque() + " força 1.";
    }

    @Override
    public String mover() {
        return "Arqueiro moveu " + getAtaque() + " unidade(s).";
    }
}