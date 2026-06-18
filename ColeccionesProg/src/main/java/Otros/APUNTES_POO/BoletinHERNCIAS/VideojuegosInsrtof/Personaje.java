package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.VideojuegosInsrtof;

public class Personaje {
    protected String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public void atacar() {
        System.out.println(nombre + " ataca de forma básica");
    }
}





