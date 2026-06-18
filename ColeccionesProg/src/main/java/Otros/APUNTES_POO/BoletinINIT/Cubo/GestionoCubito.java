package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Cubo;

public class GestionoCubito {
    public static void main(String[] args) {
        Cubito cubo = new Cubito(4); // 4 decímetros de lado

        System.out.println("Área total: " + cubo.areaTotal());
        System.out.println("Volumen: " + cubo.volumen());

        System.out.println("Rellenar 6 litros: " + cubo.rellenar(6));
        System.out.println("Vaciar 4 litros: " + cubo.vaciar(4));
        System.out.println("Vaciar 3 litros: " + cubo.vaciar(3));
        System.out.println("Rellenar 16 litros: " + cubo.rellenar(16));
    }
}