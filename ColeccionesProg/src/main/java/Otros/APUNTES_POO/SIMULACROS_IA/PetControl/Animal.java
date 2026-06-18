package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.PetControl;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Animal {

    // atributos
    private int id;
    private static int contador;
    private String nombre;
    private LocalDate fecha;
    private double peso;

    // constructor
    public Animal(String nombre, LocalDate fecha, double peso) {
        this.id = contador++;
        this.nombre = nombre;
        this.fecha = fecha;
        setPeso(peso);
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0.5) {
            this.peso = peso;
        } else {
            System.out.println("ERROR: el peso no puede ser menor de 0.5 kg. No se modifica.");
        }
    }


    //  métodos
    public abstract void mostrar_info();
    public abstract double coste_mantenimiento_diario();

    // toString
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", contador=" + contador +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", peso=" + peso +
                '}';
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
