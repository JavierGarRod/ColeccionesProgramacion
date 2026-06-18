package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.GetSet;

public class Camion {

    private String dueño;
    private int numPuertas;
    private int numRuedas;
    private int tonelajeKilos;
    private int numPasajeros;
    private int numEjes;

    // Constructor vacío
    public Camion() { // se pone vacío (o no se pone) cuando quieres añadir luego los datos de la clase
    }

    // Constructor con parámetros
    public Camion(String dueño, int numPuertas, int numRuedas,
                  int tonelajeKilos, int numPasajeros, int numEjes) {

        this.dueño = dueño;
        this.numPuertas = numPuertas;
        this.numRuedas = numRuedas;
        this.tonelajeKilos = tonelajeKilos;
        this.numPasajeros = numPasajeros;
        this.numEjes = numEjes;
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

    public int getTonelajeKilos() {
        return tonelajeKilos;
    }

    public void setTonelajeKilos(int tonelajeKilos) {
        this.tonelajeKilos = tonelajeKilos;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    // imprimeResumen
    public void imprimeResumen() {
        System.out.println("Camión de " + dueño +
                " | Puertas: " + numPuertas +
                " | Ruedas: " + numRuedas +
                " | Tonelaje: " + tonelajeKilos +
                " | Pasajeros: " + numPasajeros +
                " | Ejes: " + numEjes);
    }

    // MÉTODO PEDIDO: sin lógica, devuelve valor por defecto
    public String[] getLicencias() {
        return new String[0]; // array vacío como valor por defecto
    }
}
