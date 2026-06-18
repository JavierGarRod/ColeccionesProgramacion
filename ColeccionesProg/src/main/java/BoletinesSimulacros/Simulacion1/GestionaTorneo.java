package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacion1;


import java.time.LocalDate;

public class GestionaTorneo {
    public static void main(String[] args) {

        //Actuaciones

        Jugador j1 = new Jugador("a", "aaaaa", 2, 1, "123");
        Jugador j2 = new Jugador("b", "rrrrr", 1, 3, "456");
        Jugador j3 = new Jugador("c", "ccccc", 4, 3, "789");
        Jugador j4 = new Jugador("d", "ddddd", 3, 2, "471");

        //Escenarios

        Partido p1 = new Partido(EstadoPartidos.PLANIFICADO, LocalDate.now(), 22, j1, j2);
        Partido p2 = new Partido(EstadoPartidos.EN_CURSO, LocalDate.now(), 12, j1, j2);
        Partido p3 = new Partido(EstadoPartidos.FINALIZADO, LocalDate.now(), 33, j3, j4);

        //Repositorio

        RepositorioTorneo repo = new RepositorioTorneo();

        System.out.println("Registrar jugadores: ");
        try {
            repo.agregarJugador(j1);
            repo.agregarJugador(j2);
            repo.agregarJugador(j3);
            repo.agregarJugador(j4);
            System.out.println("Jugadores registrados");
        } catch (TorneoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Registrar partidos:");
        try {
            repo.registrarPartido(p1);
            repo.registrarPartido(p2);
            repo.registrarPartido(p3);
            System.out.println("Partidos registrados");
        } catch (TorneoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Mostrar jugadores: "); // Esto lo utilizamos para imprimir toda la lista de jugadores
        for (Jugador j : repo.mostrarJugadores()) {
            System.out.println(j.getNombreJugador());
        }

        System.out.println("Mostrar partidos:");
        try{
            for(Partido p : repo.mostrarPartidos(j1)){
                System.out.println(p);
            }
        }
        catch(TorneoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Ganador del partido 1: ");
        try{
            Jugador ganador = j1;
            System.out.println(ganador.getNombreJugador());
        }
        catch(TorneoException e){
            System.out.println(e.getMessage());
        }

        try{
            if (p1.getEstadoPartidos() == EstadoPartidos.PLANIFICADO){
                System.out.println("Este partido esta planificado");
            }
        }
        catch(TorneoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Lista ordenada: ");

        for (Jugador j : repo.mostrarOrdenados()){
            System.out.println((j));
        }
    }
}
