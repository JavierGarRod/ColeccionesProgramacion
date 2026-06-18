package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej4;

import java.util.Comparator;

public class OrdenJugador implements Comparator<Jugador> {

    @Override
    public int compare(Jugador j1, Jugador j2) {
        int resultado = j1.getApellidosJugador().compareToIgnoreCase(j2.getApellidosJugador());

        if (resultado != 0) return resultado;

        resultado = j1.getNombreJugador().compareToIgnoreCase(j2.getNombreJugador());

        if (resultado != 0) return resultado; {
            return resultado = j1.getIdJugador().compareTo(j2.getIdJugador());  // compareTo es para cuando es un int
        }
    }
}

//int resultado = Integer.compare(j1.getNombreJugador(), j2.getNombreJugador()); //duración de mayor a menor
// if (resultado != 0) {
//      return resultado;
//}
//  return j1..compareTo(j2.()); // si empatan, ordenar por idActuacion
