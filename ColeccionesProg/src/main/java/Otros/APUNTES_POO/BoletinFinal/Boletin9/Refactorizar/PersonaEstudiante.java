package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Refactorizar;

public class PersonaEstudiante extends Persona implements IEstudiante {

    public PersonaEstudiante(String nombre) {
        super(nombre);
    }

    @Override
    public void estudiar() {
        System.out.println(getNombre() + " está estudiando.");
    }
}

