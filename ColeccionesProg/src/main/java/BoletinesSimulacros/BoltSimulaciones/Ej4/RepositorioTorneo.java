package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RepositorioTorneo {

    //atributos
    ArrayList<Partido> partidos;
    HashSet<Jugador> jugadores;

    //constructor

    public RepositorioTorneo(ArrayList<Partido> partidos, HashSet<Jugador> jugadores) {
        this.partidos = partidos;
        this.jugadores = jugadores;
    }

    public RepositorioTorneo() {
        //Constructor vacio
        this.jugadores = new HashSet<>();
        this.partidos = new ArrayList<>();
    }


    //métodos

    public void agregarJugador(Jugador nuevoJugador)
            throws TorneoException {
        if (jugadores.contains(nuevoJugador)) {
            throw new TorneoException("El jugador ya está registrado");
        }
        jugadores.add(nuevoJugador);
    }

    public void registrarPartido(Partido nuevoPartido) {
        partidos.add(nuevoPartido);
        nuevoPartido.getJ1().agregarPartido(nuevoPartido);
        nuevoPartido.getJ2().agregarPartido(nuevoPartido);
    }

    public List<Jugador> mostrarJugadores() {
        return new ArrayList<>(jugadores);
    }

    public List<Partido> mostrarPartidos(Jugador nuevoJugador)
        throws TorneoException{
            if (!jugadores.contains(nuevoJugador)) {
                throw new TorneoException("El jugador no esta en el torneo");
            }
        return nuevoJugador.getPartidos();
    }

    public List<Jugador> mostrarOrdenados() {
        List<Jugador> Lista = new ArrayList<>(jugadores);
        Collections.sort(Lista, new OrdenJugador());
        return Lista;
    }


}
