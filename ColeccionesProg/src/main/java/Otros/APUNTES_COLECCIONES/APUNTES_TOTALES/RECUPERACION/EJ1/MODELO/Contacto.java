package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.MODELO;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.EXCEPCIONES.EmailInvalidoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.EXCEPCIONES.TelefonoInvalidoException;

public class Contacto implements Comparable<Contacto>{

    //atributos
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private Tipo_Contacto tipo;

    //constructor
    public Contacto(String nombre, String apellidos, String telefono, String email, Tipo_Contacto tipo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipo = tipo;
        setTelefono(telefono);
        setEmail(email);
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) throws TelefonoInvalidoException {
        if (!telefono.matches("\\d{9}")) {
            throw new TelefonoInvalidoException("El teléfono introducido no tiene 9 dígitos");
        }
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailInvalidoException {
        if (!email.matches("^[^@]+@[^@]+\\.[^@]+$")){
            throw new EmailInvalidoException("El email es inválido");
        }
        this.email = email;
    }

    public Tipo_Contacto getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Contacto tipo) {
        this.tipo = tipo;
    }

    //toString
    @Override
    public String toString() {
        return nombre + " " + apellidos +
                "\nTeléfono: " + telefono +
                "\nEmail: " + email +
                "\nTipo: " + tipo +
                "\n------------------------------";
    }

    //compareTo por nombre
    @Override
    public int compareTo(Contacto o) {
        int comp = this.apellidos.compareToIgnoreCase(o.apellidos);
        if (comp == 0) {
            return this.nombre.compareToIgnoreCase(o.nombre);
        }
        return comp;
    }
}

