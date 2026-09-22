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
                case 2 -> listarTodos();
                case 3 -> consultarPorISBN();
                case 4 -> consultarPorAutor();
                case 5 -> consultarPorAno();
                case 6 -> atualizarDados();
                case 7 -> removerLivro();
                default -> IO.println((opcao == 8 ? "Encerrando o programa." : "Valor inválido."));
            }
        }
    }

    public void cadastrarLivro() {
        String titulo = IO.readln("Entre com o titulo do livro: ");
        String autor = IO.readln("Entre com o autor do livro: ");
        int anoPublicacao = Integer.parseInt(IO.readln("Entre com o ano de publicação do livro: "));
        String isbn = IO.readln("Entre com o ISBN (chave de identificação) do livro: ");

        if (livros.containsKey(isbn)) {
            IO.println("ERRO: O ISBN inserido já está sendo utilizado.");
        } else {
            Livro livroCadastrado = new Livro(isbn, titulo, autor, anoPublicacao);
            livros.put(livroCadastrado.getIsbn(), livroCadastrado);
            IO.println("Livro cadastrado com êxito.");
        }
        IO.println();
    }

    public void listarTodos() {
        IO.println("+" + "-".repeat(19) + "+" + "-".repeat(65) + "+");
        for (Livro elemento : livros.values()) {
            IO.println(elemento.listarLivro());
        }
        IO.println("+" + "-".repeat(19) + "+" + "-".repeat(65) + "+");
        IO.println();
    }

    public void consultarPorISBN() {
        String isbn = IO.readln("Entre com o ISBN do livro desejado: ");
        if (livros.containsKey(isbn)) {
            Livro livro = livros.get(isbn);
            IO.println("Título: " + livro.getTitulo());
            IO.println("Autor: " + livro.getAutor());
            IO.println("Ano de publicação: " + livro.getAnoPublicacao());
        } else {
            IO.println("ERRO: O ISBN inserido não corresponde a um livro.");
        }
        IO.println();
    }

    public void consultarPorAutor() {
        String autor = IO.readln("Entre com o autor: ");
        int total = 0;
            for (Livro elemento : livros.values()) {
                if (elemento.getAutor().equals(autor)) {
                    if (total == 0) {
                        IO.println("Livros escritos por " + autor + ":");
                    }
                    IO.println("Título: " + elemento.getTitulo() + ", ISBN: " + elemento.getIsbn());
                    total++;
                }
            }
        if (total == 0) {
            IO.println("ERRO: O autor inserido não está cadastrado.");
        }
        IO.println();
    }

    public void consultarPorAno() {
        int ano = Integer.parseInt(IO.readln("Entre com o ano: "));
        int total = 0;
        for (Livro elemento : livros.values()) {
            if (elemento.getAnoPublicacao() == ano) {
                if (total == 0) {
                    IO.println("Livros publicados em " + ano + ":");
                }
                IO.println("Título: " + elemento.getTitulo() + ", ISBN: " + elemento.getIsbn());
                total++;
            }
        }
        if (total == 0) {
            IO.println("ERRO: Não há livros cadastrados com este ano de publicação.");
        }
        IO.println();
    }

    public void atualizarDados() {
        String isbn = IO.readln("Entre com o ISBN do livro a ser atualizado: ");
        String buffer;
        if (livros.containsKey(isbn)) {
            Livro livro = livros.get(isbn);
            if (livro != null) {
                buffer = IO.readln("Entre com o título atualizado do livro: ");
                livro.setTitulo(buffer);
                buffer = IO.readln("Entre com o autor atualizado do livro: ");
                livro.setAutor(buffer);
                buffer = IO.readln("Entre com o ano de publicação atualizado do livro: ");
                livro.setAnoPublicacao(Integer.parseInt(buffer));
            }
        } else {
            IO.println("ERRO: O ISBN inserido não corresponde a um livro.");
        }
        IO.println();
    }

    public void removerLivro() {
        String isbn = IO.readln("Entre com o ISBN do livro a ser removido: ");
        if (livros.containsKey(isbn)) {
            livros.remove(isbn);
            IO.println("Livro removido com êxito.");
        } else {
            IO.println("ERRO: O ISBN  inserido não corresponde a um livro.");
        }
        IO.println();
    }
}