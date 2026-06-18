package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro2;

import java.time.LocalDate;

public class Reserva {

    private int idReserva;
    private LocalDate fechaReserva;
    private EstadoReserva estado;
    private Usuario usuario;

    public Reserva(int idReserva, LocalDate fechaReserva, EstadoReserva estado, Usuario usuario) {
        this.idReserva = idReserva;
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

    public void setUsuario(Usuario u) {
        this.usuario = u;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reserva)) return false;
        Reserva reserva = (Reserva) o;
        return idReserva == reserva.idReserva;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(idReserva);
    }

    @Override
    public String toString() {
        return "Reserva{id=" + idReserva + ", fecha=" + fechaReserva + ", estado=" + estado +
                ", usuario=" + usuario.getNombreCompleto() + "}";
    }
}

