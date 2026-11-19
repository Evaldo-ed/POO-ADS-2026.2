package ads.poo;

public enum CartaNaipe {
    PAUS(1, "p"),
    OUROS(2, "o"),
    COPAS(3, "c"),
    ESPADAS(4, "e");

    private final int id;
    private final String simbolo;

    CartaNaipe(int id, String simbolo) {
        this.id = id;
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}