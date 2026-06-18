package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.SeguridadEmp;

import java.time.LocalDate;
import java.util.Objects;

public class Incidente {

    // atributos

    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fecha_registro;
    private LocalDate fecha_fin;
    private EstadoIncidente estado;
    private Criticidad criticidad;
    private Equipo equipo;

    // constructor

    public Incidente(int id, String nombre, String descripcion, LocalDate fecha_fin, EstadoIncidente estado, Criticidad criticidad, Equipo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_registro = LocalDate.now();
        this.estado = estado;
        setFecha_fin(fecha_fin); // si esta funcion usa estado, estado tiene que estar antes
        this.criticidad = criticidad;
        this.equipo = equipo;
    }

    // Getter setters

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public LocalDate getFecha_registro() {return fecha_registro;}
    public void setFecha_registro(LocalDate fecha_registro) {this.fecha_registro = fecha_registro;}
    public LocalDate getFecha_fin() {return fecha_fin;}

    public void setFecha_fin(LocalDate fecha_fin) {
        if (estado == EstadoIncidente.CERRADO) {
            this.fecha_fin = fecha_fin;
        }
        else{
            this.fecha_fin = null;
        }
    }

    public EstadoIncidente getEstado() {return estado;}
    public void setEstado(EstadoIncidente estado) {this.estado = estado;}
    public Criticidad getCriticidad() {return criticidad;}
    public void setCriticidad(Criticidad criticidad) {this.criticidad = criticidad;}
    public Equipo getEquipo() {return equipo;}
    public void setEquipo(Equipo equipo) {this.equipo = equipo;}

    // métodos

    protected boolean esUrgente() {

        LocalDate hoy = LocalDate.now();

        // CRÍTICO → urgente siempre
        if (criticidad == Criticidad.CRITICO) {
            return true;
        }

        // GRAVE → urgente si han pasado 7 días
        if (criticidad == Criticidad.GRAVE && fecha_registro.plusDays(7).isBefore(hoy)) {
            return true;
        }

        // MEDIO → urgente si han pasado 30 días
        if (criticidad == Criticidad.MEDIO && fecha_registro.plusDays(30).isBefore(hoy)) {
            return true;
        }

        // LEVE → nunca urgente
        return false;
    }


    // equals hashcode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Incidente incidente = (Incidente) o;
        return id == incidente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // toString

    @Override
    public String toString() {
        return nombre + " - " + estado + ": " + criticidad + " - " + fecha_registro + " - " + equipo.getNombre(); //ojo
    }
}
