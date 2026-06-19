package Models;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {
    private String idAnimal;
    private String nombre;
    private String especie;
    LocalDate fechaIngreso;
    EstadoAdopcion estado;

    public Animal(String idAnimal, String nombre, String especie, LocalDate fechaIngreso, EstadoAdopcion estado) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaIngreso = fechaIngreso;
        this.estado = EstadoAdopcion.EN_ACOGIDA;
    }

    public Animal(String idAnimal, String nombre, String especie, LocalDate fechaIngreso) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaIngreso = fechaIngreso;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
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

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public EstadoAdopcion getEstado() {
        return estado;
    }

    public void setEstado(EstadoAdopcion estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(idAnimal, animal.idAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idAnimal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal='" + idAnimal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", estado=" + estado +
                '}';
    }

    /*
    public int getDiasIngreso(){
        int dias= fechaIngreso-LocalDate.now().getLong();
        return dias;
    }
    */
}
