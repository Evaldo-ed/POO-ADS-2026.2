package ads.poo;

public class App {
    public static void main(String[] args) {
        Retangulo a = new Retangulo(4, 8);
        Motor b = new Motor(200, 4);
        Carro ford = new Carro("Ford", b);

        IO.println("Área do Retângulo: " + a.getArea());

        ford = null;

        Aluno d = new Aluno("Maria", "Maria@gmail.com", new Endereco("1", "2", "3", "4", "5", "6", "7"));
    }
}