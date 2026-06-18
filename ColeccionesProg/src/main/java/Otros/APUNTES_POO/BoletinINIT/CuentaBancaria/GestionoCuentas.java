package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.CuentaBancaria;


import java.time.LocalDate;


public class GestionoCuentas {
    public static void main(String[] args) {


        // Crear personas
        Persona titular = new Persona(
                "12345678A",
                "Helen",
                "García",
                "López",
                LocalDate.of(2000, 5, 10)
        );


        Persona autorizado = new Persona(
                "87654321B",
                "María",
                "Pérez",
                "Santos",
                LocalDate.of(1995, 3, 20)
        );


        // Crear cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria(
                500.0,
                12345,
                titular
        );


        // Ingresos
        System.out.println("---- INGRESAR DINERO ----");
        cuenta.ingresarDinero(200);
        cuenta.ingresarDinero(-50);


        // Retiros
        System.out.println("---- RETIRAR DINERO ----");
        cuenta.retirarDinero(100);
        cuenta.retirarDinero(1000);


        // Intento de eliminar autorizado (aún no existe)
        System.out.println("---- ELIMINAR AUTORIZADO ----");
        cuenta.eliminarAutorizado("87654321B");


        // Mostrar datos del titular
        System.out.println("---- DATOS DEL TITULAR ----");
        System.out.println(titular);
    }
}
