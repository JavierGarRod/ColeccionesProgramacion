package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej3;

public class Tweet extends Message {

    public Tweet(String contenido, User autor) throws UserMemoryException {
        super(contenido, autor);

        if (contenido.length() > 50)
            throw new UserMemoryException("El tweet supera los 50 caracteres");
    }

    @Override
    public int calcularPuntuacion() {
        int total = 0;

        for (Valoracion v : valoraciones) {
            int puntos = 0;

            switch (v) {
                case SUPERBUENA: puntos = 3; break;
                case MUYBUENA:   puntos = 2; break;
                case BUENA:      puntos = 1; break;
                case NORMAL:     puntos = 0; break;
                case REGULAR:    puntos = -1; break;
                case MUYMALA:    puntos = -2; break;
            }

            total += puntos * 2; // Tweet vale doble
        }

        return total;
    }
}

