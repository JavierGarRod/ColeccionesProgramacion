package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej4.Models;

import java.time.LocalDate;
import java.util.*;

public class RepositorioPrestamo {

    private List<Prestamo> historial = new ArrayList<>();
    private Set<Prestamo> prestamosUnicos = new HashSet<>();
    private int contadorId = 1;

    public void agregarPrestamo(Libro libro, String usuario) {
        if (libro.getEstado() == EstadoLibro.PRESTADO) {
            System.out.println("No es posible realizar el préstamo de un libro que ya está prestado.");
            return;
        }

        Prestamo nuevo = new Prestamo(contadorId++, libro, usuario, LocalDate.now());

        if (!prestamosUnicos.add(nuevo)) {
            System.out.println("Este préstamo ya existe y no puede duplicarse.");
            return;
        }

        historial.add(nuevo);
        libro.setEstado(EstadoLibro.PRESTADO);
    }

    public void devolverLibro(Libro libro) {
        if (libro.getEstado() == EstadoLibro.DISPONIBLE) {
            System.out.println("No es posible devolver un libro que no está prestado.");
            return;
        }

        libro.setEstado(EstadoLibro.DISPONIBLE);
    }

    public void mostrarHistorial() {
        historial.forEach(System.out::println);
    }

    public void mostrarPrestamosPorLibro(String titulo, String autor) {
        historial.stream()
                .filter(p -> p.getLibro().getTitulo().equals(titulo) &&
                        p.getLibro().getAutor().equals(autor))
                .forEach(System.out::println);
    }
}

