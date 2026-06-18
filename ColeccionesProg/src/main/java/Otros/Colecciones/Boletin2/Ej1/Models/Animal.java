package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin2.Ej1.Models;

import java.time.LocalDate;
import java.util.Collection;

public class Animal implements Comparable<Animal>{
    private int id;
    private String nombre;
     String especie;
     int edad;
    private ClasificacionComida clasificacionComida;
    private LocalDate fechaNacimiento;
     double peso;
    private Medio medio;
     ClasificacionGestacion clasificacionGestacion;

    public Animal(int id, String nombre, String especie, int edad, ClasificacionComida clasificacionComida, LocalDate fechaNacimiento, double peso, Medio medio, ClasificacionGestacion clasificacionGestacion) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.clasificacionComida = clasificacionComida;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.medio = medio;
        this.clasificacionGestacion = clasificacionGestacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ClasificacionComida getClasificacionComida() {
        return clasificacionComida;
    }

    public void setClasificacionComida(ClasificacionComida clasificacionComida) {
        this.clasificacionComida = clasificacionComida;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Medio getMedio() {
        return medio;
    }

    public void setMedio(Medio medio) {
        this.medio = medio;
    }

    public ClasificacionGestacion getClasificacionGestacion() {
        return clasificacionGestacion;
    }

    public void setClasificacionGestacion(ClasificacionGestacion clasificacionGestacion) {
        this.clasificacionGestacion = clasificacionGestacion;
    }

    @Override
    public int compareTo(Animal otro) {
        int compNombre = this.nombre.compareToIgnoreCase(otro.nombre);
        if (compNombre != 0) return compNombre;
        return Integer.compare(this.id, otro.id);
    }



    @Override
    public String toString() {
        return nombre + " | Nacido: " + fechaNacimiento + " | Medio: " + medio + " | Alimentación: " + clasificacionComida;
    }
}
