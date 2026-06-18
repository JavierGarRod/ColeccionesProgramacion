package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vehiculo {

    private String vin;
    private String matriculaActual;
    private String marca;
    private String modelo;
    private String color;
    private int anioFabricacion;
    private LocalDate fechaMatriculacionInicial;
    private String propietarioActual;
    private List<Rematriculacion> historicoMatriculaciones;

    public Vehiculo(String vin, String matriculaActual, String marca, String modelo,
                    String color, int anioFabricacion, LocalDate fechaMatriculacionInicial,
                    String propietarioActual) {
        this.vin = vin;
        this.matriculaActual = matriculaActual;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.fechaMatriculacionInicial = fechaMatriculacionInicial;
        this.propietarioActual = propietarioActual;
        this.historicoMatriculaciones = new ArrayList<>();
        // añadimos la matriculación inicial al histórico
        this.historicoMatriculaciones.add(
                new Rematriculacion(matriculaActual, fechaMatriculacionInicial)
        );
    }

    public String getVin() {
        return vin;
    }

    public String getMatriculaActual() {
        return matriculaActual;
    }

    public void setMatriculaActual(String matriculaActual) {
        this.matriculaActual = matriculaActual;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public LocalDate getFechaMatriculacionInicial() {
        return fechaMatriculacionInicial;
    }

    public String getPropietarioActual() {
        return propietarioActual;
    }

    public void setPropietarioActual(String propietarioActual) {
        this.propietarioActual = propietarioActual;
    }

    public List<Rematriculacion> getHistoricoMatriculaciones() {
        return historicoMatriculaciones;
    }

    public void agregarRematriculacion(Rematriculacion r) {
        this.historicoMatriculaciones.add(r);
        this.matriculaActual = r.getMatricula();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(vin, vehiculo.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "vin='" + vin + '\'' +
                ", matriculaActual='" + matriculaActual + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", fechaMatriculacionInicial=" + fechaMatriculacionInicial +
                ", propietarioActual='" + propietarioActual + '\'' +
                '}';
    }
}

