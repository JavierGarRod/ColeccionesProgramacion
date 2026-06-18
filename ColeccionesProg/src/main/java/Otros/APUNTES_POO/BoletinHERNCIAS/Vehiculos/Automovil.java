package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Vehiculos;

public class Automovil extends Vehiculo {

    // atributos
    private int num_puertas;
    private String tipo_gasolina;
    private boolean tiene_aire_acondc;

    //constructor

    public Automovil(String marca, String modelo, int velocidad_max, int peso, int num_ruedas, String tipo, int num_puertas, String tipo_gasolina, boolean tiene_aire_acondc) {
        super(marca, modelo, velocidad_max, peso, num_ruedas, tipo);
        this.num_puertas = num_puertas;
        this.tipo_gasolina = tipo_gasolina;
        this.tiene_aire_acondc = tiene_aire_acondc;
    }

    // SI NO PONGO EL TO STRING EN LAS SUBCLASES, TOMA EL DEL PADRE Y LUEGO CUANDO LO QUIERA IMPRIMIR...
    // en lugar de algo asi:
    // Camion{long_remolque=2.5, tipo_camion='ligero', altura=2.0} --> toString HIJO
    // sale así:
    // Iveco Mini (B) --> toString PADRE

}
