package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento implements Comparable<Evento> {

    private String nombreEvento;
    private LocalDate fechaEvento;
    private String lugar;
    private List<Reserva> reservas;

    public Evento(String nombreEvento, LocalDate fechaEvento, String lugar) {
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.lugar = lugar;
        this.reservas = new ArrayList<>();
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    @Override
    public int compareTo(Evento o) {
        int cmp = this.fechaEvento.compareTo(o.fechaEvento);
        if (cmp == 0) {
            return this.nombreEvento.compareToIgnoreCase(o.nombreEvento);
        }
        return cmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento)) return false;
        Evento evento = (Evento) o;
        return nombreEvento.equalsIgnoreCase(evento.nombreEvento)
                && fechaEvento.equals(evento.fechaEvento);
    }

    @Override
    public int hashCode() {
        return nombreEvento.toLowerCase().hashCode() + fechaEvento.hashCode();
    }

    @Override
    public String toString() {
        return "Evento{" + nombreEvento + " - " + fechaEvento + " en " + lugar + "}";
    }
}

