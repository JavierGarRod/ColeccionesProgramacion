package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro1;

import java.time.LocalDate;
import java.util.Objects;

public class Rematriculacion {

    private String matricula;
    private LocalDate fechaRematriculacion;

    public Rematriculacion(String matricula, LocalDate fechaRematriculacion) {
        this.matricula = matricula;
        this.fechaRematriculacion = fechaRematriculacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getFechaRematriculacion() {
        return fechaRematriculacion;
    }

    @Override
    public String toString() {
        return "Rematriculacion{" +
                "matricula='" + matricula + '\'' +
                ", fechaRematriculacion=" + fechaRematriculacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rematriculacion)) return false;
        Rematriculacion that = (Rematriculacion) o;
        return Objects.equals(matricula, that.matricula) &&
                Objects.equals(fechaRematriculacion, that.fechaRematriculacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, fechaRematriculacion);
    }
}
