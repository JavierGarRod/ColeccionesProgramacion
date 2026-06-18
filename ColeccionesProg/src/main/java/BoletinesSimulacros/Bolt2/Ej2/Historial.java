package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt2.Ej2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Historial {

    private List<PaginaWeb> paginas;

    public Historial() {
        paginas = new ArrayList<>();
    }

    public void agregarPagina(String url, LocalDate fecha) throws HistorialException {

        if (fecha.isAfter(LocalDate.now())) {
            throw new HistorialException("No se puede registrar una fecha futura");
        }

        paginas.add(new PaginaWeb(url, fecha));

        // Ordenar por fecha
        Collections.sort(paginas, new Comparator<PaginaWeb>() {
            @Override
            public int compare(PaginaWeb p1, PaginaWeb p2) {
                return p1.getFecha().compareTo(p2.getFecha());
            }
        });
    }

    public void mostrarHistorial() {
        for (PaginaWeb p : paginas) {
            System.out.println(p);
        }
    }

    public void historialDeDia(LocalDate dia) {
        for (PaginaWeb p : paginas) {
            if (p.getFecha().equals(dia)) {
                System.out.println(p);
            }
        }
    }

    public void historialDeUrl(String url) {
        for (PaginaWeb p : paginas) {
            if (p.getUrl().equalsIgnoreCase(url)) {
                System.out.println(p);
            }
        }
    }

    public void borrarPorUrl(String url) {
        paginas.removeIf(p -> p.getUrl().equalsIgnoreCase(url));
    }

    public void mostrarOrdenadoPorUrl() {
        List<PaginaWeb> copia = new ArrayList<>(paginas);

        Collections.sort(copia, new Comparator<PaginaWeb>() {
            @Override
            public int compare(PaginaWeb p1, PaginaWeb p2) {
                return p1.getUrl().compareToIgnoreCase(p2.getUrl());
            }
        });

        for (PaginaWeb p : copia) {
            System.out.println(p);
        }
    }
}
