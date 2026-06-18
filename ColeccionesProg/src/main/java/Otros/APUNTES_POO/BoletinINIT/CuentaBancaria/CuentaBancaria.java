package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.CuentaBancaria;

public class CuentaBancaria {

        //  Atributos privados
        private double saldo;
        private int numCuenta;
        private Persona titular;
        private Persona autorizada;


        // Constructor
        public CuentaBancaria(double saldo, int numCuenta, Persona titular) {
            this.saldo = saldo;
            this.numCuenta = numCuenta;
            this.titular = titular;
            this.autorizada = null; // no hay autorizado al inicio
        }


        //métodos


        private boolean validarImporte(double importe) {
            return importe > 0;
        }


        public void ingresarDinero(double importe) {
            if (validarImporte(importe)) {
                this.saldo += importe;
            }
            else {
                System.out.println("Importe inválido");
            }
        }


        public void retirarDinero(double importe) {
            if (!validarImporte(importe)) {
                System.out.println("DENEGADO: importe negativo");
                return;
            }
            if (this.saldo >= importe) {
                this.saldo -= importe;
            }
            else {
                System.out.println("DENEGADO: saldo insuficiente");
            }
        }


        private boolean validarAutorizado(String dni) {
            if (autorizada == null) {
                System.out.println("No hay nadie autorizado");
                return false;
            }
            // getter
            if (dni.equals(autorizada.getDni())) {
                return true;
            }
            else {
                System.out.println("No autorizado");
                return false;
            }
        }


        public void eliminarAutorizado(String dni) {
            if (validarAutorizado(dni)) {
                autorizada = null;
                System.out.println("Autorizado eliminado");
            }
            else {
                System.out.println("ERROR: DNI no coincide");
            }
        }


        @Override
        public String toString() {
            return "CuentaBancaria{" +
                    "saldo=" + saldo +
                    ", numCuenta=" + numCuenta +
                    ", titular=" + titular +
                    ", autorizada=" + autorizada +
                    '}';
        }
    }


