package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej2;

public class GestionaBanco {

        // MÉTODO MAIN (como tú quieres)
        public static void main(String[] args) {

            // Creamos cuentas
            CuentaCorriente cc = new CuentaCorriente("ES123", 500);
            CuentaAhorro ca = new CuentaAhorro("ES999", 2000);

            // Mostramos estado inicial
            System.out.println("ANTES DE INTERESES:");
            System.out.println(cc);
            System.out.println(ca);

            // Calculamos intereses
            cc.calcularIntereses();
            ca.calcularIntereses();

            System.out.println("\nDESPUÉS DE INTERESES:");
            System.out.println(cc);
            System.out.println(ca);

            // Traspaso
            cc.traspasar(ca, 100);

            System.out.println("\nDESPUÉS DEL TRASPASO:");
            System.out.println(cc);
            System.out.println(ca);
        }
    }


