package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.MODEL;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.EXCEPTIONS.DuracionInvalidaException;

public class Cancion {

    //atributos
    private int id;
    private static int contador;
    private String titulo;
    private int duracionSegs;
    private int reproducciones;

    //constructor
    public Cancion(String titulo, int duracionSegs, int reproducciones) {
        this.id = contador++;
        this.titulo = titulo;
        this.duracionSegs = duracionSegs;
        this.reproducciones = reproducciones;
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
        Cancion.contador = contador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionSegs() {
        return duracionSegs;
    }

    public void setDuracionSegs(int duracionSegs) throws DuracionInvalidaException {
        if(duracionSegs <= 30){
            throw new DuracionInvalidaException("Duración onválida");
        }
        this.duracionSegs = duracionSegs;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    //toString
    @Override
    public String toString() {
        return "Cancion{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", duracionSegs=" + duracionSegs +
                ", reproducciones=" + reproducciones +
                '}';
    }
}
