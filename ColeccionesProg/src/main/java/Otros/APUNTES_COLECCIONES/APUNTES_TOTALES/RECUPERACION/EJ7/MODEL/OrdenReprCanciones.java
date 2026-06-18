package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.MODEL;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.REPOSITORY.RepoCanciones;

import java.util.Comparator;

public class OrdenReprCanciones implements Comparator<Artista> {

    private RepoCanciones repo;

    public OrdenReprCanciones(RepoCanciones repo) {
        this.repo = repo;
    }

    @Override
    public int compare(Artista a1, Artista a2) {
        return Integer.compare(repo.calcularCantReprXArtista(a2), repo.calcularCantReprXArtista(a1));
    }
}
