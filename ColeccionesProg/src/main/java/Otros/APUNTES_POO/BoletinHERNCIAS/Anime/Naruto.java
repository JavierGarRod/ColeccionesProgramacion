package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Anime;

public class Naruto extends PersonajeAnime {

    private Elemento elemento;
    private Aldea aldea;

    public Naruto(String nombre, Serie serie, int edad, Transformacion[] transformaciones, Elemento elemento, Aldea aldea) {
        super(nombre, serie, edad, transformaciones);
        this.elemento = elemento;
        this.aldea = aldea;
    }

    public void entrenar() {
        System.out.println(nombre + " está entrenando.");
    }

    public void crearClones() {
        System.out.println(nombre + " crea clones de sombra.");
    }
}

