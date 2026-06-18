package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej1.Model;

import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin1.Ej1.Exception.EstudianteNoEncontradoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudiante {
    // ATRIBUTOS

    private String nombre;
    private String id;
    private List<Double> notas;


    // CONSTRUCTOR

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new ArrayList<>(); //Cuidado con esto IMPORTANTE hay q inicializarlo
    }


    // MÉTODOS

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double calcularPromedio() throws EstudianteNoEncontradoException {
        if (notas.isEmpty()) {
            throw new EstudianteNoEncontradoException("El estudiante no tiene notas registradas.");
        }
        double suma = 0;
        for (double n : notas) suma += n;
        double media=suma/notas.size();

        return media;
    }


    // GETTERS Y SETTERS

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

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }


    // TOSTRING

    @Override
    public String toString() {
        return nombre + " (" + id + ") Notas: " + notas;
    }

    //HASHCODE Y EQUALS

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Estudiante that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
