package ads.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private HashMap<String, Telefone> telefones = new HashMap<>();
    private HashMap<String, Email> emails = new HashMap<>();




    public Contato(String nome, String sobrenome, LocalDate dN) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        dataNasc = dN;
    }

    public Boolean addTelefone(String rotulo, String valor) {
        if (telefones.containsKey(rotulo)) {
            return false;
        }

        Telefone novoTelefone = new Telefone(valor);
        if (novoTelefone.toString().equals("")) {
            return false;
        }

        telefones.put(rotulo, novoTelefone);
        return true;
    }

    public Boolean addEmail(String rotulo, String valor) {
        if (emails.containsKey(rotulo)) {
            return false;
        }

        Email novoEmail = new Email(valor);
        if (novoEmail.toString().equals("")) {
            return false;
        }

        emails.put(rotulo, novoEmail);
        return true;
    }

    public boolean removeTelefone(String rotulo) {
        if (telefones.containsKey(rotulo)) {
            telefones.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean removeEmail(String rotulo) {
        if (emails.containsKey(rotulo)) {
            emails.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String valor) {
        if (telefones.containsKey(rotulo)) {
            telefones.get(rotulo).setValor(valor);
            return true;
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String valor) {
        if (emails.containsKey(rotulo)) {
            emails.get(rotulo).setValor(valor);
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome);
        sb.append("\nSobrenome: ").append(sobrenome);
        sb.append("\nData de nascimento:").append(dataNasc);
        sb.append("\nTelefones:");
        this.telefones.forEach((r,v) -> {
            sb.append("\n").append(r).append(":").append(v);
        });
        sb.append("\nE-mails:");
        this.emails.forEach((r,v) -> {
            sb.append("\n").append(r).append(":").append(v);
        });

        return sb.toString();
    }
}