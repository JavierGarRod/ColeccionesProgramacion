package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro6;

import java.time.LocalDate;

public class Trabajador {

    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;
    private TipoTrabajador tipo;
    private int idCentro;

    public Trabajador(String nombre, String dni, LocalDate fechaNacimiento,
                      TipoTrabajador tipo, int idCentro) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
        this.idCentro = idCentro;
    }

    public String getDni() {
        return dni;
    }

    public int getIdCentro() {
        return idCentro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trabajador)) return false;
        Trabajador t = (Trabajador) o;
        return dni.equalsIgnoreCase(t.dni);
    }

    @Override
    public int hashCode() {
        return dni.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return nombre + " (" + dni + ") - " + tipo;
    }
}

