package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.RolesClase;

import java.time.LocalDate;

public class Taller extends Actividad {

    // constructor super
    public Taller(String titulo, LocalDate fecha, int horas) {
        super(titulo, fecha, horas);
    }

    // metodos herencia
    @Override
    public double calcularCoste() {
        double coste =  getHoras() * 35;
        return coste;
    }
}
