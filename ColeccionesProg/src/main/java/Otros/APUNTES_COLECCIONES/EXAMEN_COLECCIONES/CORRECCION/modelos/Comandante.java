package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.EXAMEN_COLECCIONES.CORRECCION.modelos;

import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.Casa;

import java.util.Objects;

public class Comandante implements Comparable<Comandante> {

    // atributos
    private String nombre;
    private Casa casa;
    private int experiencia;

    // constructor
    public Comandante(String nombre, Casa casa, int experiencia) {
        this.nombre = nombre;
        this.casa = casa;
        this.experiencia = experiencia;
    }

    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    // equals y hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comandante that)) return false;
        return nombre.equals(that.nombre) && casa == that.casa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, casa);
    }

    // toString

    @Override
    public String toString() {
        return nombre + " (" + casa + ")";
    }

    // compareTo (orden natural por casa)

    @Override
    public int compareTo(Comandante o) {
        return this.getCasa().compareTo(o.getCasa());
    }
}

