public class MediaMatrizes {
    public static void main(String[] args) {
        double[][] notas = new double[3][3];
        String buffer;
        double media;
        int total;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (j == notas[i].length-1) {
                    media = 0;
                    total = 0;
                    for (int avaliacoes = j-1; avaliacoes >= 0; avaliacoes--) {
                        media += notas[i][avaliacoes];
                        total++;
                    }
                    notas[i][j] = Math.round(media / total);
                }else {
                buffer = IO.readln("Entre com a nota do aluno " + (i+1) + " para a avaliação " + (j+1) + ": ");
                notas[i][j] = Double.parseDouble(buffer);
                }
            }
        }

        IO.print(String.format("%8s",""));
        for (int j = 1; j < notas[0].length; j++) {
            IO.print(String.format("%5s", "A" + j));
        }
        IO.println(String.format("%8s", "Média"));
        
        for (int i = 0; i < notas.length; i++) {
            IO.print(String.format("%8s", "Aluno " + (i+1)));
            for (int j = 0; j < notas[i].length; j++) {
                if (j == notas[i].length-1) {
                    IO.println(String.format("%8.0f", notas[i][j]));
                } else {
                    IO.print(String.format("%5.0f", notas[i][j]));
                }
            }
        }

        IO.print(String.format("%8s", "Média"));
        for (int j = 0; j < notas[0].length; j++) {
            media = 0;
            total = 0;
            for (int i = 0; i < notas.length; i++) {
                media += notas[i][j];
                total++;
            }
            if (j == notas[0].length-1 ) {
                IO.println(String.format("%8d", Math.round(media / total)));
            } else {
                IO.print(String.format("%5d", Math.round(media / total)));
            }
        }
    }
}