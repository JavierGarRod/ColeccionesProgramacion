package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.MODEL;

import java.time.LocalDate;

public class Paciente extends Persona {

    //atributos
    private String Num_Unico;
    private LocalDate fechaNacimiento;
    private Grupo_Sanguineo grupoSanguineo;

    //constructor
    public Paciente(String nobre, String apellidos, String DNI, String telefono,String num_Unico, LocalDate fechaNacimiento, Grupo_Sanguineo grupoSanguineo) {
        super(nobre, apellidos, DNI, telefono);
        Num_Unico = num_Unico;
        this.fechaNacimiento = fechaNacimiento;
        this.grupoSanguineo = grupoSanguineo;
    }

    //getters y setters


    public String getNum_Unico() {
        return Num_Unico;
    }

    public void setNum_Unico(String num_Unico) {
        Num_Unico = num_Unico;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Grupo_Sanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(Grupo_Sanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    //toString

    @Override
    public String toString() {
        return "Paciente{" +
                "Num_Unico=" + Num_Unico +
                ", fechaNacimiento=" + fechaNacimiento +
                ", grupoSanguineo=" + grupoSanguineo +
                '}';
    }
}
