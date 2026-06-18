package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.VideojuegosInsrtof;

public class Villano extends Personaje {

    public Villano(String nombre) {
        super(nombre);
    }

    public void ataqueOscuro() {
        System.out.println(nombre + " usa ATAQUE OSCURO");
    }
}

