package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Anime;

public class Goku extends PersonajeAnime {

    private boolean estaVivo;

    public Goku(String nombre, Serie serie, int edad, Transformacion[] transformaciones, boolean estaVivo) {
        super(nombre, serie, edad, transformaciones);
        this.estaVivo = estaVivo;
    }

    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    public void obtenerEnergiaVital() {
        System.out.println(nombre + " está reuniendo energía vital.");
    }

    public void teletransportarse() {
        System.out.println(nombre + " se teletransporta.");
    }
}

