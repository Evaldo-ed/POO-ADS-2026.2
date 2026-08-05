public class Media {
    public static void main(String[] args) {
        String nome = IO.readln("Entre com o seu nome: ");
        String buffer = IO.readln("Entre com a nota da primeira avaliação: ");
        double av1 = Double.parseDouble(buffer);
        buffer = IO.readln("Entre com a nota da segunda avaliação: ");
        double av2 = Double.parseDouble(buffer);

        double media = Math.round((av1 + av2) / 2);
        IO.println("Olá " + nome + ", a sua nota média nesse semestre é " + String.format("%.0f", media) + ". " + (media >= 6 ? "Você foi aprovado!" : "Você não foi aprovado."));
    }
}