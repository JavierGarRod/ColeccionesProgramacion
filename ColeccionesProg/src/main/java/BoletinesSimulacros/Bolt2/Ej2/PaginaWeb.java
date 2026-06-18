package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt2.Ej2;

import java.time.LocalDate;

public class PaginaWeb {

    private String url;
    private LocalDate fecha;

    public PaginaWeb(String url, LocalDate fecha) {
        this.url = url;
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "PaginaWeb{" +
                "url='" + url + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
