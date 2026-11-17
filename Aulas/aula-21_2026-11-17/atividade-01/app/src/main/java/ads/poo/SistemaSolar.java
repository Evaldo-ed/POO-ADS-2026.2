package ads.poo;

public enum SistemaSolar {
    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    private final int posicao;

    SistemaSolar(int posicao) {
        this.posicao = posicao;
    }

    public static SistemaSolar getByPosicao(int pos) {
        for(SistemaSolar planeta : SistemaSolar.values()) {
            if (pos == planeta.posicao) {
                return planeta;
            }
        }
        throw new IllegalArgumentException("Posição inválida");
    }
}