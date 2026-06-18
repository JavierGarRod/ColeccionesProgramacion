package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro3;

import java.util.ArrayList;
import java.util.List;

public class Taller {

    private static int contador = 1;

    private int id;
    private String nombre;
    private int edadMinima;
    private int aforoMaximo;
    private List<Alumno> alumnos;

    public Taller(String nombre, int edadMinima, int aforoMaximo) {
        this.id = contador++;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.aforoMaximo = aforoMaximo;
        this.alumnos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
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
        if (!(o instanceof Taller)) return false;
        Taller taller = (Taller) o;
        return id == taller.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Taller{id=" + id + ", nombre='" + nombre + "', alumnos=" + alumnos.size() + "}";
    }
}

