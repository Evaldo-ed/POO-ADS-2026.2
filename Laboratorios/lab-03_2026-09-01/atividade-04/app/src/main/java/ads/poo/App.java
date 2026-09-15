package ads.poo;

public class App {
    public static void main(String[] args) {
        Data a = new Data();
        Data b = new Data(16, 4, 2012);
        Data c = new Data(24, 8, 2020);
        Data d = new Data(29, 2, 2025); //Data inválida, fevereiro possui apenas 28 dias em 2025.

        IO.println("Data A: " + String.format("%02d", a.getDia()) + "/" + String.format("%02d", a.getMes()) + "/" + String.format("%04d", a.getAno()));
        IO.println("Data B: " + b.toString());
        IO.println("Data C: " + c.toString());
        IO.println("Data D: " + d.dataPorExtenso());

        d.setDia(15);
        d.setMes(10);
        d.setAno(2024);
        IO.println("Data D após alteração de valores: " + d.toString());
        
        IO.println("Diferença em dias entre data A e data B: " + a.diferencaData(b));
        IO.println("Diferença em dias entre data C e data D: " + c.diferencaData(d));
    }
}
