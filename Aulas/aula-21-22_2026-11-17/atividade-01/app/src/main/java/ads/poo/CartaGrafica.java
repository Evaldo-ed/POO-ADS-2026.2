package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta {
    private double posX;
    private double posY;

    public CartaGrafica(CartaNaipe naipe, CartaValor valor, double posX, double posY) {
        super(naipe, valor);
        this.posX = posX;
        this.posY = posY;
    }

    public String nomeDaImagem() {
        return super.getValor().getSimbolo() + super.getNaipe().getSimbolo()+".png";
    }

    public void desenhar (Draw draw) {
        draw.picture(posX, posY, "cartas/"+nomeDaImagem());
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}