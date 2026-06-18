package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.MODELO;

import java.util.Comparator;

public class OrdenPorLikesDesc implements Comparator<Publicacion> {
    @Override
    public int compare(Publicacion p1, Publicacion p2) {
        return Integer.compare(p2.getLikes(), p1.getLikes()); //descendente
    }
}
