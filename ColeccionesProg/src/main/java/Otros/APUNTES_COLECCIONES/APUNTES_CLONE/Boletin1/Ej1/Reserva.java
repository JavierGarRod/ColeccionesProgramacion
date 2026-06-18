package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_CLONE.Boletin1.Ej1;

import java.util.Objects;
public class Reserva implements Cloneable {

    // ATRIBUTOS

    private static int contador;
    private int id;
    private String pasajero;
    private String destino;
    private String asiento;
    private double precio;

    // CONSTRUCTOR

    public Reserva(String pasajero, String destino, String asiento, double precio) {
        this.id = contador++;
        this.pasajero = pasajero;
        this.destino = destino;
        this.asiento = asiento;
        this.precio = precio;
    }

    // GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public String getPasajero() {
        return pasajero;
    }

    public String getDestino() {
        return destino;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // CLONE

    @Override
    public Reserva clone() {
        try {
            return (Reserva) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // EQUALS Y HASHCODE

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Reserva r)) return false;
        return this.id == r.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TOSTRING

    @Override
    public String toString() {
        return "Reserva " + id + " | " + pasajero + " | " + destino +
                " | Asiento: " + asiento + " | Precio: " + precio;
    }
}


