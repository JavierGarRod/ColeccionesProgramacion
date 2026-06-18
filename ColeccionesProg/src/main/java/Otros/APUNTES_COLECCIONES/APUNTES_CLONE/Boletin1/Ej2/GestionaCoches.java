package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_CLONE.Boletin1.Ej2;

public class GestionaCoches {

    public static void main(String[] args) {

        // APARTADO A — MOTOR

        Motor motor1 = new Motor("gasolina", 100);

        // motor2 NO es una copia → es la MISMA referencia
        Motor motor2 = motor1;

        motor2.setTipo("diesel");

        System.out.println("motor1: " + motor1);
        System.out.println("motor2: " + motor2);

        System.out.println("\nAmbos cambiaron porque apuntan al MISMO objeto.");

        // SOLUCIÓN: usar clone()
        Motor motor3 = motor1.clone();
        motor3.setTipo("electrico");

        System.out.println("\nDespués de clonar:");
        System.out.println("motor1: " + motor1);
        System.out.println("motor3 (clon): " + motor3);


        // APARTADO B — COCHE

        System.out.println("\nPRUEBA DEEP CLONE COCHE");


        Motor mOriginal = new Motor("gasolina", 120);
        Coche cocheOriginal = new Coche("1234ABC", "Toyota", 50000, mOriginal);

        // Clon profundo
        Coche cocheCopia = cocheOriginal.clone();

        // Modificamos SOLO el motor del clon
        cocheCopia.getMotor().setCv(300);

        System.out.println("Coche original:");
        System.out.println(cocheOriginal);

        System.out.println("\nCoche copia (modificado):");
        System.out.println(cocheCopia);

        System.out.println("\nEl original NO cambia → deep clone funciona.");
    }
}
