package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej3;

import java.util.Objects;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private String genero;
    private int año;
    private EstadoLibro estado;

    public Libro(String isbn, String titulo, String autor, String genero, int año) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.año = año;
        this.estado = EstadoLibro.LIBRE;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAño() {
        return año;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public void prestar() {
        estado = EstadoLibro.PRESTADO;
    }

    public void devolver() {
        estado = EstadoLibro.LIBRE;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Libro libro)) return false;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", año=" + año +
                ", estado=" + estado +
                '}';
    }

    public boolean infoDetallada() {
        return estado == EstadoLibro.PRESTADO;
    }
}
