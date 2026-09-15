package ads.poo;

public class App {
    public static void main(String[] args) {
        Robo a = new Robo("Robô-1", 75);
        Robo b = new Robo("Robô-2", 125);
        Robo c = new Robo("Robô-3");

        IO.println("* Robô A *\n" + "Nome: " + a.getNome() + "\nNúmero de série: " + a.getNumeroSerie() + "\nEnergia: " + a.getEnergia() + "\n");
        IO.println("* Robô B *\n" + b.toString() + "\n");
        IO.println("* Robô C *\n" + c.toString() + "\n");

        IO.println("Total de robôs: " + a.getTotal() + "\n");

        IO.println("Energia do robô A após movimento: " + a.movimentar(2));
        IO.println("Energia do robô B após movimento: " + b.movimentar(10));
        IO.println("Energia do robô C após movimento: " + c.movimentar(41));
    }
}