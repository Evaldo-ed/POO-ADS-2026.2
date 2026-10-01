package ads.poo;

public class App {
    public static void main(String[] args) {
        Retangulo a = new Retangulo(4, 8);
        Motor b = new Motor(200, 4);
        Carro ford = new Carro("Ford", b);

        IO.println("Área do Retângulo: " + a.getArea());

        ford = null;

        Aluno d = new Aluno("Maria", "Maria@gmail.com", new Endereco("Lauro Linhares", "248", "Trindade", "Florianópolis", "SC", "Brasil", "12345-678"));
    }
}