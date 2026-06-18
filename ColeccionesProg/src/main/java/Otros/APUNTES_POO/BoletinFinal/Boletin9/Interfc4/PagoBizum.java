package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc4;

public class PagoBizum implements IPago {

    private Pago pago;
    private boolean telefonoCorrecto;

    public PagoBizum(Pago pago, boolean telefonoCorrecto) {
        this.pago = pago;
        this.telefonoCorrecto = telefonoCorrecto;
    }

    @Override
    public boolean validarMetodoPago() {
        return telefonoCorrecto;
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

