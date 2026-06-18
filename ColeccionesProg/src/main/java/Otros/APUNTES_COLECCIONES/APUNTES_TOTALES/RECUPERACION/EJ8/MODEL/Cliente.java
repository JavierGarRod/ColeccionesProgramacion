package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.MODEL;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

    //atributos
    private String nombre;
    private String email;
    private String telefono;

    //constructor
    public Cliente(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    //equals y hashcode

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(email, cliente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    //compareTo
    @Override
    public int compareTo(Cliente c) {
        return this.nombre.compareTo(c.getNombre());
    }
}
