package ads.poo;

public class Aldeao extends Personagem {

    public Aldeao() {
        super (25, 1, 0.8);
    }

    @Override
    public String atacar() {
        return "Aldeão atacou " + this.getAtaque() + " força 1.";
    }

    @Override
    public String mover() {
        return "Aldeão moveu " + super.getAtaque() + " unidade(s).";
    }
}