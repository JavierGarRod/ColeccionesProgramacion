package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.MODEL;

public class Persona {

    //atributos
    private String nobre;
    private String apellidos;
    private String DNI;
    private String telefono;

    //cosntructor
    public Persona(String nobre, String apellidos, String DNI, String telefono) {
        this.nobre = nobre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.telefono = telefono;
    }

    //getters y setters
    public String getNobre() {
        return nobre;
    }

    public void setNobre(String nobre) {
        this.nobre = nobre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //toString
    @Override
    public String toString() {
        return "Persona{" +
                "nobre='" + nobre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
