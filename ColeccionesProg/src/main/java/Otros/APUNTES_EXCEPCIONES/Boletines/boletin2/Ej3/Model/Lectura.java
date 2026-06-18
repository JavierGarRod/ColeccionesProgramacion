package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin2.Ej3.Model;

import java.time.LocalDateTime;

public class Lectura {

    //atributos
    private LocalDateTime horayfecha;
    private double cantidadLeida;
    private boolean valida;

    //constructor
    public Lectura(LocalDateTime horayfecha, double cantidadLeida, boolean valida) {
        this.horayfecha = horayfecha;
        this.cantidadLeida = cantidadLeida;
        this.valida = valida;
    }

    //getters y setters

    public LocalDateTime getHorayfecha() {
        return horayfecha;
    }

    public void setHorayfecha(LocalDateTime horayfecha) {
        this.horayfecha = horayfecha;
    }

    public double getCantidadLeida() {
        return cantidadLeida;
    }

    public void setCantidadLeida(double cantidadLeida) {
        this.cantidadLeida = cantidadLeida;
    }

    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }

    //toString
    @Override
    public String toString() {
        return "Lectura{" +
                "horayfecha=" + horayfecha +
                ", cantidadLeida=" + cantidadLeida +
                ", valida=" + valida +
                '}';
    }
}
