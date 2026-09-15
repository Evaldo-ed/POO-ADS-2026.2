package ads.poo;

public class Horario {
    private int horas;
    private int minutos;
    private int segundos;

    public Horario(int horas, int minutos, int segundos) {
        if (horas < 24 && horas >= 0) {
            this.horas = horas;
        } else {
            this.horas = 0;
        }
        if (minutos < 60 && minutos >= 0) {
            this.minutos = minutos;
        } else {
            this.minutos = 0;
        }
        if (segundos < 60 && segundos >= 0) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }

    public Horario(int horas, int minutos) {
        this(horas, minutos, 0);
    }

    public Horario(int horas) {
        this(horas, 0, 0);
    }

    public boolean setHoras(int horas) {
        if (horas < 24 && horas >= 0) {
            this.horas = horas;
            return true;
        } else {
            return false;
        }
    }

    public boolean setMinutos(int minutos) {
        if (minutos < 60 && minutos >= 0) {
            this.minutos = minutos;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSegundos(int segundos) {
        if (segundos < 60 && segundos >= 0) {
            this.segundos = segundos;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public void imprimirHorarioPorExtenso() {
        if (horas > 0) {
            switch (horas) {
                case 10 -> IO.print("dez horas");
                case 11 -> IO.print("onze horas");
                case 12 -> IO.print("doze horas");
                case 13 -> IO.print("treze horas");
                case 14 -> IO.print("catorze horas");
                case 15 -> IO.print("quinze horas");
                case 16, 17 -> IO.print("dezes");
                case 18 -> IO.print("dez");
                case 19 -> IO.print("deze");
                case 20 -> IO.print("vinte horas");
                case 21, 22, 23 -> IO.print("vinte e ");
            }
            if (!(horas >= 10 && horas <= 15)) {
                switch (horas%10) {
                    case 1 -> IO.print("uma hora" + (horas/10 > 0 ? "s" : ""));
                    case 2 -> IO.print("duas horas");
                    case 3 -> IO.print("três horas");
                    case 4 -> IO.print("quatro horas");
                    case 5 -> IO.print("cinco horas");
                    case 6 -> IO.print("seis horas");
                    case 7 -> IO.print("sete horas");
                    case 8 -> IO.print("oito horas");
                    case 9 -> IO.print("nove horas");
                }
            }
        }
        if (horas > 0 && minutos > 0 && segundos > 0) {
            IO.print(", ");
        } else if (horas > 0 && minutos > 0) {
            IO.print(" e ");
        }
        if (minutos > 0) {
            switch (minutos) {
                case 10 -> IO.print("dez minutos");
                case 11 -> IO.print("onze minutos");
                case 12 -> IO.print("doze minutos");
                case 13 -> IO.print("treze minutos");
                case 14 -> IO.print("catorze minutos");
                case 15 -> IO.print("quinze minutos");
                case 16, 17 -> IO.print("dezes");
                case 18 -> IO.print("dez");
                case 19 -> IO.print("deze");
                case 20 -> IO.print("vinte minutos");
                case 21, 22, 23, 24, 25, 26, 27, 28, 29 -> IO.print("vinte e ");
                case 30 -> IO.print("trinta minutos");
                case 31, 32, 33, 34, 35, 36, 37, 38, 39 -> IO.print("trinta e ");
                case 40 -> IO.print("quarenta minutos");
                case 41, 42, 43, 44, 45, 46, 47, 48, 49 -> IO.print("quarenta e ");
                case 50 -> IO.print("cinquenta minutos");
                case 51, 52, 53, 54, 55, 56, 57, 58, 59 -> IO.print("cinquenta e ");
            }
            if (!(minutos >= 10 && minutos <= 15)) {
                switch (minutos%10) {
                    case 1 -> IO.print("um minuto" + (minutos/10 > 0 ? "s" : ""));
                    case 2 -> IO.print("dois minutos");
                    case 3 -> IO.print("três minutos");
                    case 4 -> IO.print("quatro minutos");
                    case 5 -> IO.print("cinco minutos");
                    case 6 -> IO.print("seis minutos");
                    case 7 -> IO.print("sete minutos");
                    case 8 -> IO.print("oito minutos");
                    case 9 -> IO.print("nove minutos");
                }
            }
        }
        if ((horas > 0 || minutos > 0) && segundos > 0) {
            IO.print(" e ");
        }
        if (segundos > 0) {
            switch (segundos) {
                case 10 -> IO.print("dez segundos");
                case 11 -> IO.print("onze segundos");
                case 12 -> IO.print("doze segundos");
                case 13 -> IO.print("treze segundos");
                case 14 -> IO.print("catorze segundos");
                case 15 -> IO.print("quinze segundos");
                case 16, 17 -> IO.print("dezes");
                case 18 -> IO.print("dez");
                case 19 -> IO.print("deze");
                case 20 -> IO.print("vinte segundos");
                case 21, 22, 23, 24, 25, 26, 27, 28, 29 -> IO.print("vinte e ");
                case 30 -> IO.print("trinta segundos");
                case 31, 32, 33, 34, 35, 36, 37, 38, 39 -> IO.print("trinta e ");
                case 40 -> IO.print("quarenta segundos");
                case 41, 42, 43, 44, 45, 46, 47, 48, 49 -> IO.print("quarenta e ");
                case 50 -> IO.print("cinquenta segundos");
                case 51, 52, 53, 54, 55, 56, 57, 58, 59 -> IO.print("cinquenta e ");
            }
            if (!(segundos >= 10 && segundos <= 15)) {
                switch (segundos%10) {
                    case 1 -> IO.print("um segundo" + (minutos/10 > 0 ? "s" : ""));
                    case 2 -> IO.print("dois segundos");
                    case 3 -> IO.print("três segundos");
                    case 4 -> IO.print("quatro segundos");
                    case 5 -> IO.print("cinco segundos");
                    case 6 -> IO.print("seis segundos");
                    case 7 -> IO.print("sete segundos");
                    case 8 -> IO.print("oito segundos");
                    case 9 -> IO.print("nove segundos");
                }
            }
        }
    }

    public int converterParaSegundos() {
        return (horas * 3600 + minutos * 60 + segundos);
    }

    public int diferencaHorario(Horario horario) {
        if (this.converterParaSegundos() > horario.converterParaSegundos()) {
            return (86400 - this.converterParaSegundos() + horario.converterParaSegundos());
        } else {
            return horario.converterParaSegundos() - this.converterParaSegundos();
        }
    }
}