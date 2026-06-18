package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL;

import java.util.Objects;

public class Pareja {
    //atributos
    private int id;
    private static int contador;
    private String nombre;
    private Jugador jugador1;
    private Jugador jugador2;

    //constructor
    public Pareja(String nombre, Jugador jugador1, Jugador jugador2) {
        this.id = contador++;
        this.nombre = nombre;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    //getters y setters

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
        Pareja.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    //toString

    @Override
    public String toString() {
        return "Pareja{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", jugador1=" + jugador1 +
                ", jugador2=" + jugador2 +
                '}';
    }

    //equals y hashcode

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pareja pareja)) return false;
        return id == pareja.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
