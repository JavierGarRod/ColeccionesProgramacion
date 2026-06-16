package BoletinListas.Ej1.Models;

import java.util.ArrayList;

public class Estudiante {
    private String nombre; // Nombre del estudiante
    private String id; // Identificador único del estudiante
    private ArrayList<Double> notas; // Lista de notas del estudiante

    // Constructor: inicializa nombre, id y la lista de notas
    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getId() { return id; }
    public ArrayList<Double> getNotas() { return notas; }

    // Agrega una nota a la lista
    public void agregarNota(double nota) {
        notas.add(nota);
    }

    // Calcula el promedio de notas del estudiante
    public double promedio() {
        if (notas.isEmpty()) return 0; // Evita división entre cero
        double suma = 0;
        for (double n : notas) suma += n;
        return suma / notas.size();
    }

    // Representación en texto del estudiante
    @Override
    public String toString() {
        return nombre + " (" + id + ") Notas: " + notas;
    }
}