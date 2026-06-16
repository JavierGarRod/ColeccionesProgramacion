package MODELO;

import java.util.Comparator;

public class OrdenActuacion implements Comparator<Actuacion> {

    @Override
    public int compare(Actuacion a1, Actuacion a2) {
        int resultado = Integer.compare(a2.getDuracionMinutos(), a1.getDuracionMinutos()); //duración de mayor a menor
        if (resultado != 0) {
            return resultado;
        }
        return a1.getIdActuacion().compareTo(a2.getIdActuacion()); // si empatan, ordenar por idActuacion
    }

}
