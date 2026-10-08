package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private static final String eR = "^[0-9]+$";
    private String valor;

    public Telefone(String valor) {
        if (valor.matches(eR)) {
            this.valor = valor;
        }
    }

    public void setValor(String valor) {
        if (valor.matches(eR)) {
            this.valor = valor;
        }
    }

    private String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";

        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return resultado;
    }

    public String toString() {
        return formata("(##) #####-####", valor);
    }


}