package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Combustible;

public class GestionoVehiculos {
    public static void main(String[] args) {

        // Crear vehículos (ahora con combustible_actual)
        Vehículo v1 = new Vehículo("Toyota", "Corolla", 2015, "Gasolina", 50, 10);
        Vehículo v2 = new Vehículo("Ford", "Focus", 2018, "Diésel", 55, 30);

        // Mostrar información
        System.out.println(v1);
        System.out.println(v2);

        // Calcular consumo
        double consumoV1 = v1.calculo_consumo_combustible(120);
        System.out.println("Consumo del vehículo 1 en 120 km: " + consumoV1 + " litros");

        double consumoV2 = v2.calculo_consumo_combustible(200);
        System.out.println("Consumo del vehículo 2 en 200 km: " + consumoV2 + " litros");

        // Comprobar si necesitan repostar
        System.out.println("¿El vehículo 1 necesita repostar? " + v1.necesitaRepostar());
        System.out.println("¿El vehículo 2 necesita repostar? " + v2.necesitaRepostar());
    }
}
