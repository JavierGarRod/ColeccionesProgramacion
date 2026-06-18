package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Controller;

import APUNTES_POO.BoletinFinal.Modelos.Cliente;
import APUNTES_POO.BoletinFinal.Modelos.CuentaBancaria;

public class Gestion {
        public static void main(String[] args) {
            Cliente c1 = new Cliente("Ana", "López", "11111111A");
            Cliente c2 = new Cliente("Luis", "Martín", "22222222B");
            Cliente c3 = new Cliente("Sara", "Gómez", "33333333C");

            CuentaBancaria cuenta1 = new CuentaBancaria(1000, "ES123", c1, c2);
            CuentaBancaria cuenta2 = new CuentaBancaria(500, "ES456", c2, null);
            CuentaBancaria cuenta3 = new CuentaBancaria(2000, "ES789", c3, c1);

            System.out.println();
            System.out.println(cuenta1);
            System.out.println(cuenta2);
            System.out.println(cuenta3);

            System.out.println();
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);

            System.out.println();
            System.out.println("ID cuenta1: " + cuenta1.getIdCuenta());
            System.out.println("ID cuenta2: " + cuenta2.getIdCuenta());
            System.out.println("ID cuenta3: " + cuenta3.getIdCuenta());}
    }
    
