package Exam18Programame.Models;

import java.time.LocalTime;
import java.util.Objects;

public class Reto {
    private String idReto;
    private String titulo;
    private String enunciado;
    private int tiempoMaximoMS;
    private int memoriaMaximaMB;

    public Reto(String idReto, String titulo, int tiempoMaximoMS, int memoriaMaximaMB) {
        this.idReto = idReto;
        this.titulo = titulo;
        this.tiempoMaximoMS = tiempoMaximoMS;
        this.memoriaMaximaMB = memoriaMaximaMB;
    }

    public String getIdReto() {
        return idReto;
    }

    public void setIdReto(String idReto) {
        this.idReto = idReto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getTiempoMaximoMS() {
        return tiempoMaximoMS;
    }

    public void setTiempoMaximoMS(int tiempoMaximoMS) {
        this.tiempoMaximoMS = tiempoMaximoMS;
    }

    public int getMemoriaMaximaMB() {
        return memoriaMaximaMB;
    }

    public void setMemoriaMaximaMB(int memoriaMaximaMB) {
        this.memoriaMaximaMB = memoriaMaximaMB;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reto reto = (Reto) o;
        return Objects.equals(idReto, reto.idReto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idReto);
    }
}
