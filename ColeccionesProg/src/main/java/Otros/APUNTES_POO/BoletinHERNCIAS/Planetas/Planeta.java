package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Planetas;

public class Planeta extends Astro {

    private Satelite[] satelites;
    private int numSatelites;

    public Planeta(String nombre, double masa, double diametro,
                   double periodoRotacion, double periodoTraslacion,
                   double distanciaMedia, int maxSatelites) {

        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.satelites = new Satelite[maxSatelites];
        this.numSatelites = 0;
    }

    public void addSatelite(Satelite s) {
        if (numSatelites < satelites.length) {
            satelites[numSatelites] = s;
            numSatelites++;
        }
    }

    @Override
    public void muestra() {
        System.out.println("=== PLANETA ===");
        System.out.println(this); // imprime el objeto usando toString()
        System.out.println("Rotación: " + periodoRotacion + " h");
        System.out.println("Traslación: " + periodoTraslacion + " h");
        System.out.println("Distancia media: " + distanciaMedia);

        if (numSatelites > 0) {
            System.out.println("Satélites:");
            for (int i = 0; i < numSatelites; i++) {
                System.out.println(" - " + satelites[i].getNombre());
            }
        }
    }

    @Override
    public String toString() {
        return "Planeta: " + nombre + " | Masa: " + masa + " | Diámetro: " + diametro;
    }
}
