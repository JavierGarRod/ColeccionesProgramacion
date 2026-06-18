package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.RolesClase;

import java.time.LocalDate;

public class ProfesorInvestigador extends Persona implements Profesor, Investigador {

    // constructor super
    public ProfesorInvestigador(String nombre, String id, LocalDate fecha) {
        super(nombre, id, fecha);
    }

    //metodos implementados
    @Override
    public void investigar() {
        System.out.println("Estoy investigando");
    }

    @Override
    public void impartirClase() {
        System.out.println("Estoy impartiendo clase");
    }
}
