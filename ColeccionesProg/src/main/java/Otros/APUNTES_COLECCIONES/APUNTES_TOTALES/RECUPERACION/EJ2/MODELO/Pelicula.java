package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.MODELO;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.EXCEPCIONES.AnioInvalidoException;

import java.time.LocalDate;

public class Pelicula implements Comparable<Pelicula>{

    //atributos
    private int id;
    private String director;
    private static int contador;
    private String titulo;
    private LocalDate fecha;
    private Tipo_Genero genero;
    private boolean disponible;

    //constructor
    public Pelicula(String titulo, String director, LocalDate fecha, Tipo_Genero genero, boolean disponible) {
        this.id = contador++;
        this.titulo = titulo;
        setFecha(fecha);
        this.genero = genero;
        this.disponible = disponible;
        this.director = director;
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
        Pelicula.contador = contador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        int anio = fecha.getYear();
        int actual = LocalDate.now().getYear();

        if (anio < 1888 || anio > actual) {
            throw new AnioInvalidoException("Año inválido");
        }
        this.fecha = fecha;
    }

    public Tipo_Genero getGenero() {
        return genero;
    }

    public void setGenero(Tipo_Genero genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //toString
    @Override
    public String toString() {
        return "Pelicula: " +
                "\n id=" + id +
                "\n titulo='" + titulo +
                "\n fecha=" + fecha +
                "\n genero=" + genero +
                "\n disponible=" + disponible +
                "\n director =" + director +
                "\n -----------------------------";
    }

    //no pongo equals ni hashcode pq el enunciado me pide detectar los duplicados

    //comparable
    @Override
    public int compareTo(Pelicula p) {
        return this.titulo.compareToIgnoreCase(p.titulo);
    }


}
