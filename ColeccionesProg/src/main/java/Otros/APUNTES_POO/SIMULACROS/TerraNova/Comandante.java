package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.TerraNova;

import java.util.Objects;

public class Comandante {

    //atributos
    private String dni;
    private String nombre;
    private Rango rango;

    //constructor

    public Comandante(String dni, String nombre, Rango rango) {
        this.dni = dni;
        this.nombre = nombre;
        this.rango = rango;
    }

    // getters setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }


    //equals

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Comandante that)) return false;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    //toString

    @Override
    public String toString() {
        return nombre + "(" + rango + ")";
    }
}
