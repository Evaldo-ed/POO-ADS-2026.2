package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private final int MAX_TRIPULANTES = 10;
    private final int MAX_PASSAGEIROS = 100;
    private final int MAX_MOTORES = 8;
    private final double MAX_COMBUSTIVEL = 2000;
    private int tripulantes;
    private int passageiros;
    private int numeroMotores;
    private double combustivel;
    private ArrayList<MotorAviao> motores;

    public Aviao(int tripulantes, int passageiros, double combustivel, int numeroMotores) {
        this.motores = new ArrayList<>();
        if (tripulantes >= 0 && tripulantes <= MAX_TRIPULANTES) {
            this.tripulantes = tripulantes;
        } else {
            this.tripulantes = 0;
        }
        if (passageiros >= 0 && passageiros <= MAX_PASSAGEIROS) {
            this.passageiros = passageiros;
        } else {
            this.passageiros = 0;
        }
        if (combustivel >= 0 && combustivel <= MAX_COMBUSTIVEL) {
            this.combustivel = combustivel;
        } else {
            this.combustivel = 0;
        }
        if (numeroMotores >= 1 && numeroMotores <= MAX_MOTORES) {
            for (int i = 0; i < numeroMotores; i++) {
                this.motores.add(new MotorAviao());
            }
        } else {
            this.motores.add(new MotorAviao());
        }
    }
}