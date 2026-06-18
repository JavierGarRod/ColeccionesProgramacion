package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinENUM.Robots;

public class GestionRobots {
    public static void main(String[] args) {

        // Crear habitaciones
        Habitacion h1 = new Habitacion("Hab1", 20.5, 5.4);
        Habitacion h2 = new Habitacion("Hab2", 30.4, 2.1);
        Habitacion h3 = new Habitacion("Hab3", 40, 0);

        // Crear robots
        Robot r1 = new Robot("R-01", 10, EstadoRobot.AUTO, 80);
        Robot r2 = new Robot("R-02", 5, EstadoRobot.MANUAL, 60);

        // Asignar habitaciones
        System.out.println("Asignar Hab1 a R1: " + r1.asignarHabitacion(h1));
        System.out.println("Asignar Hab2 a R2: " + r2.asignarHabitacion(h2)); // debe fallar

        // Cambiar estados manualmente
        h1.estado = EstadoHabitacion.BLOQUEADA;
        h2.estado = EstadoHabitacion.LIBRE;

        // Intentar asignar una habitación a un robot que NO está en AUTO
        System.out.println("Intentar asignar Hab3 a R2: " + r2.asignarHabitacion(h3));

        // Utilizo metodos de robot
        r1.vaciarDeposito();
        System.out.println("El depósito del robot 1 es: " + r1.nvl_suciedad);
        r2.recargar();
        System.out.println("Se ha recargado la batería del robot 2 y ahora es: " + r2.bateria);
    }
}
