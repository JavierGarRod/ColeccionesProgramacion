package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro4;

import java.util.Comparator;

public class ComparadorMensajes implements Comparator<Mensaje> {

    @Override
    public int compare(Mensaje m1, Mensaje m2) {
        int cmp = Integer.compare(m2.calcularPuntuacion(), m1.calcularPuntuacion());
        if (cmp == 0) {
            return m2.getFechaCreacion().compareTo(m1.getFechaCreacion());
        }
        return cmp;
    }
}

