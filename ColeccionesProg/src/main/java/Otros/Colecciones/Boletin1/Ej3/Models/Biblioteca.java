package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej3.Models;

import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin1.Ej3.Exception.BibliotecaException;

import java.util.ArrayList;

public class Biblioteca {
    // ATRIBUTOS
    private ArrayList<Libro> libros;

    // CONSTRUCTOR
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // MÉTODOS

    public void agregarLibro(Libro l) {
        libros.add(l);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) return l;
        }
        return null;
    }

    public Libro buscarPorAutor(String autor) {
        for (Libro l : libros) {
            if (l.getAutor().equalsIgnoreCase(autor)) return l;
        }
        return null;
    }

    public void prestarLibro(String titulo) throws BibliotecaException {
        Libro l = buscarPorTitulo(titulo);
        if (l == null)
            throw new BibliotecaException("El libro no está en el inventario.");

        try {
            l.prestar();
        } catch (Exception e) {
            throw new BibliotecaException("No hay ejemplares disponibles.");
        }
    }

    public void devolverLibro(String titulo) throws BibliotecaException {
        Libro l = buscarPorTitulo(titulo);
        if (l == null) throw new BibliotecaException("El libro no está en el inventario.");

        try {
            l.devolver();
        } catch (Exception e) {
            throw new BibliotecaException("No hay ejemplares prestados.");
        }
    }

    public void mostrarInventario() {
        for (Libro l : libros) {
            System.out.println(" - " + l);
        }
    }

    public void mostrarInfo(String titulo) throws BibliotecaException {
        Libro l = buscarPorTitulo(titulo);
        if (l == null) throw new BibliotecaException("El libro no existe.");

        System.out.println("\nTítulo: " + l.getTitulo());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("Género: " + l.getGenero());
        System.out.println("Año: " + l.getAnio());
        System.out.println("Ejemplares libres: " + l.getEjemplaresLibres());
        System.out.println("Ejemplares prestados: " + l.getEjemplaresPrestados());
    }

    // GETTERS Y SETTERS
    public ArrayList<Libro> getLibros() { return libros; }
}