package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej1;

public class Serpiente extends Mascota {

    private int numMudadoPiel;
    private int mesesGestacion;

    public Serpiente(String nombre, int edad, double peso, int mudas, int gestacion) {
        super(nombre, edad, peso);
        this.numMudadoPiel = mudas;
        this.mesesGestacion = gestacion;
    }

    @Override
    public boolean habla() {
        return false;
    }
}
