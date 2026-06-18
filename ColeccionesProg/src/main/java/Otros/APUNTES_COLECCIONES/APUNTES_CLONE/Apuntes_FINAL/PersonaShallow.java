package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_CLONE.Apuntes_FINAL;

public class PersonaShallow implements Cloneable{
    private String nombre;
    private Direccion direccion; // objeto interno

    public PersonaShallow(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Direccion getDireccion() { return direccion; }

    @Override
    public PersonaShallow clone() {
        try {
            // ❗ Copia superficial: copia la referencia de direccion
            return (PersonaShallow) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return nombre + " - " + direccion;
    }
}
