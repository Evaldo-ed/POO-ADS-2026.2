package ads.poo;

public class App {
    public static void main(String[] args) {
        Aldeao a = new Aldeao();
        Arqueiro b = new Arqueiro();
        Cavaleiro c = new Cavaleiro();

        IO.println("- Aldeão - ");
        IO.println(a.atacar());
        IO.println(a.mover() + "\n");

        IO.println("- Arqueiro - ");
        IO.println(b.atacar());
        IO.println(b.mover() + "\n");

        IO.println("- Cavaleiro - ");
        IO.println(c.atacar());
        IO.println(c.mover());
    }
}
