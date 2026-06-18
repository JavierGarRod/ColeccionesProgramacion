package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Vehiculos;

public class Camion extends Vehiculo{

    //atributos
    private double long_remolque;
    private String tipo_camion;
    private double altura;

    //constructor


    public Camion(String marca, String modelo, int velocidad_max, int peso, int num_ruedas, String tipo, double long_remolque, String tipo_camion, double altura) {
        super(marca, modelo, velocidad_max, peso, num_ruedas, tipo);
        this.long_remolque = long_remolque;
        this.tipo_camion = tipo_camion;
        this.altura = altura;
    }

    // SI NO PONGO EL TO STRING EN LAS SUBCLASES, TOMA EL DEL PADRE Y LUEGO CUANDO LO QUIERA IMPRIMIR...
    // en lugar de algo asi:
    // Camion{long_remolque=2.5, tipo_camion='ligero', altura=2.0} --> toString HIJO
    // sale así:
    // Iveco Mini (B) --> toString PADRE

    @Override
    public String toString() {
        return "Camion{" +
                "long_remolque=" + long_remolque +
                ", tipo_camion='" + tipo_camion + '\'' +
                ", altura=" + altura +
                '}';
    }
}
