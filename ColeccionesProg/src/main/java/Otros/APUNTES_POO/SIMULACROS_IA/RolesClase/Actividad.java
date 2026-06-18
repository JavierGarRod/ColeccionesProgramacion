package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.RolesClase;

import java.time.LocalDate;

public abstract class Actividad {

    //atributos
    private String titulo;
    private LocalDate fecha;
    private int horas;

    //constructor
    public Actividad(String titulo, LocalDate fecha, int horas) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.horas = horas;
    }

    //getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    // métodos
    public abstract double calcularCoste();

    //toString

    @Override
    public String toString() {
        return getTitulo() + " | " + getFecha() + " | " + getHoras() + "h";
    }
}
