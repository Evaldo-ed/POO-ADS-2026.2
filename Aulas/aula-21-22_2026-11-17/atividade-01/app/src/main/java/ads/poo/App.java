package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Disciplina> disciplinas = new ArrayList<>();

        disciplinas.add(new Disciplina("POO", new DiaDaSemana[]{DiaDaSemana.TERCA, DiaDaSemana.QUARTA}));
        disciplinas.add(new Disciplina("RCO", new DiaDaSemana[]{DiaDaSemana.SEGUNDA, DiaDaSemana.QUINTA}));
        disciplinas.add(new Disciplina("FEI", new DiaDaSemana[]{DiaDaSemana.TERCA, DiaDaSemana.SEXTA}));

        disciplinas.forEach(disciplina -> {
            DiaDaSemana[] diasAula = disciplina.getDiasAula();
            for (DiaDaSemana diaAula : diasAula) {
                if (diaAula.equals(DiaDaSemana.TERCA)) {
                    IO.println(disciplina);
                    break;
                };
            }
        });

        ArrayList<Carta> baralho = new ArrayList<>();

        for (CartaNaipe naipe : CartaNaipe.values()) {
            for (CartaValor valor : CartaValor.values()) {
                baralho.add(new Carta(naipe, valor));
            }
        }

        Draw draw = new Draw();
        draw.setCanvasSize(800, 800);
        draw.setXscale(0, 800);
        draw.setYscale(0, 800);

        CartaGrafica c = new CartaGrafica(CartaNaipe.COPAS, CartaValor.TRES, 400, 400);
        c.desenhar(draw);
    }
}