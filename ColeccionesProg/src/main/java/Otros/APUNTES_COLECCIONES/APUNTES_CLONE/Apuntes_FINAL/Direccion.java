package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_CLONE.Apuntes_FINAL;

public class Direccion implements Cloneable{
    private String ciudad;

    public Direccion(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    @Override
    public Direccion clone() {
        try {
            return (Direccion) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return ciudad;
    }
}

