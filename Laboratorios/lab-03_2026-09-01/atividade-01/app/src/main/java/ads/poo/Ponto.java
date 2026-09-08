package ads.poo;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return x + ", " + y;
    }

    public static double getDistancia(Ponto ponto1, Ponto ponto2) {
        return Math.sqrt(Math.pow((ponto2.getX() - ponto1.getX()), 2) + Math.pow((ponto2.getY() - ponto1.getY()), 2));
    }
}