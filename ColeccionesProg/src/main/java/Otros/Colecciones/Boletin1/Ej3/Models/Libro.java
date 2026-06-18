package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej3.Models;

import java.util.Objects;

public class Libro {

    // ATRIBUTOS
    private String titulo;
    private String autor;
    private String genero;
    private int anio;
    private int ejemplaresLibres;
    private int ejemplaresPrestados;

    // CONSTRUCTOR
    public Libro(String titulo, String autor, String genero, int anio, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
        this.ejemplaresLibres = ejemplares;
        this.ejemplaresPrestados = 0;
    }

    // MÉTODOS
    public void prestar() throws Exception {
        if (ejemplaresLibres == 0) {
            throw new Exception("No hay ejemplares disponibles para prestar.");
        }
        ejemplaresLibres--;
        ejemplaresPrestados++;
    }

    public void devolver() throws Exception {
        if (ejemplaresPrestados == 0) {
            throw new Exception("No hay ejemplares prestados para devolver.");
        }
        ejemplaresPrestados--;
        ejemplaresLibres++;
    }

    // TOSTRING
    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anio + ")";
    }

    // HASHCODE Y EQUALS
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Libro l)) return false;
        return Objects.equals(titulo.toLowerCase(), l.titulo.toLowerCase());
    }

    @Override
    public int hashCode() {
        return titulo.toLowerCase().hashCode();
    }

    // GETTERS Y SETTERS
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getGenero() { return genero; }
    public int getAnio() { return anio; }
    public int getEjemplaresLibres() { return ejemplaresLibres; }
    public int getEjemplaresPrestados() { return ejemplaresPrestados; }
}
