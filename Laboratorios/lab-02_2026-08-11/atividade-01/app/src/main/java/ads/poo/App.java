package ads.poo;

public class App {
    public static void main(String[] args) {
        String buffer = IO.readln("Entre com o dia: ");
        int dia = Integer.parseInt(buffer);
        String mes = IO.readln("Entre com o mes: ").toLowerCase();
        String estacao = "N";

        do {
            if (estacao.equals("invalido")) {
                mes = IO.readln("Mes inválido, entre com \"janeiro\", \"fevereiro\", \"março\", \"abril\", \"maio\", \"junho\", \"julho\", \"agosto\", \"setembro\", \"outubro\", \"novembro\" ou \"dezembro\": ");
            }
            estacao = switch (mes) {
                case "janeiro", "fevereiro" -> "Verão";
                case "março" -> (dia < 20 ? "Verão" : "Outono");
                case "abril", "maio" -> "Outono";
                case "junho" -> (dia < 21 ? "Outono" : "Inverno");
                case "julho", "agosto" -> "Inverno";
                case "setembro" -> (dia < 22 ? "Inverno" : "Primavera");
                case "outubro", "novembro" -> "Primavera";
                case "dezembro" -> (dia < 21 ? "Primavera" : "Verão");
                default -> "invalido";
            };
        } while(estacao.equals("invalido"));

        IO.println("Estação do ano: " + estacao + ".");
    }
}