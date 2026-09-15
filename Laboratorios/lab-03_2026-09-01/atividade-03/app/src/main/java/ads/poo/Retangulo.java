package ads.poo;

public class Retangulo {
    private String codificacao;
    private int largura;
    private int altura;

    public Retangulo(String codificacao, int largura, int altura) {
        if (codificacao.equals("UTF8")) {
            this.codificacao = codificacao;
        } else {
            this.codificacao = "ASCII";
        }

        if (largura > 0) {
            this.largura = largura;
        } else {
            this.largura = 4;
        }
        
        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = 3;
        }
    }

    public Retangulo() {
        this("ASCII", 4, 3);
    }

    public boolean setCodificacao(String codificacao) {
        if (codificacao.equals("ASCII") || codificacao.equals("UTF8")) {
            this.codificacao = codificacao;
            return true;
        } else {
            return false;
        }
    }

    public boolean setLargura(int largura) {
        if (largura > 0) {
            this.largura = largura;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        } else {
            return false;
        }
    }

    public String getCodificacao() {
        return codificacao;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getArea() {
        return (largura * altura);
    }

    public int getPerimetro() {
        return (2 * (largura + altura));
    }

    public String toString() {
        if (codificacao.equals("UTF8")) {
            if (largura >= 2 && altura >= 2) {
            return "\u250c" + "\u2500".repeat(largura-2) + "\u2510\n" +
            ("\u2502" + " ".repeat(largura-2) + "\u2502\n").repeat(altura-2) +
            "\u2514" + "\u2500".repeat(largura-2) + "\u2518";
            } else if (largura == 1 && altura == 1) {
            return "\u25a1";
            } else if (largura > 1) {
            return "\u2500".repeat(largura);
            } else  {
            return "\u2502\n".repeat(altura-1) + "\u2502";
            }
        } else if (largura >= 2 && altura >= 2) {
            return "+" + "-".repeat(largura-2) + "+\n" +
            ("|" + " ".repeat(largura-2) + "|\n").repeat(altura-2) +
            "+" + "-".repeat(largura-2) + "+";
        } else if (largura == 1 && altura == 1) {
            return "+";
        } else if (largura > 1) {
            return "-".repeat(largura);
        } else {
            return "|\n".repeat(altura-1) + "|";
        }
    }
}