package ads.poo;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        if (!livros.contains(livro)) {
            livros.add(livro);
        } else {
            //
        }
    }

    public void removerLivro(Livro livro) {
        if (livros.contains(livro)) {
            livros.remove(livro);
        } else {
            //
        }
    }

    public void adicionarUsuario(Usuario usuario) {
        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario);
        } else {
            //
        }
    }

    public void removerUsuario(Usuario usuario) {
        if (usuarios.contains(usuario)) {
            usuarios.remove(usuario);
        } else {
            //
        }
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        livros.remove(emprestimo.getLivro());
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        if (emprestimos.contains(emprestimo)) {
            emprestimos.remove(emprestimo);
        } else {
            //
        }
    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
        if (livros.contains(livro)) {
            if (usuarios.contains(usuario)) {
                usuario.pegarLivroEmprestado(livro);
                emprestimos.add(usuario.listarEmprestimos().getLast());
                livros.remove(livro);
            } else {
                //
            }
        } else {
            //
        }
    }

    public void receberLivroEmprestado(Emprestimo emprestimo, Usuario usuario) {
        if (usuarios.contains(usuario)) {
            usuario.retornarLivro(emprestimo);
            emprestimo.setCondicaoAtual(CondicaoLivro.INATIVO);
            livros.add(emprestimo.getLivro());
        } else {
            //
        }
    }

    public ArrayList<Livro> listarLivros() {
        return livros;
    }
}