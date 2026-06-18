package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Vehiculos;

public class Vehiculo {

    // Atributos comunes a TODOS los vehículos
    private String marca;
    private String modelo;
    private int velocidad_max;
    private int peso;
    private int num_ruedas;
    private String tipo; // B, C, ECO, etc.

    // Constructor
    public Vehiculo(String marca, String modelo, int velocidad_max, int peso, int num_ruedas, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad_max = velocidad_max;
        this.peso = peso;
        this.num_ruedas = num_ruedas;
        this.tipo = tipo;
    }

    // Métodos

    public boolean tieneLimitacionParaCircular(String ciudad) {

        ciudad = ciudad.toLowerCase(); // evitar problemas con mayúsculas

        if (ciudad.equals("madrid") || ciudad.equals("barcelona")) {
            if (tipo.equals("B") || tipo.equals("C")) {
                return true;
            } else {
                return false;
            }
        }

        else if (ciudad.equals("valencia") || ciudad.equals("sevilla")) {
            if (tipo.equals("C")) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }


    @Override
    public String toString() {
        return marca + " " + modelo + " (" + tipo + ")";
    }
}

