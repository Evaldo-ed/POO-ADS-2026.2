package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public boolean addContato(Contato contato) {
        if (contatos.contains(contato)) {
            return false;
        }
        contatos.add(contato);
        return true;
    }

}