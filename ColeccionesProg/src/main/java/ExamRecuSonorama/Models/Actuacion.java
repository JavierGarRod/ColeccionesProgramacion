package ExamRecuSonorama.Models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Actuacion implements Comparable<Actuacion>{

    //atributos
    private String idActuacion;
    private String nombreArtista;
    private LocalDateTime horaInicio;
    private int duracionMinutos;
    private EstadoActuacion estado;

    //constructor
    public Actuacion(String idActuacion, String nombreArtista, LocalDateTime horaInicio, int duracionMinutos) {
        this.idActuacion = idActuacion;
        this.nombreArtista = nombreArtista;
        this.horaInicio = horaInicio;
        this.duracionMinutos = duracionMinutos;
        this.estado = EstadoActuacion.PROGRAMADA;
    }


    //getters y setters


    public String getIdActuacion() {
        return idActuacion;
    }

    public void setIdActuacion(String idActuacion) {
        this.idActuacion = idActuacion;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public EstadoActuacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoActuacion estado) {
        this.estado = estado;
    }

    //toString

    @Override
    public String toString() {
        return "Actuacion{" +
                "idActuacion='" + idActuacion + '\'' +
                ", nombreArtista='" + nombreArtista + '\'' +
                ", horaInicio=" + horaInicio +
                ", duracionMinutos=" + duracionMinutos +
                ", estado=" + estado +
                '}';
    }


    //equals y hashcode (idActuacion)

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Actuacion actuacion)) return false;
        return Objects.equals(idActuacion, actuacion.idActuacion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idActuacion);
    }

    //comareTo (horaInicio)
    @Override
    public int compareTo(Actuacion o) {
        return this.getHoraInicio().compareTo(o.getHoraInicio());
    }
}
