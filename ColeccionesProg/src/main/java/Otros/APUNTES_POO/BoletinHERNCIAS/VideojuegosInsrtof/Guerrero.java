package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.VideojuegosInsrtof;

public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre);
    }

    public void golpeFuerte() {
        System.out.println(nombre + " usa GOLPE FUERTE");
    }
}
