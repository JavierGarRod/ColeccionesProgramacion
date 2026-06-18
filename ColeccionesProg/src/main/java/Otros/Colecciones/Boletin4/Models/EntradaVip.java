package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin4.Models;

import java.time.LocalDate;

public class EntradaVip {
    private String codEntrada;
    private LocalDate fechaEntrada;
    TipoEntradaVip tipoDeEntrada;
    EstadoEntradaVip estadoDeEntrada;

    public EntradaVip(String codEntrada, LocalDate fechaEntrada, TipoEntradaVip tipoDeEntrada) {
        this.codEntrada = codEntrada;
        this.fechaEntrada = fechaEntrada;
        this.tipoDeEntrada = tipoDeEntrada;
        this.estadoDeEntrada = estadoDeEntrada;
    }

    public String getCodEntrada() {
        return codEntrada;
    }

    public void setCodEntrada(String codEntrada) {
        this.codEntrada = codEntrada;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public TipoEntradaVip getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(TipoEntradaVip tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public EstadoEntradaVip getEstadoDeEntrada() {
        return estadoDeEntrada;
    }

    public void setEstadoDeEntrada(EstadoEntradaVip estadoDeEntrada) {
        this.estadoDeEntrada = estadoDeEntrada;
    }

    @Override
    public String toString() {
        return "EntradaVip{" +
                "codEntrada='" + codEntrada + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", tipoDeEntrada=" + tipoDeEntrada +
                ", estadoDeEntrada=" + estadoDeEntrada +
                '}';
    }
}
