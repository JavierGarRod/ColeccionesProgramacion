package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.VideojuegosInsrtof;

public class JuegoRPG {
    public static void main(String[] args) {

        Personaje p1 = new Guerrero("Helen");
        Personaje p2 = new Mago("Laura");
        Personaje p3 = new Arquero("Pepe");

        ejecutarTurno(p1);
        ejecutarTurno(p2);
        ejecutarTurno(p3);
    }

    public static void ejecutarTurno(Personaje p) {

        if (p instanceof Guerrero) {
            ((Guerrero)p).golpeFuerte();
        }
        else if (p instanceof Mago) {
            ((Mago)p).lanzarHechizo();
        }
        else if (p instanceof Arquero) {
            ((Arquero)p).disparoPreciso();
        }
        else {
            System.out.println("Tipo de personaje desconocido");
        }
    }
}

