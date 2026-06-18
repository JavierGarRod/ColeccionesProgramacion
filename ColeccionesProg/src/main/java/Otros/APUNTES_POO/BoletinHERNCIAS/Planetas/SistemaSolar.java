package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Planetas;

public class SistemaSolar {

    public static void main(String[] args) {

        // creo planeta
        Planeta tierra = new Planeta("Tierra", 5.97e24, 12742,
                24, 365*24, 149_600_000, 5);

        // creo satélite
        Satelite luna = new Satelite("Luna", 7.35e22, 3474,
                655, 655, 384_400, tierra);

        // añado satélite a la lista
        tierra.addSatelite(luna);

        //muestro info
        System.out.println();
        UtilidadesAstros.muestraInformación(tierra);
        System.out.println();
        UtilidadesAstros.muestraInformación(luna);
    }
}
