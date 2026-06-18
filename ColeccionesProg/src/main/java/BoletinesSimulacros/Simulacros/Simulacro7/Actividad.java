package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actividad {

    private String nombre;
    private Lugar lugar;
    private LocalDate fecha;
    private int edadRecomendada;
    private int maxAlumnos;
    private Maestro maestro;
    private List<Alumno> alumnos;

    public Actividad(String nombre, Lugar lugar, LocalDate fecha,
                     int edadRecomendada, int maxAlumnos, Maestro maestro) {

        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.edadRecomendada = edadRecomendada;
        this.maxAlumnos = maxAlumnos;
        this.maestro = maestro;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public int getMaxAlumnos() {
        return maxAlumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actividad)) return false;
        Actividad act = (Actividad) o;
        return nombre.equalsIgnoreCase(act.nombre) &&
                fecha.equals(act.fecha);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode() + fecha.hashCode();
    }
}

