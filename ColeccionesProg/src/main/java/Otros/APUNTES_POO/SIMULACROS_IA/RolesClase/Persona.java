package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.RolesClase;

import java.time.LocalDate;

public abstract class Persona {

    //atributos
    private String nombre;
    private String id;
    private LocalDate fecha;

    //constructor
    public Persona(String nombre, String id, LocalDate fecha) {
        this.nombre = nombre;
        this.id = id;
        this.fecha = fecha;
    }

    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // métodos
    public void presentarse(){
        System.out.println("Hola, soy " + nombre);
    }

    //toString
    @Override
    public String toString() {
        return nombre + " (" + id + ") - " + fecha;
    }

}
