package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Message {

    private static int contador = 1;

    protected int id;
    protected String contenido;
    protected LocalDateTime fecha;
    protected User autor;
    protected ArrayList<Valoracion> valoraciones;
    protected int lecturas;

    public Message(String contenido, User autor) {
        this.id = contador++;
        this.contenido = contenido;
        this.autor = autor;
        this.fecha = LocalDateTime.now();
        this.valoraciones = new ArrayList<>();
        this.lecturas = 0;
    }

    public void valorar(Valoracion v) {
        valoraciones.add(v);
        lecturas++;
    }

    public abstract int calcularPuntuacion();

    public User getAutor() { return autor; }

    @Override
    public String toString() {
        return id + " - " + contenido + " - Puntos: " + calcularPuntuacion();
    }
}
