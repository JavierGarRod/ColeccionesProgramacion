package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro3;

public class Alumno {

    private String nombreCompleto;
    private int edad;
    private String telefono;

    public Alumno(String nombreCompleto, int edad, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return nombreCompleto.equalsIgnoreCase(alumno.nombreCompleto);
    }

    @Override
    public int hashCode() {
        return nombreCompleto.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return nombreCompleto + " (" + edad + " años)";
    }
}

