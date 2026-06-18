package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.GetSet;

public class Automovil {

    private String dueño;
    private int numPuertas;
    private int numRuedas;
    private String calificacionEcologica;

    // Constructor vacío
    public Automovil() {
    }

    // Constructor con parámetros
    public Automovil(String dueño, int numPuertas, int numRuedas) {
        this.dueño = dueño;
        this.numPuertas = numPuertas;
        this.numRuedas = numRuedas;
    }

    // Getters y setters
    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(String calificacionEcologica) {
        this.calificacionEcologica = calificacionEcologica;
    }

    // imprimeResumen
    public void imprimeResumen() {
        System.out.println("Automóvil de " + dueño +
                " | Puertas: " + numPuertas +
                " | Ruedas: " + numRuedas +
                " | Eco: " + calificacionEcologica);
    }

    // MÉTODO PEDIDO: sin lógica, devuelve valor por defecto
    public boolean tieneLimitacion(String ciudad) {
        return false;  // valor por defecto
    }
}

