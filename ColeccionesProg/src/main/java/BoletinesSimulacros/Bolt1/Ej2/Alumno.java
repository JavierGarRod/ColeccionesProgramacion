package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej2;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String dni;

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Alumno alumno)) return false;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
