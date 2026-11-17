package ads.poo;

public enum DiaDaSemana {
    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda-feira"),
    TERCA(3, "Terça-feira"),
    QUARTA(4, "Quarta-feira"),
    QUINTA(5, "Quinta-feira"),
    SEXTA(6, "Sexta-feira"),
    SABADO(7, "Sábado");

    public final int codigo;
    public final String extenso;

    DiaDaSemana(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }

    public String toString() {
        return extenso;
    }
}