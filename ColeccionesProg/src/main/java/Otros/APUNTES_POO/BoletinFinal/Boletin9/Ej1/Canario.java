package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej1;

public class Canario extends Mascota {

    private String color;

    public Canario(String nombre, int edad, double peso, String color) {
        super(nombre, edad, peso);
        this.color = color;
    }

    @Override
    public boolean habla() {
        return false;
    }
}
