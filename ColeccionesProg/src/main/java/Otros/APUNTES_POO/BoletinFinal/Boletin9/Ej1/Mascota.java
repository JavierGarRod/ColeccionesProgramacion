package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej1;

public abstract class Mascota {

    protected String nombre;
    protected int edad;
    protected double peso;

    public Mascota(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public abstract boolean habla();

    @Override
    public String toString() {
        return nombre + " (" + this.getClass().getSimpleName() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Mascota)) return false;
        Mascota m = (Mascota) obj;
        return this.nombre.equals(m.nombre)
                && this.edad == m.edad
                && this.getClass().equals(m.getClass());
    }

    public double getPeso() {
        return peso;
    }
}