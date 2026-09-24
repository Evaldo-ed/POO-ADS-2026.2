package ads.poo;

public class Carro {
    private String marca;
    private Motor propulsor;

    public Carro() {
        marca = "Ford";
        propulsor = new Motor();
    }

    public void acelerar(int v) {
        propulsor.acelerar(v);
    }
}