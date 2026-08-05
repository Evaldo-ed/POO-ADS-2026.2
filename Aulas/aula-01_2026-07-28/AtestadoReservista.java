void main() {
    int idade = Integer.parseInt(IO.readln("Entre com sua idade: "));
    char c = IO.readln("Entre com seu sexo (f/m): ").toUpperCase().charAt(0);

    if (idade > 18 && idade < 46 && c == 'M') {
        IO.println("É necessário apresentar atestado de reservista.");
    } else {
        IO.println("Não é necessário apresentar atestado de reservista.");
    }
}