package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej1;

import java.time.LocalDate;

// "Registrar una rematriculación con matrícula y fecha"
public class Rematriculacion {

    private String matriculaNueva;
    private LocalDate fechaRematriculacion;

    public Rematriculacion(String matriculaNueva, LocalDate fechaRematriculacion) {
        this.matriculaNueva = matriculaNueva;
        this.fechaRematriculacion = fechaRematriculacion;
    }

    public String getMatriculaNueva() {
        return matriculaNueva;
    }

    public LocalDate getFechaRematriculacion() {
        return fechaRematriculacion;
    }

    @Override
    public String toString() {
        return matriculaNueva + " (" + fechaRematriculacion + ")";
    }
}
