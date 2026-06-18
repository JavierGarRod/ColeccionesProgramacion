package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej4.Models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libro> libros=new ArrayList<Libro>();
    RepositorioPrestamo prestamos;

    public Biblioteca(List<Libro> libros, RepositorioPrestamo prestamos) {
        this.libros = libros;
        this.prestamos = prestamos;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public RepositorioPrestamo getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(RepositorioPrestamo prestamos) {
        this.prestamos = prestamos;
    }

    public boolean prestarLibro(){
        return false;
    }
}
