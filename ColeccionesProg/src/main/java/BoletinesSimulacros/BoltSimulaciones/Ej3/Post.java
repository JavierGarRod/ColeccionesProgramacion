package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej3;

public class Post extends Message {

    public Post(String contenido, User autor) throws UserMemoryException {
        super(contenido, autor);

        if (contenido.isBlank())
            throw new UserMemoryException("El post no puede estar vacío");
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
