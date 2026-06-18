package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej2;

import java.time.LocalDate;

public class Reservas {

    private static int contadorReservas = 1;

    private int idReserva;
    private LocalDate fechaReserva;
    private EstadoReserva estado;
    private Usuario usuario;

    public Reservas(LocalDate fechaReserva, EstadoReserva estado, Usuario usuario) {
        this.idReserva = contadorReservas++;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
        this.usuario = usuario;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario nuevoUsuario) {
        this.usuario = nuevoUsuario;
    }

    //"Dos reservas son iguales si tienen el mismo id"
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Reservas)) return false;

        Reservas otra = (Reservas) obj;
        return this.idReserva == otra.idReserva;
    }

    @Override
    public String toString() {
        return "Reserva " + idReserva + " - " + estado + " - " + usuario.getNombreCompleto();
    }
}
