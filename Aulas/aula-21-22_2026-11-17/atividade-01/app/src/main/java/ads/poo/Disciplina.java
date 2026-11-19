package ads.poo;

public class Disciplina {
    private String sigla;
    private DiaDaSemana[] diasAula;

    public Disciplina(String sigla, DiaDaSemana[] diasAula) {
        this.sigla = sigla;
        this.diasAula = diasAula;
    }

    public String toString() {
        boolean primeiroDia = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Disciplina: ").append(sigla);
        sb.append("\nDias de Aula: ");

        for (DiaDaSemana diaAula : diasAula) {
            if (!primeiroDia) {
                sb.append(", ");
            }
            sb.append(diaAula);
            primeiroDia = false;
        }

        return sb.toString();
    }

    public DiaDaSemana[] getDiasAula() {
        return diasAula;
    }
}