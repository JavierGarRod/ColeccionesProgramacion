package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositorioEvento {

    // "lista de eventos ordenada por fecha y nombre"
    private List<Evento> eventos;

    public RepositorioEvento() {
        eventos = new ArrayList<>();
    }

    // -------------------------------------------------------------
    // 1. Agregar evento

    // "No podrán registrarse eventos con fecha pasada"
    // "Tampoco eventos con el mismo nombre y la misma fecha"
    // "En ese caso devolveremos ReservarException"
    // -------------------------------------------------------------
    public void agregarEvento(Evento e) throws ReservarException {

        // Comprobamos si la fecha es pasada
        if (e.getFecha().isBefore(LocalDate.now())) {
            throw new ReservarException("No se puede registrar un evento con fecha pasada");
        }

        // Comprobamos si ya existe un evento igual
        for (Evento existente : eventos) {
            if (existente.equals(e)) {
                throw new ReservarException("Ya existe un evento con ese nombre y fecha");
            }
        }

        // Insertamos el evento en la lista
        eventos.add(e);

        // Ordenamos la lista por fecha y luego por nombre
        ordenarEventos();
    }

    // Método auxiliar para ordenar la lista
    private void ordenarEventos() {

        for (int i = 0; i < eventos.size() - 1; i++) {
            for (int j = i + 1; j < eventos.size(); j++) {

                Evento e1 = eventos.get(i);
                Evento e2 = eventos.get(j);

                // Primero comparamos por fecha
                if (e1.getFecha().isAfter(e2.getFecha())) {

                    eventos.set(i, e2);
                    eventos.set(j, e1);

                } else if (e1.getFecha().isEqual(e2.getFecha())) {

                    // Si la fecha es igual, comparamos por nombre
                    if (e1.getNombre().compareToIgnoreCase(e2.getNombre()) > 0) {
                        eventos.set(i, e2);
                        eventos.set(j, e1);
                    }
                }
            }
        }
    }

    // -------------------------------------------------------------
    // 2. Devolver una Reservas por id + nombre evento + fecha

    // "Devolverá nulo si no existe"
    // -------------------------------------------------------------
    public Reservas getReservas(int idReservas, String nombreEvento, LocalDate fechaEvento) {

        for (Evento e : eventos) {
            if (e.getNombre().equalsIgnoreCase(nombreEvento)
                    && e.getFecha().equals(fechaEvento)) {

                for (Reservas r : e.getReservas()) {
                    if (r.getIdReserva() == idReservas) {
                        return r;
                    }
                }
            }
        }

        return null; // No encontrada
    }

    // -------------------------------------------------------------
    // 3. Agregar Reservas a un evento

    // "Si el evento no existe → ReservarException"
    // -------------------------------------------------------------
    public void agregarReservasAEvento(String emailUsuario, int idEvento, String nombreEvento, LocalDate fechaEvento, Reservas Reservas) throws ReservarException {

        Evento eventoEncontrado = null;

        // Buscamos el evento
        for (Evento e : eventos) {
            if (e.getNombre().equalsIgnoreCase(nombreEvento)
                    && e.getFecha().equals(fechaEvento)) {
                eventoEncontrado = e;
            }
        }

        if (eventoEncontrado == null) {
            throw new ReservarException("El evento no existe");
        }

        // Si existe, añadimos la Reservas
        eventoEncontrado.agregarReserva(Reservas);
    }

    // -------------------------------------------------------------
    // 4. Modificar usuario de una Reservas

    // "Debe lanzar excepción si el evento no existe"
    // "Debe lanzar excepción si la Reservas no existe"
    // -------------------------------------------------------------
    public void modificarReservas(int idReservas, String nombreEvento, LocalDate fechaEvento, Usuario nuevoUsuario) throws ReservarException {

        Evento eventoEncontrado = null;

        // Buscamos el evento
        for (Evento e : eventos) {
            if (e.getNombre().equalsIgnoreCase(nombreEvento) && e.getFecha().equals(fechaEvento)) {
                eventoEncontrado = e;
            }
        }

        if (eventoEncontrado == null) {
            throw new ReservarException("No existe un evento con ese nombre y fecha");
        }

        // Buscamos la Reservas dentro del evento
        Reservas ReservasEncontrada = null;

        for (Reservas r : eventoEncontrado.getReservas()) {
            if (r.getIdReserva() == idReservas) {
                ReservasEncontrada = r;
            }
        }

        if (ReservasEncontrada == null) {
            throw new ReservarException("No existe una Reservas con ese identificador");
        }

        // Modificamos el usuario
        ReservasEncontrada.setUsuario(nuevoUsuario);
    }

    public List<Evento> getEventos() {
        return eventos;
    }
}

