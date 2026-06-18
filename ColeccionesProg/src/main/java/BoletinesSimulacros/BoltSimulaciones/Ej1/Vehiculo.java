package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// "Cada vehículo tiene estas propiedades..."
public class Vehiculo {

    private String vin; // Identificador único
    private String matriculaActual;
    private String marca;
    private String modelo;
    private String color;
    private int anioFabricacion;
    private LocalDate fechaMatriculacion;
    private String propietarioActual;

    //"Deseamos guardar el histórico de matriculaciones"
    private List<Rematriculacion> historico;

    public Vehiculo(String vin, String matriculaActual, String marca, String modelo,
                    String color, int anioFabricacion, LocalDate fechaMatriculacion,
                    String propietarioActual) {

        this.vin = vin;
        this.matriculaActual = matriculaActual;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.fechaMatriculacion = fechaMatriculacion;
        this.propietarioActual = propietarioActual;
        this.historico = new ArrayList<>();
    }

    // "Registrar una rematriculación"
    public void agregarRematriculacion(Rematriculacion r) {
        historico.add(r);
        this.matriculaActual = r.getMatriculaNueva(); // Actualizamos matrícula actual
    }

    public String getVin() {
        return vin;
    }

    public String getPropietarioActual() {
        return propietarioActual;
    }

    public String getMatriculaActual() {
        return matriculaActual;
    }

    public List<Rematriculacion> getHistorico() {
        return historico;
    }

    @Override
    public String toString() {
        return vin + " - " + marca + " " + modelo + " (" + matriculaActual + ")";
    }
}

