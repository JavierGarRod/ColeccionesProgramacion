package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Videojuegos;

public class GestionaJuego {

    public static void main(String[] args) {

        // Personajes
        Personaje caballero = new Caballero("Arthur");
        Personaje arquero = new Arquero("Legolas");
        Personaje mago = new Mago("Gandalf");
        Personaje villano = new Villano("Orco");

        // Armas
        System.out.println("\nARMAS:"); // la n es para separar cada cosa
        System.out.println("Caballero: " + caballero.getArma());
        System.out.println("Arquero: " + arquero.getArma());
        System.out.println("Mago: " + mago.getArma());
        System.out.println("Villano: " + villano.getArma());

        System.out.println("\nATAQUES SIN DISTANCIA:");

        System.out.println("¿Caballero ataca a Arquero? " + arquero.esAtacado(caballero));
        System.out.println("¿Arquero ataca a Caballero? " + caballero.esAtacado(arquero));
        System.out.println("¿Mago ataca a Caballero? " + caballero.esAtacado(mago));
        System.out.println("¿Villano ataca a Mago? " + mago.esAtacado(villano));

        System.out.println("\nATAQUES CON DISTANCIA:");

        System.out.println("¿Caballero ataca a Arquero a 30m? " + arquero.esAtacado(caballero, 30));
        System.out.println("¿Caballero ataca a Arquero a 80m? " + arquero.esAtacado(caballero, 80));
        System.out.println("¿Arquero ataca a Caballero a 150m? " + caballero.esAtacado(arquero, 150));
        System.out.println("¿Arquero ataca a Caballero a 50m? " + caballero.esAtacado(arquero, 50));
    }
}

