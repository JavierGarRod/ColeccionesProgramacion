package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro2;

import java.time.LocalDate;

public class GestionaReservas {

    public static void main(String[] args) {

        RepositorioEventos repo = new RepositorioEventos();

        // Crear usuarios
        Usuario u1 = new Usuario("Juan Pérez", "juan@mail.com");
        Usuario u2 = new Usuario("Ana López", "ana@mail.com");
        Usuario u3 = new Usuario("Carlos Ruiz", "carlos@mail.com");
        Usuario u4 = new Usuario("María Torres", "maria@mail.com");

        repo.agregarUsuario(u1);
        repo.agregarUsuario(u2);
        repo.agregarUsuario(u3);
        repo.agregarUsuario(u4);

        // Crear eventos
        try {
            repo.agregarEvento(new Evento("Concierto Rock", LocalDate.now().plusDays(10), "Madrid"));
            repo.agregarEvento(new Evento("Feria Libro", LocalDate.now().plusDays(5), "Sevilla"));
        } catch (ReservaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Crear reservas
        try {
            repo.agregarReserva("juan@mail.com", "Concierto Rock", LocalDate.now().plusDays(10));
            repo.agregarReserva("ana@mail.com", "Concierto Rock", LocalDate.now().plusDays(10));
            repo.agregarReserva("carlos@mail.com", "Feria Libro", LocalDate.now().plusDays(5));
        } catch (ReservaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Intentar agregar evento duplicado
        try {
            repo.agregarEvento(new Evento("Concierto Rock", LocalDate.now().plusDays(10), "Madrid"));
        } catch (ReservaException e) {
            System.out.println("[OK] Excepción controlada: " + e.getMessage());
        }

        // Modificar reserva válida
        try {
            repo.modificarReserva(1, "Concierto Rock", LocalDate.now().plusDays(10), u4);
            System.out.println("Reserva modificada correctamente");
        } catch (ReservaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Modificar reserva inexistente
        try {
            repo.modificarReserva(999, "Concierto Rock", LocalDate.now().plusDays(10), u4);
        } catch (ReservaException e) {
            System.out.println("[OK] Error esperado: " + e.getMessage());
        }
    }
}

