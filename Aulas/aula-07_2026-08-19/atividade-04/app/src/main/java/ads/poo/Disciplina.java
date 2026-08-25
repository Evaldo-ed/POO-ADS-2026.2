package ads.poo;

public class Disciplina {
    private final int QUANTIDADE_NOTAS = 3;

    private String componenteCurricular;
    private int cargaHoraria;
    private double[] notas = new double[QUANTIDADE_NOTAS];

    public void definirComponenteCurricular(String materia) {
        componenteCurricular = materia;
    }

    public void definirCargaHoraria(int horas) {
        cargaHoraria = horas;
    }

    public void definirNota(int nota, int valor) {
        notas[nota-1] = valor;
    }

    public String obterComponenteCurricular() {
        return componenteCurricular;
    }

    public int obterCargaHoraria() {
        return cargaHoraria;
    }

    public double obterNota(int nota) {
        return notas[nota-1];
    }

    public double obterMedia() {
        double media = 0;
        for (double valor : notas) {
            media += valor;
        }
        media /= notas.length;
        return media;
    }

    public boolean obterAprovação() {
        double media = 0;
        for (double valor : notas) {
            media += valor;
        }
        return (Math.round(media /= notas.length) >= 6);
    }
}