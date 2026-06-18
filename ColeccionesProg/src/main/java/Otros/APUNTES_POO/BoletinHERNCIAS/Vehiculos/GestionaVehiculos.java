package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Vehiculos;

public class GestionaVehiculos {
    public static void main(String[] args) {

        // Dos automóviles
        Vehiculo cocheEco = new Automovil("Toyota", "Yaris", 180, 1200, 4, "ECO", 5, "gasolina", true);
        Vehiculo cocheC = new Automovil("Seat", "Leon", 190, 1300, 4, "C", 5, "diesel", true);

        System.out.println("cocheEco Madrid: " + cocheEco.tieneLimitacionParaCircular("Madrid"));
        System.out.println("cocheC Madrid: " + cocheC.tieneLimitacionParaCircular("Madrid"));
        System.out.println("cocheC Sevilla: " + cocheC.tieneLimitacionParaCircular("Sevilla"));

        // Dos camiones
        Vehiculo camionPeque = new Camion("Iveco", "Mini", 120, 500, 4, "B", 2.5, "ligero", 2.0);
        Vehiculo camionGrande = new Camion("MAN", "Gordo", 140, 5000, 6, "C", 6.0, "pesado", 3.5);

        System.out.println(camionPeque);
        System.out.println(camionGrande);
    }
}
