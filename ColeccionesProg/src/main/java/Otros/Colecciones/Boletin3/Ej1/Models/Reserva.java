package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin3.Ej1.Models;

import java.util.Objects;

public class Reserva implements Cloneable{
    private String numbrePasajero;
    private String destino;
    private String numAsiento;
    private double precio;
    int id;
    static int contador=0;

    public Reserva(String numbrePasajero, String destino, String numAsiento, double precio) {
        this.numbrePasajero = numbrePasajero;
        this.destino = destino;
        this.numAsiento = numAsiento;
        this.precio = precio;
        this.id = contador++;
    }

    public String getNumbrePasajero() {
        return numbrePasajero;
    }

    public void setNumbrePasajero(String numbrePasajero) {
        this.numbrePasajero = numbrePasajero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(String numAsiento) {
        this.numAsiento = numAsiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Reserva.contador = contador;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return id == reserva.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public Reserva clone(){
        try{
            return (Reserva) super.clone();
        }
        catch(CloneNotSupportedException e){
            return null;
        }
    }
}
