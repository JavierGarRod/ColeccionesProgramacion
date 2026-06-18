package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.MODELO;

public class Publicacion {

    //atributos
    private int id;
    private static int contador;
    private String texto;
    private int likes;

    //constructor
    public Publicacion(String texto, int likes) {
        this.id = contador++;
        this.texto = texto;
        this.likes = likes;
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
        Publicacion.contador = contador;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    //toString

    @Override
    public String toString() {
        return "Publicacion{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", likes=" + likes +
                '}';
    }

}
