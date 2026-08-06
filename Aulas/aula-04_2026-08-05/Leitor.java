import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()) {
        String[] alunoeNotas = leitor.nextLine().split(",");
        double media = 0;

        for (int i = 1; i < alunoeNotas.length; i++) {
            media += Double.parseDouble(alunoeNotas[i]);
        }
        media /= alunoeNotas.length-1;
        
        IO.println("Aluno: \"" + alunoeNotas[0] + "\". Status: " + (Math.round(media) >= 6 ? "Aprovado." : "Reprovado."));
        }

        leitor.close();
    }
}