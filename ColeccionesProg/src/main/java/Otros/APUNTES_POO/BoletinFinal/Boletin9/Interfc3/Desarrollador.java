package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc3;

public class Desarrollador extends AEmpleado {

    private String[] lenguajes;
    private String[] frameworks;
    private int turno; // 1 o 2

    public Desarrollador(String nombre, String identificador, String apellidos,
                         double salario, Categoria categoria, boolean reduccion,
                         String[] lenguajes, String[] frameworks, int turno) {

        super(nombre, identificador, apellidos, salario, categoria, reduccion);
        this.lenguajes = lenguajes;
        this.frameworks = frameworks;
        this.turno = turno;
    }

    @Override
    public void imprimeHorario() {
        if (turno == 1) {
            if (tieneReduccionHoraria)
                System.out.println("Horario: 8:00 - 14:00");
            else
                System.out.println("Horario: 8:00 - 16:00");
        } else {
            if (tieneReduccionHoraria)
                System.out.println("Horario: 16:00 - 22:00");
            else
                System.out.println("Horario: 16:00 - 00:00");
        }
    }

    @Override
    public String[] devuelveFunciones() {
        return new String[]{
                "Codificar",
                "Diseñar planes de prueba",
                "Ejecutar pruebas"
        };
    }

    @Override
    public double calculaImporteNomina() {
        double extra = lenguajes.length * 0.01 + frameworks.length * 0.03;
        return salario + salario * extra;
    }

    @Override
    public String toString() {
        return "ID: " + identificador +
                " | Nombre: " + nombre +
                " | Salario: " + salario +
                " | Categoría: " + categoria +
                " | Reducción: " + (tieneReduccionHoraria ? "Sí" : "No") +
                " | Funciones: " + String.join(", ", devuelveFunciones());
    }
}

