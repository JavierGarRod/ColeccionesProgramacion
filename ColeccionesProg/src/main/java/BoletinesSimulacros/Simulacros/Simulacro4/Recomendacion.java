package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro4;

public class Recomendacion extends Mensaje {

    public Recomendacion(int id, String contenido, Usuario usuario) throws UserMemoryException {
        super(id, contenido, usuario);
        if (contenido.length() < 100 || contenido.length() > 200) {
            throw new UserMemoryException("La recomendación debe tener entre 100 y 200 caracteres");
        }
    }

    @Override
    public int calcularPuntuacion() {
        return valoraciones.stream()
                .mapToInt(v -> v.getTipo().getPuntos())
                .sum();
    }
}
