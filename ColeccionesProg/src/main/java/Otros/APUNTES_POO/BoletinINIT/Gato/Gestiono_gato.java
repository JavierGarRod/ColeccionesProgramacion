package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Gato;

public class Gestiono_gato {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Blanco",2,3,"persa","macho");
        Gato gato2 = new Gato("Naranja",6,4,"común","macho");
        Gato gato3 = new Gato("Manchitas",10,1,"común","hembra");

        gato1.maulla();
        gato1.come("pienso");
        gato2.come("fresa");
        gato1.ronronea();
        gato1.pelear(gato2);
        gato2.pelear(gato3);
    }
}
