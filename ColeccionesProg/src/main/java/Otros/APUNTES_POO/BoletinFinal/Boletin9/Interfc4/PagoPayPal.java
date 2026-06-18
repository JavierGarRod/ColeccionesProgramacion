package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc4;

public class PagoPayPal implements IPago {

    private Pago pago;
    private boolean cuentaVerificada;

    public PagoPayPal(Pago pago, boolean cuentaVerificada) {
        this.pago = pago;
        this.cuentaVerificada = cuentaVerificada;
    }

    @Override
    public boolean validarMetodoPago() {
        return cuentaVerificada;
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

