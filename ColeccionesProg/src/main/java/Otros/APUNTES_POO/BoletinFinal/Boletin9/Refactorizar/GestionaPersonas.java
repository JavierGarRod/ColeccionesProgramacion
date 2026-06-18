package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Refactorizar;

public class GestionaPersonas {
    public static void main(String[] args) {

        Persona[] personas = new Persona[10];

        personas[0] = new PersonaEmpleado("Ana");
        personas[1] = new PersonaCliente("Luis");
        personas[2] = new PersonaEstudiante("María");
        personas[3] = new PersonaArtista("Carlos");
        personas[4] = new PersonaEstudianteEmpleado("Sofía");

        for (Persona p : personas) {
            if (p == null) continue; // ta wai el continue

            p.identificarse(); // se indentifican todas las personas y a continuación,dicen a que se dedican

            if (p instanceof IEmpleado e) e.trabajar();
            if (p instanceof ICliente c) c.comprar();
            if (p instanceof IEstudiante est) est.estudiar();
            if (p instanceof IArtista a) a.pintar();

            System.out.println();
        }
    }
}

