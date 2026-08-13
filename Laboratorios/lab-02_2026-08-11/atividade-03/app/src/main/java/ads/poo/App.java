package ads.poo;

public class App {
    public static void main(String[] args) {
        int dimensaoX = Integer.parseInt(args[1]);

        if (args[0].equals("triangulo")) {
            IO.println("java AsciiArt triângulo " + dimensaoX + "\n");
            for (int i = 0; i < dimensaoX; i++) {
                IO.println("*".repeat(i));
            }
        } else if (args[0].equals("losango")) {
            boolean ehPar = false;
            int linhasTotais = dimensaoX;
            while (linhasTotais != 0) {
                linhasTotais/=2;
                if (linhasTotais == 1) {
                    break;
                }
            }
            if (linhasTotais == 1) {
                ehPar = true;
            }

            IO.println("java AsciiArt losângo " + dimensaoX + "\n");
            int espacoVazio = dimensaoX/2 - ((ehPar) ? 1 : 0);
            int asteriscos = 1;
            int linha = 1;
            for (int i = 0; i < dimensaoX; i++) {
                IO.print(" ".repeat(espacoVazio));
                IO.println("*".repeat(asteriscos));

                if (linha <= dimensaoX/2 && espacoVazio != 0) {
                    espacoVazio--;
                    asteriscos+=2;
                } else if (linha > dimensaoX/2) {
                    espacoVazio++;
                    asteriscos-=2;
                }
                linha++;
            }
        } else if (args[0].equals("retangulo")) {
            if (args.length < 3) {
                IO.println("Quantidade de argumentos inválida para o formato retângulo. Entre tanto com a dimensão X quanto com a dimensão Y, respectivamente.");
            } else {
                int dimensaoY = Integer.parseInt(args[2]);
                IO.println("java AsciiArt retângulo " + dimensaoX + " " + dimensaoY + "\n");
                IO.println("*".repeat(dimensaoX));
                int espacoVazio = dimensaoX-2;

                for (int i = 0; i < dimensaoY-2; i++) {
                    IO.print("*");
                    IO.print(" ".repeat(espacoVazio));
                    IO.println("*");
                }

                IO.println("*".repeat(dimensaoX));
            }
        } else {
            IO.println("Formato inválido. Para o primeiro argumento, entre com \"triangulo\", \"losango\" ou \"retangulo\".");
        }
    }
}