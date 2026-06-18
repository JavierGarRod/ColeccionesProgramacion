package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_CLONE.Apuntes_FINAL;

public class PersonaDeep implements Cloneable{

    private String nombre;
    private Direccion direccion; // objeto interno

    public PersonaDeep(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Direccion getDireccion() { return direccion; }

    @Override
    public PersonaDeep clone() {
        try {
            PersonaDeep copia = (PersonaDeep) super.clone();

            // ✔ COPIA PROFUNDA: clonamos también la dirección
            copia.direccion = direccion.clone();
           // copia.tipoSangre = tipoSangre.clone(); (si quiero poner más clases de atributo, lo pongo tal cual y ya, los atributos normales ya los pilla el clone)
            return copia;

        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return nombre + " - " + direccion;
    }
}

