package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro5;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private int numeroFicha;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int ranking;
    private List<Partido> partidos;

    public Jugador(int numeroFicha, String nombre, String apellido, String nacionalidad, int ranking) {
        this.numeroFicha = numeroFicha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.ranking = ranking;
        this.partidos = new ArrayList<>();
    }

    public int getNumeroFicha() {
        return numeroFicha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void agregarPartido(Partido p) {
        partidos.add(p);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;
        Jugador j = (Jugador) o;
        return numeroFicha == j.numeroFicha;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numeroFicha);
    }

    @Override
    public String toString() {
        return numeroFicha + " - " + apellido + ", " + nombre + " (Rank " + ranking + ")";
    }
}

