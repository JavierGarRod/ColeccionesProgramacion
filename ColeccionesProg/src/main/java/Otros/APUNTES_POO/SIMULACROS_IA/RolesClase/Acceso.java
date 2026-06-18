package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.RolesClase;

import java.time.LocalDateTime;

public class Acceso {

    // atributos
    private Persona persona;
    private TipoAcceso tipo;
    private LocalDateTime fecha;
    private static int contador;

    // constructor
    public Acceso(Persona persona, TipoAcceso tipo, LocalDateTime fecha) {
        this.persona = persona;
        this.tipo = tipo;
        this.fecha = fecha;
        contador ++; // ojo
    }

    // getters y setters

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public TipoAcceso getTipo() {
        return tipo;
    }

    public void setTipo(TipoAcceso tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public static int getContador() {
        return contador;
    }

    //toString
    @Override
    public String toString() {
        return persona.getNombre() + " - " + tipo + " - " + fecha;
    }

}
