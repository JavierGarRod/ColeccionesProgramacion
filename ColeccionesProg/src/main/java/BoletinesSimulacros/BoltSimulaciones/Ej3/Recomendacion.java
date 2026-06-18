package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej3;

public class Recomendacion extends Message {

    public Recomendacion(String contenido, User autor) throws UserMemoryException {
        super(contenido, autor);

        if (contenido.length() < 100 || contenido.length() > 200)
            throw new UserMemoryException("La recomendación debe tener entre 100 y 200 caracteres");
    }

    @Override
    public int calcularPuntuacion() {
        int total = 0;

        for (Valoracion v : valoraciones) {
            switch (v) {
                case SUPERBUENA:
                    total += 3;
                    break;
                case MUYBUENA:
                    total += 2;
                    break;
                case BUENA:
                    total += 1;
                    break;
                case NORMAL:
                    total += 0;
                    break;
                case REGULAR:
                    total += -1;
                    break;
                case MUYMALA:
                    total += -2;
                    break;
            }
        }

        return total;
    }
}
