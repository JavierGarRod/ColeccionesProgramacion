package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Modelos;
import java.time.LocalDate;

public class CuentaBancaria  {

    static int contador;
    private int idCuenta;
    private double saldo;
    private LocalDate fechaApertura;
    private String iban;
    private Cliente titular;
    private Cliente autorizado; // puede ser null

    public CuentaBancaria(double saldo, String iban, Cliente titular, Cliente autorizado) {
        this.idCuenta = contador++;  // id cuenta va a ser el del contador
        this.saldo = saldo;
        this.fechaApertura = LocalDate.now();
        this.iban = iban;
        this.titular = titular;
        this.autorizado = autorizado;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta " + idCuenta + " | IBAN: " + iban + " | Titular: " + titular +
                " | Autorizado: " + autorizado;
    }
}


