package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.EXCEPTIONS.RankingInvalidoException;

import java.util.Objects;

public class Jugador {

    //atributos
    private String nombre;
    private String apellidos;
    private int ranking;
    private Categoria categoria;

    //constructor
    public Jugador(String nombre, String apellidos, int ranking, Categoria categoria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        setRanking(ranking);
        this.categoria = categoria;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) throws RankingInvalidoException {
        if(ranking <=0){
            throw new RankingInvalidoException("Ranking inválido");
        }
        this.ranking = ranking;
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
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", ranking=" + ranking +
                ", categoria=" + categoria +
                '}';
    }

    //equals y hashCode

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Jugador jugador)) return false;
        return Objects.equals(nombre, jugador.nombre) && Objects.equals(apellidos, jugador.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }
}
