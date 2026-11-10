package ads.poo;

public class Avestruz extends Animal implements Terrestre {

    public Avestruz(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Avestruz grasnou";
    }

    @Override
    public String correr() {
        return "Avestruz correu.";
    }
}