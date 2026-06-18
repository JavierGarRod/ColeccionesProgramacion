package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro4;

public enum ValoracionTipo {
    SUPERBUENA(3),
    MUYBUENA(2),
    BUENA(1),
    NORMAL(0),
    REGULAR(-1),
    MUYMALA(-2);

    private int puntos;

    ValoracionTipo(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }
}

