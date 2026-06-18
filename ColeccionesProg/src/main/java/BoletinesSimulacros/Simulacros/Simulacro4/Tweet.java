package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro4;

public class Tweet extends Mensaje {

    public Tweet(int id, String contenido, Usuario usuario) throws UserMemoryException {
        super(id, contenido, usuario);
        if (contenido.length() > 50) {
            throw new UserMemoryException("El tweet supera los 50 caracteres");
        }
    }

    @Override
    public int calcularPuntuacion() {
        return valoraciones.stream()
                .mapToInt(v -> v.getTipo().getPuntos() * 2)
                .sum();
    }
}

