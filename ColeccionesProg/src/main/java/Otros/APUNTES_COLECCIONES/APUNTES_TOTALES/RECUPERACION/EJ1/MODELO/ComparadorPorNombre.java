package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.MODELO;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        return c1.getNombre().compareToIgnoreCase(c2.getNombre());
    }
}
