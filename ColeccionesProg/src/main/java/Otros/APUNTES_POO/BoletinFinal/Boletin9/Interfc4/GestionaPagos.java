package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc4;

import java.time.LocalDate;

public class GestionaPagos {

    public static void main(String[] args) {

        Tienda tienda = new Tienda(LocalDate.now());

        // TARJETA
        Pago p1 = new Pago(Divisa.EURO, 50);
        PagoTarjeta tarjetaValida = new PagoTarjeta(p1, true);
        tarjetaValida.realizarPago();
        tienda.registrarPago(p1);

        Pago p2 = new Pago(Divisa.EURO, 50);
        PagoTarjeta tarjetaInvalida = new PagoTarjeta(p2, false);
        tarjetaInvalida.realizarPago();
        tienda.registrarPago(p2);

        // PAYPAL
        Pago p3 = new Pago(Divisa.DOLAR, 100);
        PagoPayPal paypalValido = new PagoPayPal(p3, true);
        paypalValido.realizarPago();
        tienda.registrarPago(p3);

        Pago p4 = new Pago(Divisa.DOLAR, 100);
        PagoPayPal paypalInvalido = new PagoPayPal(p4, false);
        paypalInvalido.realizarPago();
        tienda.registrarPago(p4);

        // BIZUM
        Pago p5 = new Pago(Divisa.EURO, 20);
        PagoBizum bizumValido = new PagoBizum(p5, true);
        bizumValido.realizarPago();
        tienda.registrarPago(p5);

        Pago p6 = new Pago(Divisa.EURO, 20);
        PagoBizum bizumInvalido = new PagoBizum(p6, false);
        bizumInvalido.realizarPago();
        tienda.registrarPago(p6);

        tienda.imprimeResumenDia();
    }
}

