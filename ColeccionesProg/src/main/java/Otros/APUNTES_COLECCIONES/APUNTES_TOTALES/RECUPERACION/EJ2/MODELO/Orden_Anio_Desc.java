package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.MODELO;

import java.util.Comparator;

public class Orden_Anio_Desc implements Comparator<Pelicula> {
    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        return p2.getFecha().compareTo(p1.getFecha());
    }

}
