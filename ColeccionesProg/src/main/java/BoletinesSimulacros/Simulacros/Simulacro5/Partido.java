package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro5;

import java.time.LocalDate;
import java.util.List;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private EstadoPartido estado;
    private LocalDate fecha;
    private List<Integer> setsJugador1;
    private List<Integer> setsJugador2;

    public Partido(Jugador jugador1, Jugador jugador2, EstadoPartido estado,
                   LocalDate fecha, List<Integer> setsJugador1, List<Integer> setsJugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.estado = estado;
        this.fecha = fecha;
        this.setsJugador1 = setsJugador1;
        this.setsJugador2 = setsJugador2;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public EstadoPartido getEstado() {
        return estado;
    }

    public List<Integer> getSetsJugador1() {
        return setsJugador1;
    }

    public List<Integer> getSetsJugador2() {
        return setsJugador2;
    }

    @Override
    public String toString() {
        return "Partido: " + jugador1.getApellido() + " vs " + jugador2.getApellido() +
                " (" + estado + ") " + fecha;
    }
}

