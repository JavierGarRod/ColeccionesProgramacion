package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej4;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;
    private RepositorioPrestamos repo;

    public Biblioteca() {
        libros = new ArrayList<>();
        repo = new RepositorioPrestamos();
    }

    public void agregarLibro(Libro l) {
        libros.add(l);
    }

    public Libro buscarPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void prestarLibro(String isbn, String usuario, String fecha) throws BibliotecaException {
        Libro l = buscarPorIsbn(isbn);

        if (l == null)
            throw new BibliotecaException("El libro no existe");

        if (l.getEstado() == EstadoLibro.PRESTADO)
            throw new BibliotecaException("El libro ya está prestado");

        l.prestar();

        try {
            repo.agregarPrestamo(l, usuario, fecha);
        } catch (BibliotecaException e) {
            l.devolver(); // revertir estado
            throw e;
        }
    }

    public void devolverLibro(String isbn) throws BibliotecaException {
        Libro l = buscarPorIsbn(isbn);

        if (l == null)
            throw new BibliotecaException("El libro no existe");

        if (l.getEstado() == EstadoLibro.LIBRE)
            throw new BibliotecaException("El libro no está prestado");

        l.devolver();
    }

    public void mostrarPrestamos() {
        repo.mostrarPrestamos();
    }

    public void mostrarPrestamosDeLibro(String titulo, String autor) {
        repo.mostrarPrestamosDeLibro(titulo, autor);
    }

    public void mostrarLibros() {
    }
}
