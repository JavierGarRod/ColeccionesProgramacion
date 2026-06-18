package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacion1;

import java.time.LocalDate;

public class Partido {

    //atributos
    private EstadoPartidos estadoPartidos;
    private LocalDate fecha;
    private int puntuacion;
    private Jugador j1;
    private Jugador j2;

    //constructor

    public Partido(EstadoPartidos estadoPartidos, LocalDate fecha, int puntuacion, Jugador j1, Jugador j2) {
        this.estadoPartidos = estadoPartidos;
        this.fecha = fecha;
        this.puntuacion = puntuacion;
        this.j1 = j1;
        this.j2 = j2;
    }


    //getters y setters

    public EstadoPartidos getEstadoPartidos() {
        return estadoPartidos;
    }

    public void setEstadoPartidos(EstadoPartidos estadoPartidos) {
        this.estadoPartidos = estadoPartidos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Jugador getJ1() {
        return j1;
    }

    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }


    //toString


    @Override
    public String toString() {
        return "Partido{" +
                "estadoPartidos=" + estadoPartidos +
                ", fecha=" + fecha +
                ", puntuacion=" + puntuacion +
                ", j1=" + j1 +
                ", j2=" + j2 +
                '}';
    }
}
