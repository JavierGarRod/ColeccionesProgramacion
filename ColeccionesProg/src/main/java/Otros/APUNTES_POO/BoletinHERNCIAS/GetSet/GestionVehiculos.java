package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.GetSet;

public class GestionVehiculos {
    public static void main(String[] args) {

        System.out.println("=== CREACIÓN DE VEHÍCULOS ===");

        // Crear automóviles
        Automovil a1 = new Automovil("Helen", 5, 4);
        a1.setCalificacionEcologica("C");

        Automovil a2 = new Automovil("Pepe", 3, 4);
        a2.setCalificacionEcologica("B");

        // Crear camiones
        Camion c1 = new Camion("Javi", 2, 6, 5000, 2, 3);
        Camion c2 = new Camion("Laura", 2, 8, 12000, 3, 4);

        System.out.println("=== RESÚMENES DE VEHÍCULOS ===");
        a1.imprimeResumen();
        a2.imprimeResumen();
        c1.imprimeResumen();
        c2.imprimeResumen();

        System.out.println("=== PROBANDO MÉTODOS SIN LÓGICA ===");

        // tieneLimitacion (Automóvil)
        System.out.println("¿a1 tiene limitación en Madrid? " + a1.tieneLimitacion("Madrid"));
        System.out.println("¿a2 tiene limitación en Sevilla? " + a2.tieneLimitacion("Sevilla"));

        // getLicencias (Camión)
        System.out.println("Licencias de c1:");
        String[] licenciasC1 = c1.getLicencias();
        System.out.println("Tamaño del array: " + licenciasC1.length);

        System.out.println("Licencias de c2:");
        String[] licenciasC2 = c2.getLicencias();
        System.out.println("Tamaño del array: " + licenciasC2.length);

        System.out.println("=== FIN DE LA SIMULACIÓN ===");
    }
}
