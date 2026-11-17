package ads.poo;

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
    }
}