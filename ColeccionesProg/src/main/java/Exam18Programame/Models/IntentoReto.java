package Exam18Programame.Models;

import java.time.LocalDateTime;

public class IntentoReto{
    Reto informacionReto;
    Estado estadoReto;
    private int numIntento;
    ListaErrores listaErrores;
    LocalDateTime FechaHoraSuperacion;

    public IntentoReto(Reto informacionReto, Estado estadoReto, ListaErrores listaErrores, LocalDateTime fechaHoraSuperacion) {
        this.informacionReto = informacionReto;
        this.estadoReto = estadoReto;
        this.numIntento = numIntento;
        this.listaErrores = listaErrores;
        FechaHoraSuperacion = fechaHoraSuperacion;
    }

    public Reto getInformacionReto() {
        return informacionReto;
    }

    public void setInformacionReto(Reto informacionReto) {
        this.informacionReto = informacionReto;
    }

    public Estado getEstadoReto() {
        return estadoReto;
    }

    public void setEstadoReto(Estado estadoReto) {
        this.estadoReto = estadoReto;
    }

    public int getNumIntento() {
        return numIntento;
    }

    public void setNumIntento(int numIntento) {
        this.numIntento = numIntento;
    }

    public ListaErrores getListaErrores() {
        return listaErrores;
    }

    public void setListaErrores(ListaErrores listaErrores) {
        this.listaErrores = listaErrores;
    }

    public LocalDateTime getFechaHoraSuperacion() {
        return FechaHoraSuperacion;
    }

    public void setFechaHoraSuperacion(LocalDateTime fechaHoraSuperacion) {
        FechaHoraSuperacion = fechaHoraSuperacion;
    }

    public IntentoReto() {
    }
}
