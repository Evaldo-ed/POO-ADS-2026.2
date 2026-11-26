package ads.poo;

import ads.poo.exception.SaldoInsuficienteException;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        Usuario u = new Usuario(1, "Pedro");

        b.adicionarLivro(new Livro(1, "A"));
        b.adicionarLivro(new Livro(2, "B"));
        b.adicionarLivro(new Livro(3, "C"));
        b.adicionarLivro(new Livro(4, "D"));

        /*Conta conta = new Conta(100);

        try {
            conta.saque(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        ArrayList<String> a = new ArrayList<>();*/

        /*int a, b;

        try {
            a = Integer.parseInt(IO.readln("Entre com um número: "));
            b = Integer.parseInt(IO.readln("Entre com um número: "));

            int res = a / b;

            System.out.println(String.format("%d / %d = %d", a, b, res));
        } catch(NumberFormatException e) {
            System.err.println("Somente números inteiros são permitidos.");
        } catch(ArithmeticException e) {
            System.err.println("Não é possível dividir números inteiros por zero.");
        }
        System.out.println("Fim do programa.");*/
    }
}
