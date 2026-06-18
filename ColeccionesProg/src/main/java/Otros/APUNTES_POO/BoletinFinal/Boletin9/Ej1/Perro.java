package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej1;

public class Perro extends Mascota {

    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, double peso, String raza, boolean pulgas) {
        super(nombre, edad, peso);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public boolean habla() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " Raza: " + raza + " Pulgas: " + pulgas;
    }
}
