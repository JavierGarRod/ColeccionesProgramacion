package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc4;

public class Pago {

    private Divisa divisa;
    private double cantidad;
    private EstadoPago estado;

    public Pago(Divisa divisa, double cantidad) {
        this.divisa = divisa;
        this.cantidad = cantidad;
        this.estado = EstadoPago.PENDIENTE;
    }

    public Divisa getDivisa() { return divisa; }
    public double getCantidad() { return cantidad; }
    public EstadoPago getEstado() { return estado; }

    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return cantidad + " " + divisa + " | Estado: " + estado;
    }
}

