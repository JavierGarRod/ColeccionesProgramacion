package ColeccionesProg.src.main.java.BoletinesSimulacros.RegistroTrafico;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Vehiculo {
    private String numBastidorVIN;
    private String matricula;
    private String marca;
    private String modelo;
    private LocalDate añoFabricacion;
    private String propietario;

    public Vehiculo(String numBastidorVIN, String matricula, String marca, String modelo, LocalDate añoFabricacion, String propietario) {
        this.numBastidorVIN = numBastidorVIN;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.propietario = propietario;
    }

    public Vehiculo(String numBastidorVIN, String matricula, LocalDate añoFabricacion) {
        this.numBastidorVIN = numBastidorVIN;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
    }

    public String getNumBastidorVIN() {
        return numBastidorVIN;
    }

    public void setNumBastidorVIN(String numBastidorVIN) {
        this.numBastidorVIN = numBastidorVIN;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(LocalDate añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return numBastidorVIN == vehiculo.numBastidorVIN;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numBastidorVIN);
    }
}
