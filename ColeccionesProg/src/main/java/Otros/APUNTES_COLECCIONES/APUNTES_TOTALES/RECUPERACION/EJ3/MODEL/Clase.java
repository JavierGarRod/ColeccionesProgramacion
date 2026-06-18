package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL;

import java.util.HashSet;

public class Clase {

    //atributos
    private int codClase;
    private static int contador;
    private String idioma;
    private Profesor profesor;
    private HashSet<Alumno> alumnos;

    //constructor
    public Clase(String idioma, Profesor profesor) {
        this.codClase = contador++;
        this.idioma = idioma;
        this.profesor = profesor;
        this.alumnos = new HashSet<>();
    }

    //getters y setters
    public int getCodClase() {
        return codClase;
    }

    public void setCodClase(int codClase) {
        this.codClase = codClase;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Clase.contador = contador;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashSet<Alumno> alumnos){
        this.alumnos = alumnos;

}
}
