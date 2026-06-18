package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro4;

public class MemoryStageManagement {

    public static void main(String[] args) {

        MemoryStorage storage = new MemoryStorage();

        // Crear usuarios
        try {
            storage.agregarUsuario(new Usuario("usuario1", "Clave123A"));
            storage.agregarUsuario(new Usuario("usuario2", "Pass456B"));
        } catch (UserMemoryException e) {
            System.out.println(e.getMessage());
        }

        // Crear mensajes
        try {
            storage.agregarMensaje("usuario1", "Hola mundo desde un tweet", "tweet");
            storage.agregarMensaje("usuario1", "Este es un post largo y válido", "post");
            storage.agregarMensaje("usuario2",
                    "a".repeat(120),
                    "recomendacion");
        } catch (UserMemoryException e) {
            System.out.println(e.getMessage());
        }

        // Valorar mensajes
        try {
            Usuario u2 = new Usuario("usuario2", "Pass456B");
            storage.valorarMensaje(1, u2, ValoracionTipo.SUPERBUENA);
            storage.valorarMensaje(2, u2, ValoracionTipo.REGULAR);
        } catch (UserMemoryException e) {
            System.out.println(e.getMessage());
        }

        // Mostrar mensajes ordenados
        System.out.println("\nMensajes ordenados por valoración:");
        storage.obtenerMensajesOrdenadosPorValoracion()
                .forEach(m -> System.out.println(
                        m.getId() + " - " + m.getUsuario() + " - Puntos: " + m.calcularPuntuacion()
                ));
    }
}

