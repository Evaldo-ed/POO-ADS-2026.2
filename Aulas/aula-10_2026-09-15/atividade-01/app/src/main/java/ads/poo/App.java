package ads.poo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Pessoa> agenda = new ArrayList<>();

        agenda.add(new Pessoa("Juca", "juca@example.org"));
        agenda.add(new Pessoa("Ana", "ana@example.org"));
        agenda.add(new Pessoa("Pedro", "pedro@example.org"));
        agenda.add(new Pessoa("Juca", "juca@example.com"));

        Pessoa p = new Pessoa("Juca", "juca@example.org");

        agenda.remove(p);
        agenda.forEach(IO::println);

        IO.println();
        agenda.removeIf(e -> e.getNome().equals("Juca"));
        agenda.forEach(IO::println);

        /*
        ArrayList<String> lista = new ArrayList<>();

        lista.add("POO");
        lista.add("ADS");
        lista.add("IFSC");
        lista.add(1, "SJE");

        IO.println(lista);

        // for i
        for (int i = 0; i < lista.size(); i++) {
            IO.println(lista.get(i));
        }
        IO.println();

        // for each
        for(String e : lista){
            IO.println(e);
        }
        IO.println();

        lista.forEach(e -> IO.println(e));
        IO.println();

        // method reference
        lista.forEach(IO::println);

        lista.removeIf(e -> e.equals("ADS"));

        lista.remove("ADS");
        */
    }
}
