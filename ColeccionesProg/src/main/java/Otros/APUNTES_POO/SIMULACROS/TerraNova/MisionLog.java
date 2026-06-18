package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.TerraNova;

import java.time.LocalDate;

public class MisionLog extends Mision{

    //atributos
    private double carga;

    //constructor
    public MisionLog(int cod, String nombre, LocalDate fecha_lanz, Nave nave, double carga) {
        super(cod, nombre, fecha_lanz, nave);
        this.carga = carga;
    }

    //getters setters

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public boolean mision_riesgo() {
        if(getCarga() <= 50)return false;
        switch (getFecha_lanz().getDayOfWeek()){
            case SATURDAY,SUNDAY:
                return true;
            default:
                return false;
        }
    }

    // métodos


}
