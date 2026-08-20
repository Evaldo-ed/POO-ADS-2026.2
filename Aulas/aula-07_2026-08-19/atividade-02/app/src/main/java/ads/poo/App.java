package ads.poo;

public class App {
    public static void main(String[] args) {
        Personagem player = new Personagem();

        player.definirNome(IO.readln("Entre com o nome do personagem: "));
        player.definirMaxHP(Integer.parseInt(IO.readln("Entre com o HP máximo do personagem: ")));
        player.definirMaxMP(Integer.parseInt(IO.readln("Entre com o MP máximo do personagem: ")));

        String buffer = "N";
        while (!(buffer.equalsIgnoreCase("sair"))) {

            IO.println();
            IO.println(String.format("%52s","*Painel de teste*"));
            IO.println("Entre com 1 para aumentar o HP de " + player.obterNome() + ". (Obs: Não é possível ir acima do HP máximo)");
            IO.println("Entre com 2 para aumentar o MP de " + player.obterNome() + ". (Obs: Não é possível ir acima do MP máximo)");
            IO.println("Entre com 3 para reduzir o HP de " + player.obterNome() + ". (Obs: Não é possível ir abaixo de 0))");
            IO.println("Entre com 4 para reduzir o MP de " + player.obterNome() + ". (Obs: Não é possível ir abaixo de 0))");
            IO.println("Entre com 5 para incrementar o level de " + player.obterNome() + ". (Obs: Cada level restaura os status do personagem e aumenta HP máximo e MP máximo por 20%)");
            IO.println("Entre com 6 para imprimir o level e as quantidades atuais de HP de MP de " + player.obterNome() + ".");
            buffer = IO.readln("Entre com a opção desejada, ou digite \"sair\" para encerrar o programa: ");
            IO.println();

            switch(buffer) {
                case "1":
                    buffer = IO.readln("Entre com o valor desejado: ");
                    player.aumentarHP(Integer.parseInt(buffer));
                    IO.println("Operação realizada com êxito.");
                    break;
                case "2":
                    buffer = IO.readln("Entre com o valor desejado: ");
                    player.aumentarMP(Integer.parseInt(buffer));
                    IO.println("Operação realizada com êxito.");
                    break;
                case "3":
                    buffer = IO.readln("Entre com o valor desejado: ");
                    player.reduzirHP(Integer.parseInt(buffer));
                    IO.println("Operação realizada com êxito.");
                    break;
                case "4":
                    buffer = IO.readln("Entre com o valor desejado: ");
                    player.reduzirMP(Integer.parseInt(buffer));
                    IO.println("Operação realizada com êxito.");
                    break;
                case "5":
                    player.incrementarLevel();
                    IO.println("Operação realizada com êxito.");
                    break;
                case "6":
                    IO.println("Level atual: " + player.obterLevel());
                    IO.println("HP atual: " + player.obterHP() + "/" + player.obterMaxHP());
                    IO.println("MP atual: " + player.obterMP() + "/" + player.obterMaxMP());
                    break;
                default:
                    if (!(buffer.equalsIgnoreCase("sair"))) {
                        IO.println("Valor inválido.");
                    }
            }
        }
    }
}
