package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.CadAlimenticia;

public class GestionaCadenaAlimenticia {

    Animal[] animales = new Animal[10];

    public GestionaCadenaAlimenticia() {
        animales[0] = new Serpiente("Cobra", "Selva");
        animales[1] = new AveRapaz("Águila Real", "Montaña");
        animales[2] = new AveRapaz("Halcón", "Montaña");
        animales[3] = new Roedor("Conejo", "Bosque");
        animales[4] = new Leon("León", "Sabana");
    }

    public void mostrarDepredados(Animal a) {
        System.out.println("Puede atacar a:");
        for (Animal x : animales) {
            if (x != null && a.atacar(x)) {
                System.out.println(" - " + x.especie);
            }
        }
    }

    public void mostrarDepredadores(Animal a) {
        System.out.println("Es presa de:");
        for (Animal x : animales) {
            if (x != null && x.atacar(a)) {
                System.out.println(" - " + x.especie);
            }
        }
    }

    public void mostrarDeQuienHuye(Animal a) {
        System.out.println("Puede huir de:");
        for (Animal x : animales) {
            if (x != null && a.huir(x)) {
                System.out.println(" - " + x.especie);
            }
        }
    }

    public static void main(String[] args) {

        GestionaCadenaAlimenticia g = new GestionaCadenaAlimenticia();

        // ejemplo de uso:
        Animal aguila = g.animales[1];

        g.mostrarDepredados(aguila);
        g.mostrarDepredadores(aguila);
        g.mostrarDeQuienHuye(aguila);
    }
}

