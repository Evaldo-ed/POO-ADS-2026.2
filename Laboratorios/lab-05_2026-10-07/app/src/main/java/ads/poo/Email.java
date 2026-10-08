package ads.poo;

public class Email {
    private static final String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private String valor;

    public Email(String valor) {
        if (valor.matches(eR)) {
            this.valor = valor;
        }
    }

    public void setValor(String valor) {
        if (valor.matches(eR)) {
            this.valor = valor;
        }
    }

    public String toString() {
        return (valor);
    }
}