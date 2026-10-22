package ads.poo;

public class Cavaleiro extends Personagem {

    public Cavaleiro() {
        super (50, 3, 2);
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacou " + getAtaque() + " força 1.";
    }

    @Override
    public String mover() {
        return "Cavaleiro moveu " + getAtaque() + " unidade(s).";
    }
}