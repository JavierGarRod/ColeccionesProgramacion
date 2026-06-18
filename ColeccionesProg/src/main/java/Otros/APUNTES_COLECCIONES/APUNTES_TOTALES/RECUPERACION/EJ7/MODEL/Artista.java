package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.MODEL;

import java.util.Objects;

public class Artista implements Comparable<Artista> {

    //atributos
    private String nombre;
    private Tipo_GeneroM generoMusical;
    private String pais;

    //constructor
    public Artista(String nombre, Tipo_GeneroM generoMusical, String pais) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.pais = pais;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo_GeneroM getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(Tipo_GeneroM generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //toString
    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", generoMusical=" + generoMusical +
                ", pais='" + pais + '\'' +
                '}';
    }

    //equals y hashcode
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Artista artista)) return false;
        return Objects.equals(nombre, artista.nombre) && Objects.equals(pais, artista.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais);
    }

    //compareTo
    @Override
    public int compareTo(Artista a) {
        return this.getNombre().compareTo(a.getNombre());
    }
}
