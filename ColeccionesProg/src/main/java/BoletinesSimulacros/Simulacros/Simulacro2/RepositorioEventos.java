package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro2;

import java.time.LocalDate;
import java.util.*;

public class RepositorioEventos {

    private TreeSet<Evento> eventos;
    private Map<String, Usuario> usuarios;
    private int contadorReservas = 1;

    public RepositorioEventos() {
        eventos = new TreeSet<>();
        usuarios = new HashMap<>();
    }

    public void agregarUsuario(Usuario u) {
        usuarios.put(u.getEmail(), u);
    }

    // 1. Agregar evento
    public void agregarEvento(Evento e) throws ReservaException {
        if (e.getFechaEvento().isBefore(LocalDate.now())) {
            throw new ReservaException("No se pueden registrar eventos con fecha pasada");
        }
        if (!eventos.add(e)) {
            throw new ReservaException("Ya existe un evento con ese nombre y fecha");
        }
    }

    // 2. Obtener reserva por id
    public Reserva getReserva(String nombre, LocalDate fecha, int idReserva) {
        Evento e = buscarEvento(nombre, fecha);
        if (e == null) return null;

        return e.getReservas().stream()
                .filter(r -> r.getIdReserva() == idReserva)
                .findFirst()
                .orElse(null);
    }

    // 3. Agregar reserva
    public void agregarReserva(String emailUsuario, String nombreEvento, LocalDate fechaEvento)
            throws ReservaException {

        Usuario u = usuarios.get(emailUsuario);
        if (u == null) {
            throw new ReservaException("Usuario no existe");
        }

        Evento e = buscarEvento(nombreEvento, fechaEvento);
        if (e == null) {
            throw new ReservaException("Evento no existe");
        }

        Reserva r = new Reserva(contadorReservas++, LocalDate.now(), EstadoReserva.RESERVADA, u);
        e.getReservas().add(r);
    }

    // 4. Modificar reserva
    public void modificarReserva(int idReserva, String nombreEvento, LocalDate fechaEvento, Usuario nuevoUsuario)
            throws ReservaException {

        Evento e = buscarEvento(nombreEvento, fechaEvento);
        if (e == null) {
            throw new ReservaException("No existe evento con ese nombre y fecha");
        }

        Reserva r = getReserva(nombreEvento, fechaEvento, idReserva);
        if (r == null) {
            throw new ReservaException("No existe reserva con ese identificador en ese evento");
        }

        r.setUsuario(nuevoUsuario);
    }

    private Evento buscarEvento(String nombre, LocalDate fecha) {
        return eventos.stream()
                .filter(e -> e.getNombreEvento().equalsIgnoreCase(nombre)
                        && e.getFechaEvento().equals(fecha))
                .findFirst()
                .orElse(null);
    }

    public TreeSet<Evento> getEventos() {
        return eventos;
    }
}

