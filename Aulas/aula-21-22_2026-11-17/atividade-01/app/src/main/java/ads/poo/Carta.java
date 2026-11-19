package ads.poo;

public class Carta {
    private CartaNaipe naipe;
    private CartaValor valor;

    public Carta(CartaNaipe naipe, CartaValor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(valor.getSimbolo());
        sb.append(naipe.getSimbolo());
        return sb.toString();
    }

    public CartaNaipe getNaipe() {
        return naipe;
    }

    public CartaValor getValor() {
        return valor;
    }
}