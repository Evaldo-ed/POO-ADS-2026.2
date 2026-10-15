package ads.poo;

import ads.poo.produtos.SemFio;
import ads.poo.produtos.Produto;

public class App {
    public static void main(String[] args) {
        Produto tel = new Produto(135, "1", "Gondola", 40, new Dimensao(1, 3, 5));
        SemFio sf = new SemFio(248, "1", "Nokia", 20, new Dimensao(2, 4, 8), 1.8, 14, 50);

        IO.println("* Telefone *\n" + tel.toString() + "\n");
        IO.println("* Telefone Sem Fio *\n" + sf.toString());

        sf.setNumSerie("2");
    }
}