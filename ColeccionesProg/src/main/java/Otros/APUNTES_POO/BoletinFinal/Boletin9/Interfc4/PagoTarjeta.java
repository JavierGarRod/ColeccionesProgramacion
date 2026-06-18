package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc4;

public class PagoTarjeta implements IPago {

    private Pago pago;
    private boolean tarjetaValida;

    public PagoTarjeta(Pago pago, boolean tarjetaValida) {
        this.pago = pago;
        this.tarjetaValida = tarjetaValida;
    }

    @Override
    public boolean validarMetodoPago() {
        return tarjetaValida;
    }

    @Override
    public boolean realizarPago() {
        if (validarMetodoPago()) {
            pago.setEstado(EstadoPago.PAGADO);
            return true;
        } else {
            pago.setEstado(EstadoPago.ERROR);
            return false;
        }
    }

    public Pago getPago() {
        return pago;
    }
}

