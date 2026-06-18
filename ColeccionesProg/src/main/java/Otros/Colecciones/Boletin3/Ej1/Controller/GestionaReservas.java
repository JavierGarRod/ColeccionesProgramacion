package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin3.Ej1.Controller;

import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin3.Ej1.Models.RepositorioReservas;
import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin3.Ej1.Models.Reserva;

public class GestionaReservas {

    public static void main(String[] args) {

        RepositorioReservas repo = new RepositorioReservas();

        // Reservas iniciales
        Reserva r1 = new Reserva("Carlos Ruiz", "Roma", "14A", 220);
        Reserva r2 = new Reserva("Carla Ruiz", "Roma", "14B", 220);

        repo.addReserva(r1);
        repo.addReserva(r2);

        // === SIMULACIÓN ===
        System.out.println("===Simulación del cambio de asiento (no modifica)===");
        Reserva simulada = repo.cambiarAsiento(2, "3D", false);
        System.out.println("Reserva simulada: " + simulada);

        System.out.println("\n===Lista original (no debe haber cambiado)===");
        repo.mostrarReservas();

        // === CONFIRMACIÓN ===
        System.out.println("\n===Confirmación del cambio de asiento===");
        Reserva confirmada = repo.cambiarAsiento(2, "3D", true);
        System.out.println("Reserva confirmada: " + confirmada);

        System.out.println("\n===Lista final (ya debe estar cambiado)===");
        repo.mostrarReservas();
    }
}
