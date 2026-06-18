package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinENUM.Drones;

public class GestionoDrones {
    public static void main(String[] args) {
        // Crear paquetes (rutas)
        Ruta paquete1 = new Ruta("Sevilla", "Madrid", 3.5);
        Ruta paquete2 = new Ruta("Córdoba", "Granada", 2.0);
        Ruta paquete3 = new Ruta("Huelva", "Cádiz", 1.2);

        // Crear drones
        Dron dron1 = new Dron("1", 5.0);
        Dron dron2 = new Dron("2", 4.0);

        // Asignar rutas
        System.out.println("Asignando ruta 1 al dron 1: " + dron1.asignarRuta(paquete1));
        System.out.println("Asignando ruta 2 al dron 2: " + dron2.asignarRuta(paquete2));

        // Cambiar estados de paquetes
        paquete1.cambiarEstado(EstadoPaquete.RETRASADO); // uso metodo de la ruta para cambiar el estado
        paquete2.cambiarEstado(EstadoPaquete.CANCELADO);

        // Intentar asignar un paquete a un dron ocupado
        System.out.println("Intentando asignar ruta 3 al dron 1: " + dron1.asignarRuta(paquete3));
    }
}

