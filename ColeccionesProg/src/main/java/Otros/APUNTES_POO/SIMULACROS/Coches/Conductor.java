package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.Coches;

public class Conductor {

    private String nombre;
    private int aniosExp;

    public Conductor(String nombre, int aniosExp) {
        this.nombre = nombre;
        this.aniosExp = aniosExp;
    }

    public void conducir() {
        System.out.println(nombre + " conduciendo");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + aniosExp + " años exp)";
    }
}

