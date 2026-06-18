package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Libro;

public class Libro {

    String titulo;
    String autor;
    int num_páginas;
    int isbn;

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", num_páginas=" + num_páginas +
                ", isbn=" + isbn +
                '}';
    }
}
