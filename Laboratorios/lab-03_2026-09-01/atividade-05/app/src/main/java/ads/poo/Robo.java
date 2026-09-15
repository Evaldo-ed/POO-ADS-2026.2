package ads.poo;

public class Robo {
    private final double CONSUMO_ENERGIA = 2.5;
    private static int total;
    private String nome;
    private int numeroSerie;
    private double energia;

    public Robo(String nome, double energia) {
        this.nome = nome;
        numeroSerie = ++total;
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
        } else {
            this.energia = 100;
        }
    }

    public Robo(String nome) {
        this(nome, 100);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean setEnergia(double energia) {
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public double getEnergia() {
        return energia;
    }

    public int getTotal() {
        return total;
    }

    public String toString() {
        return "Nome: " + nome + "\nNumero de série: " + numeroSerie +"\nEnergia: " + energia;
    }

    public double movimentar(double unidadeMovimento) {
        if (energia - (unidadeMovimento*CONSUMO_ENERGIA) >= 0) {
            energia -= unidadeMovimento*CONSUMO_ENERGIA;
            return energia;
        } else {
            return -1;
        }
    }
}