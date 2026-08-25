package ads.poo;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random r = new Random();
        boolean[][] matrizAsteriscos = new boolean[9][9];
        int quantidade = 0;

        while (quantidade < 10) {
            int posicaoI = r.nextInt(10);
            int posicaoJ = r.nextInt(10);
            for (int i = 0; i < matrizAsteriscos.length; i++) {
                for (int j = 0; j < matrizAsteriscos[i].length; j++) {
                    if (posicaoI == i && posicaoJ == j & matrizAsteriscos[i][j] == false) {
                        matrizAsteriscos[i][j] = true;
                        quantidade++;
                    }
                }
            }
        }

        for (int i = 0; i < matrizAsteriscos.length; i++) {
            for (int j = 0; j < matrizAsteriscos[i].length; j++) {
                if (matrizAsteriscos[i][j] == true) {
                    IO.print("*");
                } else {
                    IO.print(".");
                }
            }
        IO.println();
        }
    }
}