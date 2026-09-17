package ads.poo;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        App programa = new App();
        programa.menu();
    }

    private HashMap<String, Livro> livros = new HashMap<>();

    public void menu() {
        int opcao = 0;
        while (opcao != 8){
            IO.println("* Sistema de Cadastro de Livros *");
            IO.println("""
                    1 - Cadastrar um livro.
                    2 - Listar o título e ISBN de todos os livros cadastrados.
                    3 - Consultar um livro pelo ISBN.
                    4 - Consultar livros por autor.
                    5 - Consultar livros por ano de publicação.
                    6 - Atualizar os dados de um livro.
                    7 - Remover um livro.
                    8 - Sair do sistema.
                    """);
            opcao = Integer.parseInt(IO.readln("Entre com a opção: "));
            switch (opcao) {
                case 1 -> cadastrarLivro();
                case 2 -> IO.println();
                case 3 -> IO.println();
                case 4 -> IO.println();
                case 5 -> IO.println();
                case 6 -> IO.println();
                case 7 -> IO.println();
                default -> IO.println((opcao == 8 ? "Encerrando o programa.\n" : "Valor inválido.\n"));
            }
        }
    }

    public void cadastrarLivro() {
        String titulo = IO.readln("Entre com o titulo do livro: ");
        String autor = IO.readln("Entre com o autor do livro: ");
        int anoPublicacao = Integer.parseInt(IO.readln("Entre com o ano de publicação do livro: "));
        String isbn = IO.readln("Entre com o ISBN (chave de identificação) do livro: ");

        if (livros.containsKey(isbn)) {
            IO.println("ERRO: O ISBN inserido já está sendo utilizado.\n");
        } else {
            Livro livroCadastrado = new Livro(isbn, titulo, autor, anoPublicacao);
            livros.put(livroCadastrado.getIsbn(), livroCadastrado);
            IO.println("Livro cadastrado com êxito.\n");
        }
    }
}
