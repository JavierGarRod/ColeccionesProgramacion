package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej4;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPrestamos {

    private List<Prestamo> prestamos;
    private int contadorId;

    public RepositorioPrestamos() {
        prestamos = new ArrayList<>();
        contadorId = 1;
    }

    public void agregarPrestamo(Libro libro, String usuario, String fecha) throws BibliotecaException {
        Prestamo nuevo = new Prestamo(contadorId, libro, usuario, fecha);

        if (prestamos.contains(nuevo)) {
            throw new BibliotecaException("Este préstamo ya existe");
        }

        prestamos.add(nuevo);
        contadorId++;
    }

    public void mostrarPrestamos() {
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }

    public void mostrarPrestamosDeLibro(String titulo, String autor) {
        for (Prestamo p : prestamos) {
            if (p.getLibro().getTitulo().equalsIgnoreCase(titulo) && p.getLibro().getAutor().equalsIgnoreCase(autor)) {

                System.out.println(p);
            }
        }
    }
}
