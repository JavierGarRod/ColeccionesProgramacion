package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.MODEL;

public class Medico extends Persona implements Comparable<Medico>{

    //atributos
    private Tipo_Especialidad especialidad;
    private String Num_Unico;

    //constructor
    public Medico(String nobre, String apellidos, String DNI, String telefono, Tipo_Especialidad especialidad, String num_Unico) {
        super(nobre, apellidos, DNI, telefono);
        this.especialidad = especialidad;
        Num_Unico = num_Unico;
    }

    //getters y setters

    public Tipo_Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Tipo_Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getNum_Unico() {
        return Num_Unico;
    }

    public void setNum_Unico(String num_Unico) {
        Num_Unico = num_Unico;
    }

    //toString
    @Override
    public String toString() {
        return "Medico{" +
                "especialidad=" + especialidad +
                ", Num_Unico=" + Num_Unico +
                '}';
    }


    @Override
    public int compareTo(Medico o) {
        return this.getApellidos().compareTo(o.getApellidos());
    }
}
