package ads.poo;

import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nome;
    private ArrayList<Emprestimo> livrosEmprestados = new ArrayList<>();

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void pegarLivroEmprestado(Livro livro) {
        int totalEmprestimosAtivos = 0;
        for (Emprestimo emprestimo : livrosEmprestados) {
            if (emprestimo.getCondicaoAtual() == CondicaoLivro.ATIVO) {
                totalEmprestimosAtivos++;
                if (totalEmprestimosAtivos == 3) {
                    //
                }
            }
        }
        livrosEmprestados.add(new Emprestimo(this, livro));
    }


    public void retornarLivro(Emprestimo livroEmprestado) {
        livrosEmprestados.forEach(emprestimo -> {
            if (emprestimo == livroEmprestado && emprestimo.getCondicaoAtual() == CondicaoLivro.ATIVO) {
                emprestimo.setCondicaoAtual(CondicaoLivro.INATIVO);
            }
        });
        //
    }

    public ArrayList<Emprestimo> listarEmprestimos() {
        return livrosEmprestados;
    }
}