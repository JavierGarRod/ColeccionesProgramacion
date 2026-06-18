package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.MODEL;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.EXCEPTIONS.PrecioInvalidoException;

import java.util.Objects;

public class Libro {

    //atributos
    private int id;
    private static int contador;
    private String titulo;
    private double precio;
    private Categoria categoria;

    //constructor
    public Libro(String titulo, double precio, Categoria categoria) {
        this.id = contador++;
        this.titulo = titulo;
        setPrecio(precio);
        this.categoria = categoria;
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
        Libro.contador = contador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws PrecioInvalidoException {
        if(precio<0){
            throw new PrecioInvalidoException("Precio inválido");
        }
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //toString
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                '}';
    }

    //equals y hashcode

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Libro libro)) return false;
        return Objects.equals(titulo, libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }
}
