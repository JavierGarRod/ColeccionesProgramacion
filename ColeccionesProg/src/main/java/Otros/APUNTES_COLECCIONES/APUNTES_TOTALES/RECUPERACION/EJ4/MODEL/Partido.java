package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL;

import java.util.Arrays;
import java.util.Objects;

public class Partido implements Comparable<Partido>{

    //atributos
   private int id;
   private static int contador;
   private Pareja p1;
   private Pareja p2;
   private boolean finalizado;
   private Integer[] resultado;

   //constructor
    public Partido(Pareja p1, Pareja p2) {
        this.id = contador++;
        this.p1 = p1;
        this.p2 = p2;
        this.finalizado = false;
        this.resultado = null;

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
        Partido.contador = contador;
    }

    public Pareja getP1() {
        return p1;
    }

    public void setP1(Pareja p1) {
        this.p1 = p1;
    }

    public Pareja getP2() {
        return p2;
    }

    public void setP2(Pareja p2) {
        this.p2 = p2;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Integer[] getResultado() {
        return resultado;
    }

    public void setResultado(Integer[] resultado) {
        this.resultado = resultado;
    }

    //toString

    @Override
    public String toString() {
        return "Partido{" +
                "id=" + id +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", finalizado=" + finalizado +
                ", resultado=" + Arrays.toString(resultado) +
                '}';
    }

    //equals y hashcode

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Partido partido)) return false;
        return id == partido.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //compareTo
    @Override
    public int compareTo(Partido p) {
        return Integer.compare(this.id, p.getId()); //comparar con un int
    }
}
