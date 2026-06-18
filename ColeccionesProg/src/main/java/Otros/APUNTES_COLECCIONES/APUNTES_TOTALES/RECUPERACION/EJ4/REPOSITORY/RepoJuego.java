package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.REPOSITORY;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.EXCEPTIONS.PartidoDuplicadoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.EXCEPTIONS.PartidoYaFinalizadoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL.Jugador;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL.OrdenacionRankingParejas;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL.Pareja;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL.Partido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RepoJuego {

    //atributos
    HashSet<Jugador> jugadores;
    HashSet<Pareja> parejas;
    HashSet<Partido> partidos;

    //constructor
    public RepoJuego() {
        this.jugadores = new HashSet<>();
        this.parejas = new HashSet<>();
        this.partidos = new HashSet<>();
    }

    //métodos

    public void registrar_parejas(Pareja pareja){
        boolean existe = false;
        for(Pareja p: parejas){
            if(p.getNombre().equalsIgnoreCase(pareja.getNombre())){
                existe = true;
            }
        }
        if(!existe){
            parejas.add(pareja);
        }
    }

    public void registrar_jugador(Jugador jugador){
        boolean existe = false;
        for(Jugador j: jugadores){
            if(j.getNombre().equalsIgnoreCase(jugador.getNombre()) && j.getApellidos().equalsIgnoreCase(jugador.getApellidos())){
                existe = true;
            }
        }
        if(!existe){
            jugadores.add(jugador);
        }


    }

    public void programarPartido(Partido partido) throws PartidoDuplicadoException {
        for(Partido p: partidos){
            if((p.getP1().equals(partido.getP1()) && p.getP2().equals(partido.getP2())) ||
                    (p.getP1().equals(partido.getP2()) && p.getP2().equals(partido.getP1()))) {
                throw new PartidoDuplicadoException("Partido duplicado");
            }
        }
        partidos.add(partido);
    }

    public void registrarResultado(Partido partido, Integer[] resultado) throws PartidoYaFinalizadoException {
        if(partido.isFinalizado()){
            throw new PartidoYaFinalizadoException("Partido ya finalizado");
        }
        partido.setResultado(resultado);
        partido.setFinalizado(true);
    }

    public int contadorVictorias(Pareja pareja) {
        int contador = 0;

        for (Partido p : partidos) {
            if (p.isFinalizado() && p.getResultado() != null) {
                if (p.getP1().equals(pareja) && p.getResultado()[0] > p.getResultado()[1]) { //para saber si la pareja ganó el partido o no
                    contador++;
                } else if (p.getP2().equals(pareja) && p.getResultado()[1] > p.getResultado()[0]) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public List<Pareja> mostrarRankingParejas(){
        List<Pareja> lista = new ArrayList<>(parejas); //igual que usar lista.addAll(parejas);
        Collections.sort(lista, new OrdenacionRankingParejas(this)); //"this" es el propio repo
        return lista;
    }

    public List<Partido> mostrarPartidosPendientes(){
        List<Partido> partidoList = new ArrayList<>();
        for(Partido p: partidos){
            if(p.getResultado() == null){
                partidoList.add(p);
            }
        }
        Collections.sort(partidoList);
        return partidoList;
    }

    public List<Partido> getHistorialPareja(Pareja pareja) {
        List<Partido> historial = new ArrayList<>();
        for (Partido p : partidos) {
            if (p.getP1().equals(pareja) || p.getP2().equals(pareja)) { //"aparece esta pareja en este partido?"
                historial.add(p);
            }
        }
        return historial;
    }

    public Pareja getParejaConMasVictorias() {
        return mostrarRankingParejas().get(0);  // el primero de la lista es el que más victorias tiene
    }
}
