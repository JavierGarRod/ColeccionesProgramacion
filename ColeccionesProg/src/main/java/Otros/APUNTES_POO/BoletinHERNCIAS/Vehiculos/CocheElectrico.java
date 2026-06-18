package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Vehiculos;

public class CocheElectrico extends Automovil { // si aqui da error es porque no puse el constructor

    // atributos

    private String tipo_Bateria;
    private EstadoCocheE estado;


    // constructor

    public CocheElectrico(String marca, String modelo, int velocidad_max, int peso, int num_ruedas, String tipo, int num_puertas, String tipo_gasolina, boolean tiene_aire_acondc, String tipo_Bateria, EstadoCocheE estado) {
        super(marca, modelo, velocidad_max, peso, num_ruedas, tipo, num_puertas, tipo_gasolina, tiene_aire_acondc);
        if (!tipo_Bateria.equals("LFP") && !tipo_Bateria.equals("NCM")) {
            System.out.println("Tipo de batería inválido");
        }
        this.tipo_Bateria = tipo_Bateria;
        this.estado = estado;
    }

    // métodos
}


