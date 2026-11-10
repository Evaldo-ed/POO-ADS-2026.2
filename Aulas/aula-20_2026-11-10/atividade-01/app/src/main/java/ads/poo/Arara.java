package ads.poo;

public class Arara extends Animal implements Aereo {

    public Arara(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Arara falou";
    }

    @Override
    public String voar() {
        return "Arara voou.";
    }
}