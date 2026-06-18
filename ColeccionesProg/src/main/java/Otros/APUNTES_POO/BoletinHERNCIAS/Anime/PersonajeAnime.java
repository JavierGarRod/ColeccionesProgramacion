package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Anime;

public class PersonajeAnime {

    protected String nombre;
    protected Serie serie;
    protected int edad;
    protected Transformacion[] transformaciones;

    public PersonajeAnime(String nombre, Serie serie, int edad, Transformacion[] transformaciones) {
        this.nombre = nombre;
        this.serie = serie;
        this.edad = edad;
        this.transformaciones = transformaciones;
    }

    public void atacar() {
        System.out.println(nombre + " está atacando!");
    }

    /*  SE TRANSFORMA SOLO A LA PRIMERA FASE
    public void transformar() {
        if (transformaciones != null && transformaciones.length > 0) {
            System.out.println(nombre + " se transforma en " + transformaciones[0].getNombre());
        } else {
            System.out.println(nombre + " no tiene transformaciones.");
        }
    } */

    public void transformar(int fase) {
        if (transformaciones != null && fase >= 0 && fase < transformaciones.length) {
            System.out.println(nombre + " se transforma en " + transformaciones[fase].getNombre());
        } else {
            System.out.println("Esa transformación no existe.");
        }
    }


    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }
}

