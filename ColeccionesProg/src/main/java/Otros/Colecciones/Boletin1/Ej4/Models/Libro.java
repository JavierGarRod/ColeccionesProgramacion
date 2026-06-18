package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej4.Models;

public class Libro {

    private String titulo;
    private String autor;
    private EstadoLibro estado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = EstadoLibro.DISPONIBLE;
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

    public EstadoLibro getEstado() {
        return estado;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ")";
    }
}

