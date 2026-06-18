package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.MODEL;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.EXCEPTIONS.FechaInvalidaException;

public class Cita implements Comparable<Cita>{

    //atributos
    private int id;
    private static int contador;
    private Paciente paciente;
    private Medico medico;
    private String fechaCita;
    private String motivo;
    private Tipo_Estado estadoCita;

    //constructor
    public Cita(Paciente paciente, Medico medico, String fechaCita, String motivo, Tipo_Estado estadoCita) {
        this.id = contador++;
        this.paciente = paciente;
        this.medico = medico;
        setFechaCita(fechaCita);
        this.motivo = motivo;
        this.estadoCita = estadoCita;
    }

    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cita.contador = contador;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        if (fechaCita == null || !fechaCita.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new FechaInvalidaException("Fecha inválida, formato esperado: DD/MM/AAAA");
        }
        this.fechaCita = fechaCita;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Tipo_Estado getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(Tipo_Estado estadoCita) {
        this.estadoCita = estadoCita;
    }

    //toString

    @Override
    public String toString() {
        return "Cita{" +
                "id=" + id +
                ", paciente=" + paciente +
                ", medico=" + medico +
                ", fechaCita='" + fechaCita + '\'' +
                ", motivo='" + motivo + '\'' +
                ", estadoCita=" + estadoCita +
                '}';
    }

    //compareTo
    @Override
    public int compareTo(Cita o) {
        return this.fechaCita.compareTo(o.fechaCita);
    }
}
