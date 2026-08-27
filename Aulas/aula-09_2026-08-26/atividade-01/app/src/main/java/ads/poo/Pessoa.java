package ads.poo;

public class Pessoa {
    private static int total;
    private int id;
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        id = ++total;
        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return String.format("| %3d | %30s | %30s |", id, nome, email);
    }
}