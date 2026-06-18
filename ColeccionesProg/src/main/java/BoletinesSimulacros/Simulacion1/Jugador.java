package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacion1;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class    Jugador{

    //atributos
    private String nombreJugador;
    private String apellidosJugador;
    private int rankingTorneo;
    private int partidosJUgados;
    private String idJugador;
    private List<Partido> partidos;

    //constructor

    public Jugador(String nombreJugador, String apellidosJugador, int rankingTorneo, int partidosJUgados, String idJugador) {
        this.nombreJugador = nombreJugador;
        this.apellidosJugador = apellidosJugador;
        this.rankingTorneo = rankingTorneo;
        this.partidosJUgados = partidosJUgados;
        this.idJugador = idJugador;
        this.partidos = new ArrayList<>();
    }


    //getters y setters

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getApellidosJugador() {
        return apellidosJugador;
    }

    public void setApellidosJugador(String apellidosJugador) {
        this.apellidosJugador = apellidosJugador;
    }

    public int getRankingTorneo() {
        return rankingTorneo;
    }

    public void setRankingTorneo(int rankingTorneo) {
        this.rankingTorneo = rankingTorneo;
    }

    public int getPartidosJUgados() {
        return partidosJUgados;
    }

    public void setPartidosJUgados(int partidosJUgados) {
        this.partidosJUgados = partidosJUgados;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public List<Partido> getPartidos() {return partidos;}

    public void agregarPartido(Partido partido){this.partidos.add(partido);}


    //toString

    @Override
    public String toString() {
        return "Jugador{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", apellidosJugador='" + apellidosJugador + '\'' +
                ", rankingTorneo=" + rankingTorneo +
                ", partidosJUgados=" + partidosJUgados +
                ", idJugador='" + idJugador + '\'' +
                '}';
    }


    //equals y hashcode (idJugador)


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Jugador jugador)) return false;
        return Objects.equals(idJugador, jugador.idJugador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idJugador);
    }
}
