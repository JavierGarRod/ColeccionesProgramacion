package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.MODEL;

import java.util.Comparator;

public class OrdenPrecioDesc implements Comparator<Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        return Double.compare(l2.getPrecio(), l1.getPrecio());
    }
}
