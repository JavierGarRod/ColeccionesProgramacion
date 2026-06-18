package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro5;

import java.time.LocalDate;
import java.util.List;

public class GestionaTorneo {

    public static void main(String[] args) {

        RepositorioTorneo repo = new RepositorioTorneo();

        // Crear jugadores
        Jugador j1 = new Jugador(1, "Carlos", "Alcaraz", "España", 2);
        Jugador j2 = new Jugador(2, "Novak", "Djokovic", "Serbia", 1);
        Jugador j3 = new Jugador(3, "Rafael", "Nadal", "España", 5);
        Jugador j4 = new Jugador(4, "Daniil", "Medvedev", "Rusia", 3);

        try {
            repo.agregarJugador(j1);
            repo.agregarJugador(j2);
            repo.agregarJugador(j3);
            repo.agregarJugador(j4);

            // Intento duplicado
            repo.agregarJugador(j1);
        } catch (TorneoException e) {
            System.out.println("[OK] Error esperado: " + e.getMessage());
        }

        // Registrar partidos
        Partido p1 = new Partido(j1, j2, EstadoPartido.FINALIZADO,
                LocalDate.now(),
                List.of(6, 3, 6),
                List.of(4, 6, 4));

        Partido p2 = new Partido(j3, j4, EstadoPartido.FINALIZADO,
                LocalDate.now(),
                List.of(6, 6),
                List.of(4, 2));

        Partido p3 = new Partido(j1, j2, EstadoPartido.PLANIFICADO,
                LocalDate.now().plusDays(1),
                List.of(), List.of());

        repo.registrarPartido(p1);
        repo.registrarPartido(p2);
        repo.registrarPartido(p3);

        // Mostrar jugadores ordenados
        System.out.println("\nJugadores ordenados:");
        repo.getJugadoresOrdenados().forEach(System.out::println);

        // Mostrar partidos de un jugador
        try {
            System.out.println("\nPartidos de Alcaraz:");
            repo.mostrarPartidosJugador(1).forEach(System.out::println);
        } catch (TorneoException e) {
            System.out.println(e.getMessage());
        }

        // Ganador de un partido
        try {
            Jugador ganador = repo.getJugadorGanador(p1);
            System.out.println("\nGanador del partido p1: " + ganador);
        } catch (TorneoException e) {
            System.out.println(e.getMessage());
        }

        // Error: partido planificado
        try {
            repo.getJugadorGanador(p3);
        } catch (TorneoException e) {
            System.out.println("[OK] Error esperado: " + e.getMessage());
        }
    }
}

