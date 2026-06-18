package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_CLONE.Boletin1.Ej1;

public class GestionaReservas {

    public static void main(String[] args) {

        RepositorioReservas repo = new RepositorioReservas();

        // CREAR RESERVAS

        Reserva r1 = new Reserva("Carlos Ruiz", "Roma", "14A", 220);
        Reserva r2 = new Reserva("Carla Ruiz", "Roma", "14B", 220);

        repo.addReserva(r1);
        repo.addReserva(r2);


        // RECUPERAR RESERVA 1

        Reserva reservaPrevia = repo.buscar(1);

        // MOSTRAR LISTA INICIAL

        System.out.println("LISTA INICIAL:");
        repo.mostrar();

        // MODIFICAR LA COPIA

        reservaPrevia.setAsiento("22C");
        reservaPrevia.setPrecio(195);

        System.out.println("\nReserva original en el repositorio:");
        System.out.println(repo.buscar(1));

        System.out.println("Reserva previa modificada:");
        System.out.println(reservaPrevia);


        // APARTADO 2: SIMULACIÓN

        System.out.println("\nSimulación cambio reserva 2 a asiento 3D:");
        Reserva simulada = repo.cambiarAsiento(2, "3D", false);
        System.out.println("Resultado simulado: " + simulada);

        System.out.println("\nLista después de la simulación (NO debe cambiar):");
        repo.mostrar();


        // APARTADO 2: CONFIRMACIÓN

        System.out.println("\nConfirmando cambio reserva 2 a asiento 3D:");
        repo.cambiarAsiento(2, "3D", true);

        System.out.println("\nLista final (SÍ debe cambiar):");
        repo.mostrar();
    }
}

