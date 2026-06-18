package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej1;

import java.time.LocalDate;

public class GestionaVehiculo {

    public static void main(String[] args) {

        // "Además de una clase llamada GestionaRematriculaciones
        //  desde donde probaremos todos los métodos"

        RepositorioVehiculo repo = new RepositorioVehiculo();

        // -------------------------------------------------------------
        // 1. Registrar vehículos en el sistema
        // "Registrar un nuevo vehículo en el sistema"
        // -------------------------------------------------------------
        Vehiculo v1 = new Vehiculo("VIN123", "1234ABC", "Ford", "Focus", "Rojo",2015, LocalDate.of(2015, 5, 10), "Ezequiel");
        Vehiculo v2 = new Vehiculo("VIN999", "9999XYZ", "Seat", "Ibiza", "Azul", 2018, LocalDate.of(2018, 3, 20), "Ezequiel");
        Vehiculo v3 = new Vehiculo("VIN555", "5555TTT", "Toyota", "Corolla", "Blanco", 2020, LocalDate.of(2020, 7, 15), "Maria");

        repo.registrarVehiculo(v1);
        repo.registrarVehiculo(v2);
        repo.registrarVehiculo(v3);

        // -------------------------------------------------------------
        // 2. Registrar rematriculaciones
        // "Registrar una rematriculación para un vehículo existente"
        // -------------------------------------------------------------
        repo.registrarRematriculacion("VIN123", "5678DEF", LocalDate.of(2020, 1, 15));
        repo.registrarRematriculacion("VIN123", "1111AAA", LocalDate.of(2023, 6, 1));
        repo.registrarRematriculacion("VIN999", "2222BBB", LocalDate.of(2022, 3, 10));

        // -------------------------------------------------------------
        // 3. Buscar un vehículo por VIN y mostrar su información
        // "Buscar un vehículo por su número de bastidor"
        // -------------------------------------------------------------
        System.out.println("Vehículo con VIN123");
        Vehiculo buscado = repo.buscarPorVin("VIN123");
        if (buscado != null) {
            System.out.println(buscado);
        }

        // -------------------------------------------------------------
        // 4. Mostrar vehículos de un propietario ordenados por matrícula
        // "Mostrar todos los vehículos registrados a nombre de un propietario"
        // -------------------------------------------------------------

        System.out.println("Vehículos de Ezequiel ordenados por matrícula");
        for (Vehiculo v : repo.buscarPorPropietario("Ezequiel")) {
            System.out.println(v);
        }

        // -------------------------------------------------------------
        // 5. Mostrar todas las rematriculaciones de un vehículo
        // "Mostrar todas las rematriculaciones realizadas para un vehículo"
        // -------------------------------------------------------------
        System.out.println("Histórico de rematriculaciones de VIN123");
        Vehiculo vehiculoConHistorico = repo.buscarPorVin("VIN123");

        if (vehiculoConHistorico != null) {
            for (Rematriculacion r : vehiculoConHistorico.getHistorico()) {
                System.out.println(r);
            }
        }
    }
}
