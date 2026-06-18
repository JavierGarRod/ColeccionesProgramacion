package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin2.Ej3.Model;

import APUNTES_EXCEPCIONES.Boletines.boletin2.Ej3.Exceptions.SensorException;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Sensor {

    //atributos
    private int id;
    private static int contador;
    private TiposParametros tipoParámetro;
    private double minimo;
    private double maximo;
    private Lectura [] historialLectura;
    private int numLecturas;

    //constructor
    public Sensor(TiposParametros tipoParámetro, double minimo, double maximo) {
        this.tipoParámetro = tipoParámetro;
        this.minimo = minimo;
        this.maximo = maximo;
        this.historialLectura = new Lectura[100];
        this.id = contador++;
    }

    //métodos
    public void registrarLectura(double valor, LocalDateTime fecha) throws SensorException {
        if (numLecturas > 0){
            Lectura ultima = historialLectura[numLecturas - 1];

            if (fecha.isBefore(ultima.getHorayfecha())){
                throw new SensorException(1,"Marca de tiempo fuera del órden");
            }
        }
        boolean valida = true;
        if (valor < minimo || valor > maximo) {
            valida = false; // lectura anómala
        }
        if (numLecturas < historialLectura.length) {
            historialLectura[numLecturas] = new Lectura(fecha, valor, valida); // se guarda una lectura nueva dentro del array
            numLecturas++;
        }
    }
    public int contarLecturasAnomalas() {
        int contador = 0;
        for (int i = 0; i < numLecturas; i++) {
            if (!historialLectura[i].isValida()) {
                contador++;
            }
        }
        return contador;
    }

    //getters y setters

    public TiposParametros getTipoParámetro() {
        return tipoParámetro;
    }

    public void setTipoParámetro(TiposParametros tipoParámetro) {
        this.tipoParámetro = tipoParámetro;
    }

    public double getMinimo() {
        return minimo;
    }

    public void setMinimo(double minimo) {
        this.minimo = minimo;
    }

    public double getMaximo() {
        return maximo;
    }

    public void setMaximo(double maximo) {
        this.maximo = maximo;
    }

    public Lectura[] getHistorialLectura() {
        return historialLectura;
    }

    public void setHistorialLectura(Lectura[] historialLectura) {
        this.historialLectura = historialLectura;
    }

    //toString
    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", tipoParámetro=" + tipoParámetro +
                ", minimo=" + minimo +
                ", maximo=" + maximo +
                ", historialLectura=" + Arrays.toString(historialLectura) +
                '}';
    }
}
