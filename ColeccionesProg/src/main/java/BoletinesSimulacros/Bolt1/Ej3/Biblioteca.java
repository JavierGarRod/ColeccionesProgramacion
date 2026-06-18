package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
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

    public List<Libro> buscarPorTituloOAutor(String texto) {
        List<Libro> encontrados = new ArrayList<>();

        for (Libro l : libros) {
            if (l.toString().toLowerCase().contains(texto.toLowerCase())) {
                encontrados.add(l);
            }
        }

        return encontrados;
    }

    public void prestarLibro(String isbn) throws BibliotecaException {
        Libro l = buscarPorIsbn(isbn);

        if (l == null)
            throw new BibliotecaException("El libro no está en el inventario");

        if (l.getEstado() == EstadoLibro.PRESTADO)
            throw new BibliotecaException("El libro ya está prestado");

        l.prestar();
    }

    public void devolverLibro(String isbn) throws BibliotecaException {
        Libro l = buscarPorIsbn(isbn);

        if (l == null)
            throw new BibliotecaException("El libro no está en el inventario");

        if (l.getEstado() == EstadoLibro.LIBRE)
            throw new BibliotecaException("El libro no está prestado");

        l.devolver();
    }

    public void mostrarLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
}

