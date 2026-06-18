package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro4;

public class Post extends Mensaje {

    public Post(int id, String contenido, Usuario usuario) throws UserMemoryException {
        super(id, contenido, usuario);
        if (contenido.isBlank()) {
            throw new UserMemoryException("El post no puede estar en blanco");
        }
    }

    @Override
    public int calcularPuntuacion() {
        return valoraciones.stream()
                .mapToInt(v -> v.getTipo().getPuntos())
                .sum();
    }
}

