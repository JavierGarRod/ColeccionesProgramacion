package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro7;

public class Maestro {

    private String nombre;
    private String apellidos;
    private String dni;
    private String grupoTutor;

    public Maestro(String nombre, String apellidos, String dni, String grupoTutor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.grupoTutor = grupoTutor;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Maestro)) return false;
        Maestro m = (Maestro) o;
        return dni.equalsIgnoreCase(m.dni);
    }

    @Override
    public int hashCode() {
        return dni.toLowerCase().hashCode();
    }
}

