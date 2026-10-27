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
        IO.println(c.mover() + "\n");

        Linha d = new Linha("Vermelho", 1, 1, 4, 4);
        Retangulo e = new Retangulo("Verde", 2, 2, 6, 6);
        Circulo f = new Circulo("Azul", 4, 4, 1.5);

        IO.println("- Linha - ");
        IO.println(d.desenhar() + "\n");

        IO.println("- Retangulo - ");
        IO.println(e.desenhar());
        IO.println("Área: " + e.calcularArea());
        IO.println("Perímetro: " + e.calcularPerimetro() + "\n");

        IO.println("- Círculo - ");
        IO.println(f.desenhar());
        IO.println("Área: " + f.calcularArea());
        IO.println("Perímetro: " + f.calcularPerimetro());
        IO.println("Diametro: " + f.calcularDiametro());
    }
}
