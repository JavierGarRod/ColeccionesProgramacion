package Apuntes;

import java.util.*;

/**
 * GUÍA COMPLETA DE MAPAS, COMPARACIÓN Y ORDENACIÓN
 * Copia este código en un archivo llamado 'GuiaMapasCompleta.java'
 */

// 1. Objeto personalizado que implementa Comparable
// Esto permite que el objeto se pueda usar como LLAVE en un TreeMap
class Estudiante implements Comparable<Estudiante> {
    private int id;
    private String nombre;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Método CompareTo: Define el ORDEN NATURAL (por ID)
    @Override
    public int compareTo(Estudiante otro) {
        // Negativo: este < otro | Cero: iguales | Positivo: este > otro
        return Integer.compare(this.id, otro.id);
    }

    // Getters y toString para visualización
    public String getNombre() { return nombre; }
    public int getId() { return id; }
    @Override
    public String toString() { return "ID: " + id + " [" + nombre + "]"; }

    // IMPORTANTE: Para HashMap, siempre sobreescribe equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante)) return false;
        Estudiante that = (Estudiante) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}