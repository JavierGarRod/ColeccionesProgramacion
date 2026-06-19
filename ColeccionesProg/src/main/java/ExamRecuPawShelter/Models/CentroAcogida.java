package Models;

import java.util.Objects;

public class CentroAcogida{  //SE QUE TIENE QUE IMPLEMENTAR A COMPARABLE, PERO NO SE COMO ORDENARLOS ALFABÉTICAMENTE
    private String idCentro;
    private String nombreCentro;
    private String ciudad;
    private int capacidadMax;

    public CentroAcogida(String nombreCentro, String ciudad, int capacidadMax) {
        this.idCentro=nombreCentro;
        this.nombreCentro = nombreCentro;
        this.ciudad = ciudad;
        this.capacidadMax = capacidadMax;
    }


    public String getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(String idCentro) {
        this.idCentro = nombreCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CentroAcogida that = (CentroAcogida) o;
        return Objects.equals(nombreCentro, that.nombreCentro);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreCentro);
    }

    @Override
    public String toString() {
        return "CentroAcogida{" +
                "idCentro='" + idCentro + '\'' +
                ", nombreCentro='" + nombreCentro + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", capacidadMax=" + capacidadMax +
                '}';
    }
}
