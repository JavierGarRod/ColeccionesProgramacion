package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej4.Models;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
    private int id;
    private Libro libro;
    private String nombreUsuario;
    private LocalDate fechaPrestamo;

    public Prestamo(int id, Libro libro, String nombreUsuario, LocalDate fechaPrestamo) {
        this.id = id;
        this.libro = libro;
        this.nombreUsuario = nombreUsuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prestamo)) return false;
        Prestamo p = (Prestamo) o;
        return libro.getTitulo().equals(p.libro.getTitulo()) &&
                libro.getAutor().equals(p.libro.getAutor()) &&
                nombreUsuario.equals(p.nombreUsuario) &&
                fechaPrestamo.equals(p.fechaPrestamo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro.getTitulo(), libro.getAutor(), nombreUsuario, fechaPrestamo);
    }

    @Override
    public String toString() {
        return "Préstamo " + id + ": " + libro + " | Usuario: " + nombreUsuario +
                " | Fecha: " + fechaPrestamo;
    }
}
