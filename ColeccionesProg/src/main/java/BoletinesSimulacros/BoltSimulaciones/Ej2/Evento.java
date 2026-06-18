package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    private String nombre;
    private LocalDate fecha;
    private String lugar;
    private List<Reservas> reservas;

    public Evento(String nombre, LocalDate fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.reservas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public List<Reservas> getReservas() {
        return reservas;
    }

    public void agregarReserva(Reservas r) {
        reservas.add(r);
    }

    // "Dos eventos son iguales si nombre y fecha son iguales"
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Evento)) return false;

        Evento otro = (Evento) obj;
        return this.nombre.equalsIgnoreCase(otro.nombre)
                && this.fecha.equals(otro.fecha);
    }

    @Override
    public String toString() {
        return nombre + " - " + fecha + " - " + lugar;
    }
}

