package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Anime;

public class Luffy extends PersonajeAnime {

    private String fruta;
    private boolean estaEnAgua;

    public Luffy(String nombre, Serie serie, int edad, Transformacion[] transformaciones, String fruta, boolean estaEnAgua) {
        super(nombre, serie, edad, transformaciones);
        this.fruta = fruta;
        this.estaEnAgua = estaEnAgua;
    }

    public void reir() {
        System.out.println(nombre + " dice: ¡Shishishi!");
    }
}

