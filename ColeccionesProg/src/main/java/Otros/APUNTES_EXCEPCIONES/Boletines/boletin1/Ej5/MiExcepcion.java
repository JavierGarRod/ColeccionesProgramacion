package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin1.Ej5;

public class MiExcepcion extends Exception {

    //atributos
    private int numero;

    //constructor
    public MiExcepcion(int numero) {
        this.numero = numero;
    }

    //toString
    @Override
    public String toString() {
        return "MiExcepcion: el número " + numero + " es impar";
    }
}

