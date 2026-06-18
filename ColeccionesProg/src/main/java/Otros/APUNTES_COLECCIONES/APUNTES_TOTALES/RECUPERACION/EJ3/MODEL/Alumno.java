package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL;

import java.time.LocalDate;

public class Alumno extends Persona implements Comparable<Alumno> {

    //atributos
    private Nivel nivel;
    private LocalDate fecha_matriculación;

    //constructor
    public Alumno(String nombre, String apellidos, String DNI, String telefono, Nivel nivel, LocalDate fecha_matriculación) {
        super(nombre, apellidos, DNI, telefono);
        this.nivel = nivel;
        this.fecha_matriculación = fecha_matriculación;
    }

    //getters y setters

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public LocalDate getFecha_matriculación() {
        return fecha_matriculación;
    }

    public void setFecha_matriculación(LocalDate fecha_matriculación) {
        this.fecha_matriculación = fecha_matriculación;
    }

    //comparable por apellidos
    @Override
    public int compareTo(Alumno o) {
        return this.getApellidos().compareToIgnoreCase(o.getApellidos());
    }
}

