package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.RolesClase;

import java.time.LocalDate;

public class EstudianteTecnico extends Persona implements Estudiante, Tecnico {

    // constructor super
    public EstudianteTecnico(String nombre, String id, LocalDate fecha) {
        super(nombre, id, fecha);
    }

    // metodos implementados
    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando");
    }

    @Override
    public void repararEquipos() {
        System.out.println("Estoy reparando equipos");
    }
}
