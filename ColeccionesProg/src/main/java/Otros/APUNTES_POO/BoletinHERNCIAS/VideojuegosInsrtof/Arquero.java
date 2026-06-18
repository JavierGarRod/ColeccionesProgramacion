package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.VideojuegosInsrtof;

public class Arquero extends Personaje {

    public Arquero(String nombre) {
        super(nombre);
    }

    public void disparoPreciso() {
        System.out.println(nombre + " hace un DISPARO PRECISO");
    }
}

