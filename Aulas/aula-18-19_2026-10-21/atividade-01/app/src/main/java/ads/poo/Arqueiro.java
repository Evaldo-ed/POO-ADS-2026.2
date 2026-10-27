package ads.poo;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super (35, 2, 1);
    }

    @Override
    public String atacar() {
        return "Arqueiro atacou com força " + super.getAtaque() + ".";
    }

    @Override
    public String mover() {
        return "Arqueiro moveu " + super.getVelocidade() + (super.getVelocidade() == 1 ? " unidade" : " unidades");
    }
}