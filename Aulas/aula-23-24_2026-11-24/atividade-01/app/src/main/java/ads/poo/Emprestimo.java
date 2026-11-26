package ads.poo;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private CondicaoLivro condicaoAtual;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        condicaoAtual = CondicaoLivro.ATIVO;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public CondicaoLivro getCondicaoAtual() {
        return condicaoAtual;
    }

    public void setCondicaoAtual(CondicaoLivro condicaoAtual) {
        this.condicaoAtual = condicaoAtual;
    }
}