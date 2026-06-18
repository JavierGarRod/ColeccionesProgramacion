package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro5;

import java.util.*;

public class RepositorioTorneo {

    private Set<Jugador> jugadores;
    private List<Partido> partidos;

    public RepositorioTorneo() {
        jugadores = new HashSet<>();
        partidos = new ArrayList<>();
    }

    public void agregarJugador(Jugador j) throws TorneoException {
        if (!jugadores.add(j)) {
            throw new TorneoException("El jugador ya está registrado");
        }
    }

    public void registrarPartido(Partido p) {
        partidos.add(p);
        p.getJugador1().agregarPartido(p);
        p.getJugador2().agregarPartido(p);
    }

    public List<Jugador> mostrarJugadores() {
        return new ArrayList<>(jugadores);
    }

    public List<Partido> mostrarPartidosJugador(int numeroFicha) throws TorneoException {
        Jugador j = jugadores.stream()
                .filter(x -> x.getNumeroFicha() == numeroFicha)
                .findFirst()
                .orElseThrow(() -> new TorneoException("Jugador no encontrado"));

        return j.getPartidos();
    }

    public Jugador getJugadorGanador(Partido p) throws TorneoException {
        if (p.getEstado() == EstadoPartido.PLANIFICADO) {
            throw new TorneoException("El partido aún no se ha jugado");
        }

        int sets1 = 0;
        int sets2 = 0;

        for (int i = 0; i < p.getSetsJugador1().size(); i++) {
            if (p.getSetsJugador1().get(i) > p.getSetsJugador2().get(i)) sets1++;
            else sets2++;
        }

        return (sets1 > sets2) ? p.getJugador1() : p.getJugador2();
    }

    public List<Jugador> getJugadoresOrdenados() {
        return jugadores.stream()
                .sorted(Comparator
                        .comparing(Jugador::getApellido)
                        .thenComparing(Jugador::getNombre)
                        .thenComparing(Jugador::getNumeroFicha))
                .toList();
    }
}

