package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.RolesClase;

import java.time.LocalDate;

public class EstudianteBecado extends Persona implements Estudiante {

    // constructor super
    public EstudianteBecado(String nombre, String id, LocalDate fecha) {
        super(nombre, id, fecha);
    }

    // metodo impllementado
    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando");
    }
}
