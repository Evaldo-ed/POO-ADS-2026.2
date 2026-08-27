package ads.poo;

public class App {
    public static void main(String[] args) {
        App programa = new App();
        programa.menu();
    }

    private Pessoa[] banco = new Pessoa[100];
    private int total;

    public void menu() {
        int opcao = 0;
        while (opcao != 4) {
            IO.println("* Painel de Controle *");
            IO.println(""" 
                1 - Cadastrar nova pessoa.
                2 - Listar todas as pessoas.
                3 - Imprimir dados de uma pessoa.
                4 - Sair.
                """);
            opcao = Integer.parseInt(IO.readln("Entre com a opção: "));
            switch(opcao) {
                case 1 -> cadastrar();
                case 2 -> ListarTodos();
                case 3 -> ImprimirDados();
                default -> IO.println((opcao != 4) ? "Valor inválido." : "Encerrando o programa.");
            }
        }
    }

    public void cadastrar() {
        String nome = IO.readln("Entre com o nome: ");
        String email = IO.readln("Entre com o email: ");
        banco[total] = new Pessoa(nome, email);
        total++;
        IO.println("Operação realizada com êxito.");
        IO.println();
    }

    public void ListarTodos() {
        IO.println("+-----+" + "-".repeat(32) + "+" + "-".repeat(32) + "+");
        for (int i = 0; i < total; i++) {
            IO.println(banco[i].toString());
        }
        IO.println("+-----+" + "-".repeat(32) + "+" + "-".repeat(32) + "+");
        IO.println();
    }

    public void ImprimirDados() {
        int pessoa = Integer.parseInt(IO.readln("Entre com o ID da pessoa desejada: "));
        if (pessoa >= 1 && banco[pessoa-1] != null) {
            IO.println("- Pessoa " + pessoa + " -");
            IO.println("Nome: " + banco[pessoa - 1].getNome());
            IO.println("Email: " + banco[pessoa - 1].getEmail());
        } else {
            IO.println("ID inválido");
        }
        IO.println();
    }
}
