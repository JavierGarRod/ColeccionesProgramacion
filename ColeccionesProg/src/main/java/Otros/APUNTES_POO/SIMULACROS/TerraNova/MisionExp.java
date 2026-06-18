package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.TerraNova;

import java.time.LocalDate;

public class MisionExp extends Mision{

    //atributos
    private String destino;
    private int tripulacion;

    //constructor
    public MisionExp(int cod, String nombre, LocalDate fecha_lanz, Nave nave, int tripulacion, String destino) {
        super(cod, nombre, fecha_lanz, nave);
        this.tripulacion = tripulacion;
        this.destino = destino;
    }

    //getters setters

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }

    @Override
    public boolean mision_riesgo() {
        LocalDate hoy = LocalDate.now();

        if (destino.equalsIgnoreCase("Marte")){
            return true;
        } else if (!getFecha_lanz().isAfter(hoy.plusDays(7))) {
            return true;
        }
        return false;
    }


    // métodos

}
