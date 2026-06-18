package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Libro;

public class Libro2 {
    String titulo;
    String autor;
    int num_páginas;
    int isbn;

    @Override
    public String toString() {
        return "Libro2{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", num_páginas=" + num_páginas +
                ", isbn=" + isbn +
                '}';
    }

    public Libro2(String titulo, String autor, int num_páginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_páginas = num_páginas;
        this.isbn = isbn;


    }
}
