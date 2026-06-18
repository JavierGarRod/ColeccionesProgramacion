package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej2;

import java.time.LocalDate;

public class GestionaReservas {

    public static void main(String[] args) {

        RepositorioEvento repo = new RepositorioEvento();

        // -------------------------------------------------------------
        // 1. Crear usuarios
        // -------------------------------------------------------------
        Usuario u1 = new Usuario("Ezequiel", "eze@gmail.com");
        Usuario u2 = new Usuario("Maria Lopez", "maria@gmail.com");
        Usuario u3 = new Usuario("Juan Perez", "juan@gmail.com");
        Usuario u4 = new Usuario("Ana Torres", "ana@gmail.com");

        // -------------------------------------------------------------
        // 2. Crear eventos
        // -------------------------------------------------------------
        try {
            Evento e1 = new Evento("Concierto Rock", LocalDate.of(2026, 7, 10), "Sevilla");
            Evento e2 = new Evento("Feria Manga", LocalDate.of(2026, 8, 5), "Madrid");

            repo.agregarEvento(e1);
            repo.agregarEvento(e2);

            // Intento de evento duplicado
            try {
                Evento eDuplicado = new Evento("Concierto Rock", LocalDate.of(2026, 7, 10), "Sevilla");
                repo.agregarEvento(eDuplicado);
            } catch (ReservarException ex) {
                System.out.println("EXCEPCIÓN CONTROLADA: " + ex.getMessage());
            }

            // -------------------------------------------------------------
            // 3. Crear Reservass
            // -------------------------------------------------------------
            Reservas r1 = new Reservas(LocalDate.now(), EstadoReserva.RESERVADA, u1);
            Reservas r2 = new Reservas(LocalDate.now(), EstadoReserva.RESERVADA, u2);
            Reservas r3 = new Reservas(LocalDate.now(), EstadoReserva.RESERVADA, u3);

            e1.agregarReserva(r1);
            e1.agregarReserva(r2);
            e2.agregarReserva(r3);

            // -------------------------------------------------------------
            // 4. Modificar usuario de una Reservas existente
            // -------------------------------------------------------------
            repo.modificarReservas(r1.getIdReserva(), "Concierto Rock",
                    LocalDate.of(2026, 7, 10), u4);

            // -------------------------------------------------------------
            // 5. Intentar modificar una Reservas que NO existe
            // -------------------------------------------------------------
            try {
                repo.modificarReservas(999, "Concierto Rock",
                        LocalDate.of(2026, 7, 10), u4);
            } catch (ReservarException ex) {
                System.out.println("EXCEPCIÓN CONTROLADA: " + ex.getMessage());
            }

        } catch (ReservarException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

