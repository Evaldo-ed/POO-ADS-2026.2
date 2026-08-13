package ads.poo;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random r = new Random();
        int numSorteado = r.nextInt(101);
        int tentativas = 1;

        int palpite = Integer.parseInt(IO.readln("Entre com um palpite: "));
        while (palpite != numSorteado) {
            if (palpite > numSorteado) {
                palpite = Integer.parseInt(IO.readln("Palpite incorreto, o número sorteado é menor. Entre com um novo palpite: "));
            }
            if (palpite < numSorteado) {
                palpite = Integer.parseInt(IO.readln("Palpite incorreto, o número sorteado é maior. Entre com um novo palpite: "));
            }
            tentativas++;
        }

        IO.println("Parábens, você acertou!");
        IO.println("Número de tentativas: " + tentativas);
    }
}