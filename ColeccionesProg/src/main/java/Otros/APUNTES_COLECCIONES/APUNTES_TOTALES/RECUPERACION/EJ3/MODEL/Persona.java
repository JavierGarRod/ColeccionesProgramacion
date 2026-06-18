package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.EXCEPTIONS.DniInvalidoException;

public abstract class Persona {

    //atributos
    private String nombre;
    private String apellidos;
    private String DNI;
    private String telefono;

    //constructor
    public Persona(String nombre, String apellidos, String DNI, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        setDNI(DNI);
        this.telefono = telefono;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setDNI(String DNI) throws DniInvalidoException {
        if (DNI != null && !DNI.isEmpty() && DNI.matches("^[0-9]{8}[A-Z]$")) {
            this.DNI = DNI;
        } else {
            throw new DniInvalidoException("DNI incorrecto");
        }
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
                "\nnombre='" + nombre +
                "\napellidos='" + apellidos +
                "\nDNI='" + DNI +
                "\ntelefono='" + telefono +
                "\n---------------------------------";
    }
}
