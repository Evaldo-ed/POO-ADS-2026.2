package ads.poo;

public class App {
    public static void main(String[] args) {
        Retangulo a = new Retangulo();
        Retangulo b = new Retangulo("UTF8", 8, 5);
        Retangulo c = new Retangulo("String Inválida", 0, -4);

        IO.println("* Retângulo A *" + "\nCodificação: " + a.getCodificacao() + "\nLargura: " + a.getLargura() + "\nAltura:" + a.getAltura() + "\n");
        IO.println("* Retângulo B *" + "\nCodificação: " + b.getCodificacao() + "\nLargura: " + b.getLargura() + "\nAltura:" + b.getAltura() + "\n");
        IO.println("* Retângulo C *" + "\nCodificação: " + c.getCodificacao() + "\nLargura: " + c.getLargura() + "\nAltura:" + c.getAltura() + "\n");

        IO.println("Área do retângulo A: " + a.getArea());
        IO.println("Perímetro do retângulo A: " + a.getPerimetro() + "\n");

        IO.println("Retângulo A: \n" + a.toString() + "\n");
        IO.println("Retângulo B: \n" + b.toString() + "\n");

        c.setCodificacao("UTF8");
        c.setLargura(4);
        c.setAltura(4);
        IO.println("* Retângulo C após alteração de valores *" + "\nCodificação: " + c.getCodificacao() + "\nLargura: " + c.getLargura() + "\nAltura:" + c.getAltura() + "\n");
        IO.println("Retângulo C: \n" + c.toString() + "\n");
    }
}
