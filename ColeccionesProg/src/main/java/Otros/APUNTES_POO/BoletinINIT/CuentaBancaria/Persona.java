package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.CuentaBancaria;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    // atributos
    private String dni;
    private String nombre;
    private String ap1;
    private String ap2;
    private LocalDate fechaNacimiento;

    // Constructor
    public Persona(String dni, String nombre, String ap1, String ap2, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter necesario para acceder al DNI desde CuentaBancaria
    public String getDni() {
        return dni;
    }

    // métodos
    private boolean validarEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period diferencia = Period.between(fechaNacimiento, fechaActual);
        int edad = diferencia.getYears();
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ap1='" + ap1 + '\'' +
                ", ap2='" + ap2 + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}

