package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc3;

public class JefeProyecto extends AEmpleado {

    private boolean hablaIngles;
    private String[] certificaciones;
    private Proyecto[] proyectos;

    public JefeProyecto(String nombre, String identificador, String apellidos,
                        double salario, Categoria categoria, boolean reduccion,
                        boolean hablaIngles, String[] certificaciones, Proyecto[] proyectos) {

        super(nombre, identificador, apellidos, salario, categoria, reduccion);
        this.hablaIngles = hablaIngles;
        this.certificaciones = certificaciones;
        this.proyectos = proyectos;
    }

    @Override
    public void imprimeHorario() {
        if (tieneReduccionHoraria)
            System.out.println("Horario: 8:00 - 16:00");
        else
            System.out.println("Horario: 8:00 - 19:00");
    }

    @Override
    public String[] devuelveFunciones() {
        return new String[]{
                "Planificar",
                "Asegurar calidad",
                "Control de plazos",
                "Reporting",
                "Elaboración de ofertas"
        };
    }

    @Override
    public double calculaImporteNomina() {
        double extra = certificaciones.length * 0.05 + (hablaIngles ? 0.3 : 0);
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

