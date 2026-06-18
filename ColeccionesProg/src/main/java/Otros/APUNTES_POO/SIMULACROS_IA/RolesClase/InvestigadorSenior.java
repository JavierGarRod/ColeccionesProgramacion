package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.RolesClase;

import java.time.LocalDate;

public class InvestigadorSenior extends Persona implements Investigador {

    //constructor super
    public InvestigadorSenior(String nombre, String id, LocalDate fecha) {
        super(nombre, id, fecha);
    }

    // métodos implementados
    @Override
    public void investigar() {
        System.out.println("Estoy investigando");
    }
}
