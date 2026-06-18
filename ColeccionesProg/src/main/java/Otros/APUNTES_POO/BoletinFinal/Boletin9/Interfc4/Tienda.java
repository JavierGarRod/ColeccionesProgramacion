package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc4;

import java.time.LocalDate;

public class Tienda {

    private LocalDate dia;
    private Pago[] pagos = new Pago[100];
    private int contador = 0;

    public Tienda(LocalDate dia) {
        this.dia = dia;
    }

    public void registrarPago(Pago p) {
        if (contador < pagos.length) {
            pagos[contador++] = p; //ojo, se aniade el pago a la lista
        }
    }

    public void imprimeResumenDia() {
        System.out.println("Resumen del día " + dia); // se imprime la lista
        for (Pago p : pagos) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }
}

