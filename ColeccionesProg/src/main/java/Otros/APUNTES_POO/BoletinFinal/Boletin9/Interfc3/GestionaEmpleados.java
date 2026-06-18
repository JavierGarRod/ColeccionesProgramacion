package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc3;

public class GestionaEmpleados {

    public static void main(String[] args) {

        Desarrollador dev = new Desarrollador(
                "Ana", "D01", "López", 2000,
                Categoria.DESARROLLADOR_JUNIOR, false,
                new String[]{"Java", "Python"},
                new String[]{"Spring"},
                1
        );

        Proyecto p1 = new Proyecto();
        Proyecto p2 = new Proyecto();

        JefeProyecto jefe = new JefeProyecto(
                "Carlos", "J01", "Martín", 3500,
                Categoria.JEFE_PROYECTO, true,
                true,
                new String[]{"PMP", "Scrum Master"},
                new Proyecto[]{p1, p2}
        );

        // DESARROLLADOR
        System.out.println(dev);
        dev.imprimeHorario();
        System.out.println("Nómina: " + dev.calculaImporteNomina());

        System.out.println();

        // JEFE DE PROYECTO
        System.out.println(jefe);
        jefe.imprimeHorario();
        System.out.println("Nómina: " + jefe.calculaImporteNomina());
    }
}


