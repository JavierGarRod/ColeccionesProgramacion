package Colecciones.src.main.java.BoletinListas.Ej3;

import java.time.LocalDate;
import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private LocalDate añoPublicacion;
    Estado estadoLibro;

    public Libro(String titulo, String autor, String genero, LocalDate añoPublicacion, Estado estadoLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.añoPublicacion = añoPublicacion;
        this.estadoLibro = estadoLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(LocalDate añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public Estado getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(Estado estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(autor);
    }


}
