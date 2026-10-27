package ads.poo;

public class Aldeao extends Personagem {

    public Aldeao() {
        super (25, 1, 0.8);
    }

    @Override
    public String atacar() {
        return "Aldeão atacou com força " + super.getAtaque() + ".";
    }

    @Override
    public String mover() {
        return "Aldeão moveu " + super.getVelocidade() + (super.getVelocidade() == 1 ? " unidade" : " unidades");
    }
}