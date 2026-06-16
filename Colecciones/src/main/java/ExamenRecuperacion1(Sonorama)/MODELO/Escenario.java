package MODELO;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Objects;

public class Escenario {

    //atributos
    private String nombreEscenario;
    private String tipoMusica;
    private int aforo;

    //constructor
    public Escenario(String nombreEscenario, String tipoMusica, int aforo) {
        this.nombreEscenario = nombreEscenario;
        this.tipoMusica = tipoMusica;
        this.aforo = aforo;
    }

    //getters y setters


    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    //toString

    @Override
    public String toString() {
        return "Escenario{" +
                "nombreEscenario='" + nombreEscenario + '\'' +
                ", tipoMusica='" + tipoMusica + '\'' +
                ", aforo=" + aforo +
                '}';
    }

    //equals y hashcode (nombreEscenario)


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Escenario escenario)) return false;
        return Objects.equals(nombreEscenario, escenario.nombreEscenario);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreEscenario);
    }

}
