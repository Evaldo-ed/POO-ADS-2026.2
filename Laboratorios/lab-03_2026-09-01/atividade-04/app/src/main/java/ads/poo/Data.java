package ads.poo;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public Data(int dia) {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }
        mes = 1;
        ano = 1970;
    }

    public Data(int dia, int mes) {
        if (validarData(dia, mes, 1970)) {
            this.dia = dia;
            this.mes = mes;
        } else {
            this.dia = 1;
            this.mes = 1;
        }
        ano = 1970;
    }

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
        }
    }

    public boolean setDia(int dia) {
        if (dia > 0 && dia < quantidadeDias(mes, ano)) {
            this.dia = dia;
            return true;
        } else {
            return false;
        }
    }

    public boolean setMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
            return true;
        } else {
            return false;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String dataPorExtenso() {
        String mesExtenso = switch(mes) {
            case 1 -> "janeiro";
            case 2 -> "fevereiro";
            case 3 -> "março";
            case 4 -> "abril";
            case 5 -> "maio";
            case 6 -> "junho";
            case 7 -> "julho";
            case 8 -> "agosto";
            case 9 -> "setembro";
            case 10 -> "outubro";
            case 11 -> "novembro";
            default -> "dezembro";
        };
        return dia + " de " + mesExtenso + (" de " + ano);
    }

    public int diferencaData(Data data) {
        return Math.abs(this.converterParaDias() - data.converterParaDias());
    }

    public boolean ehBissexto(int ano) {
        if (ano%4 == 0 && (!(ano%100 == 0) || ano%400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public int quantidadeDias(int mes, int ano) {
        return switch(mes) {
            case 1 -> 31;
            case 2 -> (ehBissexto(ano) ? 29 : 28);
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            default -> 31;
        };
    }

    public boolean validarData(int dia, int mes, int ano) {
        if (ano > 0 && mes > 0 && mes <= 12 && dia > 0 && dia <= quantidadeDias(mes, ano)) {
            return true;
        } else {
        return false;
        }
    }

    public int converterParaDias() {
        int diasTotais = 0;
        for (int i = 1; i < ano; i++) {
            diasTotais += (ehBissexto(i) ? 366 : 365);
        }
        for (int i = 1; i < mes; i++) {
            diasTotais += quantidadeDias(i, ano);
        }
        diasTotais += dia;
        return diasTotais;
    }
}