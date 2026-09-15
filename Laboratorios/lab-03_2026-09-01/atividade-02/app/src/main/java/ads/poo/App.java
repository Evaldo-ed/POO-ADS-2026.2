package ads.poo;

public class App {
    public static void main(String[] args) {
        Horario a = new Horario(8, 30, 15);
        Horario b = new Horario(12, 30);
        Horario c = new Horario(1, 1, 1);

        IO.println("Horário A: " + a.toString());
        IO.println("Horário B: " + b.toString());
        IO.println("Horário C: " + c.toString());

        IO.print("\nHorário A por extenso: ");
        a.imprimirHorarioPorExtenso();
        IO.print("\nHorário B por extenso: ");
        b.imprimirHorarioPorExtenso();
        IO.print("\nHorário C por extenso: ");
        c.imprimirHorarioPorExtenso();
        IO.println("\n");

        IO.println("Diferença em segundos entre horário A e horário B: " + a.diferencaHorario(b));
        IO.println("Diferença em segundos entre horário B e horário C: " + b.diferencaHorario(c));
        IO.println("Diferença em segundos entre horário A e horário C: " + a.diferencaHorario(c));
    }
}