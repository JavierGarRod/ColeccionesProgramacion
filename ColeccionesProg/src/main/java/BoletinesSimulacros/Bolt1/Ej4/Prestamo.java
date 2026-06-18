package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej4;


import java.util.Objects;

public class Prestamo {

    private int id;
    private Libro libro;
    private String nombreUsuario;
    private String fechaPrestamo;

    public Prestamo(int id, Libro libro, String nombreUsuario, String fechaPrestamo) {
        this.id = id;
        this.libro = libro;
        this.nombreUsuario = nombreUsuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Prestamo prestamo)) return false;
        return Objects.equals(libro, prestamo.libro) && Objects.equals(nombreUsuario, prestamo.nombreUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libro, nombreUsuario);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", libro=" + libro +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                '}';
    }
}
