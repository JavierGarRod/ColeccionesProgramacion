package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Refactorizar;

public class PersonaEstudianteEmpleado extends Persona implements IEstudiante, IEmpleado {

    public PersonaEstudianteEmpleado(String nombre) {
        super(nombre);
    }

    @Override
    public void estudiar() {
        System.out.println(getNombre() + " está estudiando.");
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está trabajando.");
    }
}

