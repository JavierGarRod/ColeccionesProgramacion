package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro6;

import java.time.LocalDate;

public class GestionaBanco {

    public static void main(String[] args) {

        BancoAlimentos banco = new BancoAlimentos();

        // Crear centros
        CentroLogistico c1 = new CentroLogistico(1, "Centro Norte", "Sevilla", 5);
        CentroLogistico c2 = new CentroLogistico(2, "Centro Sur", "Cádiz", 3);

        try {
            banco.agregarCentro(c1);
            banco.agregarCentro(c2);

            // Intento duplicado
            banco.agregarCentro(c1);
        } catch (BancoException e) {
            System.out.println("[OK] Error esperado: " + e.getMessage());
        }

        // Crear trabajadores
        Trabajador t1 = new Trabajador("Juan Pérez", "111A", LocalDate.of(1990, 5, 10),
                TipoTrabajador.ASALARIADO, 1);

        Trabajador t2 = new Trabajador("Ana López", "222B", LocalDate.of(1985, 3, 20),
                TipoTrabajador.VOLUNTARIO, 1);

        Trabajador t3 = new Trabajador("Carlos Ruiz", "333C", LocalDate.of(1998, 7, 15),
                TipoTrabajador.ASALARIADO, 2);

        try {
            banco.agregarTrabajador(t1);
            banco.agregarTrabajador(t2);
            banco.agregarTrabajador(t3);

            // Intento duplicado
            banco.agregarTrabajador(t1);
        } catch (BancoException e) {
            System.out.println("[OK] Error esperado: " + e.getMessage());
        }

        // Obtener centro
        try {
            System.out.println("\nDatos del centro 1:");
            System.out.println(banco.getCentro(1));
        } catch (BancoException e) {
            System.out.println(e.getMessage());
        }

        // Obtener trabajador
        try {
            System.out.println("\nDatos del trabajador 222B:");
            System.out.println(banco.getTrabajador("222B"));
        } catch (BancoException e) {
            System.out.println(e.getMessage());
        }
    }
}

