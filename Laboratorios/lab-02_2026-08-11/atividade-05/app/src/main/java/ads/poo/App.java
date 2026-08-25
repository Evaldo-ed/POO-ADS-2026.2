package ads.poo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String matriz[] = new String[9];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = leitor.nextLine();
        }

        int asteriscosAdjacentes = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i].charAt(j) == '*') {
                    IO.print("*");
                } else {
                    for (int linhaAdjacente = -1; linhaAdjacente < 2; linhaAdjacente++) {
                        for (int colunaAdjacente = -1; colunaAdjacente < 2; colunaAdjacente++) {
                            if (i+linhaAdjacente < 0 || i+linhaAdjacente > 8) {
                                break;
                            } else if (j+colunaAdjacente < 0 || j+colunaAdjacente > 8) {
                                continue;
                            }
                            if (matriz[(i+linhaAdjacente)].charAt(j+colunaAdjacente) == '*') {
                                asteriscosAdjacentes++;
                            }
                        }
                    }
                    if (asteriscosAdjacentes == 0) {
                        IO.print(".");
                    } else {
                        IO.print(asteriscosAdjacentes);
                        asteriscosAdjacentes = 0;
                    }
                }
            }
            IO.println();
        }
        leitor.close();
    }
}