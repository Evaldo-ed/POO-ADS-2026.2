void main() {
    String sigla = IO.readln("Entre com a sigla da disciplina: ");
    String buffer;

    String[] dia = new String[5];
    for (int i = 0; i < dia.length; i++) {
        dia[i] = "N";
    }
    boolean diaValido = false;

    for (int i = 0; i < dia.length; i++) {
        buffer = IO.readln("Entre com o " + (i+1) + "º dia de aula da semana da disciplina" + ((i != 0) ? ", ou entre com \"nao\" caso não hajam mais dias de aula: " : ": "));
        if (i != 0 && buffer.equals("nao")) {
            break;
        } else if (buffer.equals("nao")) {
            do{
                buffer = IO.readln("ERRO: Valor inválido. Entre com ao menos um dia de aula para a disciplina: ");
            }while(buffer.equals("nao"));
        }

        do {
            diaValido = switch(buffer) {
                case "seg", "ter", "qua", "qui", "sex" -> true;
                default -> false;
            };
            if (!diaValido) {
                buffer = IO.readln("ERRO: Valor inválido. Entre com \"seg\", \"ter\", \"qua\", \"qui\" ou \"sex\": ");
            }
        }while(!diaValido);
        dia[i] = buffer;
    }

    IO.println("Na disciplina " + sigla + ", Você tem aula nos seguintes dias:");
    for (int i = 0; i < dia.length; i++) {
        if (dia[i].equals("N")) {
            continue;
        }
            IO.println("- " + dia[i]);
    }
}