public class MediaArgumentos {
    public static void main(String[] args) {
        if (args.length < 2) {
            IO.println("Quantidade de argumentos inválida. Entre com ao menos 2 notas.");
        } else {
            double media = 0;
            for (int i = 0; i < args.length; i++) {
                    media += Double.parseDouble(args[i]);
            }
            media /= args.length;

            IO.println("A sua nota média nesse semestre é " + String.format("%.0f", Math.round(media)) + ". " + (media >= 6 ? "Você foi aprovado!" : "Voce nâo foi aprovado."));
        }
    }
}