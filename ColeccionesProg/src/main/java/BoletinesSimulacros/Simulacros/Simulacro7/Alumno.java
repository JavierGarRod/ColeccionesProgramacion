package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro7;

import java.util.List;

public class Alumno {

    private static int numeroAlumnos = 1;

    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String telefono;
    private List<String> alergias;
    private boolean autorizImagenes;
    private Maestro maestro;

    public Alumno(String nombre, String apellidos, int edad, String telefono,
                  List<String> alergias, boolean autorizImagenes, Maestro maestro) {

        this.id = numeroAlumnos++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.alergias = alergias;
        this.autorizImagenes = autorizImagenes;
        this.maestro = maestro;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno a = (Alumno) o;
        return nombre.equalsIgnoreCase(a.nombre) &&
                apellidos.equalsIgnoreCase(a.apellidos);
    }

    @Override
    public int hashCode() {
        return (nombre + apellidos).toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return getNombreCompleto() + " (edad " + edad + ")";
    }
}

