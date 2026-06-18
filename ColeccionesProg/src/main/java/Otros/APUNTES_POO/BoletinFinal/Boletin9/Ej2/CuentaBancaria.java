package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej2;

public abstract class CuentaBancaria {

        // Atributos
        protected String iban;
        protected double saldo;

        // Atributo común a TODAS las cuentas (static)
        protected static final double interesAnualBasico = 0.02; // 2%

        // Constructor
        public CuentaBancaria(String iban, double saldo) {
            this.iban = iban;
            this.saldo = saldo;
        }

        // Getters
        public String getIban() {
            return iban;
        }

        public double getSaldo() {
            return saldo;
        }


        // Método privado general
        // Añade una cantidad al saldo (positiva o negativa)
        private void añadir(double cantidad) {
            this.saldo += cantidad;
        }


        // Ingresar dinero
        public void ingresar(double cantidad) {
            if (cantidad > 0) {
                añadir(cantidad);
            }
        }

        // Retirar dinero
        public void retirar(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                añadir(-cantidad);
            }
        }

        // Traspasar dinero a otra cuenta
        public void traspasar(CuentaBancaria destino, double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                this.añadir(-cantidad);
                destino.añadir(cantidad);
            }
        }


        // Método abstracto
        // Cada tipo de cuenta lo implementará a su manera

        public abstract void calcularIntereses();

        // toString
        @Override
        public String toString() {
            return "IBAN: " + iban + " | Saldo: " + saldo;
        }

        // equals: dos cuentas son iguales si tienen el mismo IBAN

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof CuentaBancaria)) return false;
            CuentaBancaria c = (CuentaBancaria) obj;
            return this.iban.equals(c.iban);
        }
    }


