package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej3;

import java.time.LocalDate;

public class GestionaFactoria {
    public static void main(String[] args) {

        //creo lista
        Robot inventarioRobots [] = new Robot[20];

        //creo robots
        Robot r1P = new Pintor("R11",100,"electrico","Muy chulo");
        Robot r1R = new Soldador("R22", 9, "electrico","No tan chulo", 13.4, "Seguro");
        Robot r1E = new Ensamblador("R33", 50, "gasolina", "Está bien");
        Robot r2P = new Pintor("R12",10,"electrico","Muy good");

        // Creo un array con los robots que quiero meter
        Robot[] robotsCreados = { r1P, r1R, r1E, r2P };

        // Los meto en inventario con un for
        for (int i = 0; i < robotsCreados.length; i++) {
            inventarioRobots[i] = robotsCreados[i];
        }
        //recorro inventario
        for (Robot r: inventarioRobots){
            if(r != null){
                System.out.println(r);
            }
        }
        // INVENTARIO DISPOSITIVOS WIFI
        DispositivoWifi inventarioDispositivos[] = new DispositivoWifi[40];
        DispositivoWifi d1 = new SensorTemperatura("AA:BB:CC:11", LocalDate.now().minusMonths(4), 22.5);
        DispositivoWifi d2 = new CamaraSeguridad("DD:EE:FF:22", LocalDate.now().minusWeeks(3));
        DispositivoWifi d3 = new PuertaAutomatica("11:22:33:44", LocalDate.now().minusMonths(2));

        inventarioDispositivos[0] = d1;
        inventarioDispositivos[1] = d2;
        inventarioDispositivos[2] = d3;

                // MOSTRAR INVENTARIO DISPOSITIVOS

        System.out.println("\n--- INVENTARIO DISPOSITIVOS WIFI ---");
        for (DispositivoWifi d : inventarioDispositivos) {
            if (d != null)
                System.out.println(d);
        }
    }
}
