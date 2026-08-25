package ads.poo;

public class App {
    public static void main(String[] args) {
        Batedeira bat = new Batedeira();
        IO.println(bat.obterEstado());
        IO.println(bat.obterVelocidade());

        bat.ligar();
        IO.println(bat.obterEstado());
        IO.println(bat.obterVelocidade());

        bat.definirVelocidade(3);
        IO.println(bat.obterVelocidade());

        bat.aumentarVelocidade();
        IO.println(bat.obterVelocidade());

        bat.reduzirVelocidade();
        IO.println(bat.obterVelocidade());

        bat.desligar();
        IO.println(bat.obterEstado());
        IO.println(bat.obterVelocidade());
    }
}
