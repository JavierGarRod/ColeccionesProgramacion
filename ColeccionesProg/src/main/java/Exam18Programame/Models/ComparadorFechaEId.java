package Exam18Programame.Models;

import java.util.Comparator;

public class ComparadorFechaEId implements Comparator<IntentoReto> {
    @Override
    public int compare(IntentoReto o1, IntentoReto o2) {
        int resultado=o1.getFechaHoraSuperacion().compareTo(o2.getFechaHoraSuperacion());
        if(o1.getFechaHoraSuperacion().compareTo(o2.getFechaHoraSuperacion())==0){
            resultado= o1.getInformacionReto().getIdReto().compareTo(o2.getInformacionReto().getIdReto());
        }
        return resultado;
    }
}
