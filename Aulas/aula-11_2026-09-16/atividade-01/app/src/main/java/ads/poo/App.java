package ads.poo;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();

        mapa.put("123", "Juca");
        mapa.put("456", "Ana");
        mapa.put("789", "Pedro");

        String nome = mapa.get("147");
        if (nome == null){
            IO.println("Nome não encontrado.\n");
        } else {
            IO.println(nome + "\n");
        }

        mapa.forEach((chave, valor) -> IO.println("Chave: " + chave + ", valor: " + valor));
        IO.println();

        mapa.put("789", "Paulo");
        for(var elemento : mapa.entrySet()) {
            IO.println("Chave: " + elemento.getKey());
            IO.println("Valor: " + elemento.getValue());
        }
        IO.println();

        mapa.remove("456"); // Remoção pela chave
        mapa.values().removeIf(e -> e.equals("Juca")); // Remove todos com valor igual "Juca"
        mapa.forEach((chave, valor) -> IO.println("Chave: " + chave + ", valor: " + valor));
    }
}