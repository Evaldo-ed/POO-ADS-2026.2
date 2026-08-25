
package ads.poo;

public class App {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina();

        poo.definirComponenteCurricular("Programação Orientada a Objetos");
        poo.definirCargaHoraria(80);

        poo.definirNota(1, 5);
        poo.definirNota(2, 6);
        poo.definirNota(3, 7);

        IO.println("Componente curricular: " + poo.obterComponenteCurricular());
        IO.println("Carga horária: " + poo.obterCargaHoraria() + "h");
        IO.println("Nota 1: " + poo.obterNota(1));
        IO.println("Nota 2: " + poo.obterNota(2));
        IO.println("Nota 3: " + poo.obterNota(3));
        IO.println("Média: " + poo.obterMedia());
        IO.println("Aprovado: " + poo.obterAprovação());
    }
}