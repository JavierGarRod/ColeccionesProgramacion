package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro1;

import java.time.LocalDate;
import java.util.List;

public class GestionaRematriculaciones {

    public static void main(String[] args) {

        RepositorioRematriculaciones repo = new RepositorioRematriculaciones();

        // 1. Registrar vehículos
        Vehiculo v1 = new Vehiculo(
                "VIN001",
                "1234-ABC",
                "Toyota",
                "Corolla",
                "Blanco",
                2015,
                LocalDate.of(2015, 5, 10),
                "Juan Perez"
        );

        Vehiculo v2 = new Vehiculo(
                "VIN002",
                "5678-DEF",
                "Seat",
                "Ibiza",
                "Rojo",
                2018,
                LocalDate.of(2018, 3, 20),
                "Ana Lopez"
        );

        Vehiculo v3 = new Vehiculo(
                "VIN003",
                "9999-GHI",
                "Renault",
                "Clio",
                "Azul",
                2020,
                LocalDate.of(2020, 7, 1),
                "Juan Perez"
        );

        repo.registrarVehiculo(v1);
        repo.registrarVehiculo(v2);
        repo.registrarVehiculo(v3);

        // 2. Registrar rematriculaciones
        repo.registrarRematriculacion("VIN001", "0000-JKL", LocalDate.of(2020, 1, 15));
        repo.registrarRematriculacion("VIN001", "1111-MNO", LocalDate.of(2022, 6, 5));
        repo.registrarRematriculacion("VIN003", "2222-PQR", LocalDate.of(2023, 2, 10));

        // 3. Buscar vehículo por VIN y mostrar info completa
        System.out.println("=== Vehículo VIN001 ===");
        Vehiculo buscado = repo.buscarVehiculoPorVin("VIN001");
        System.out.println(buscado);
        System.out.println("Histórico de matriculaciones VIN001:");
        List<Rematriculacion> hist1 = repo.obtenerRematriculacionesVehiculoOrdenFecha("VIN001");
        hist1.forEach(System.out::println);

        // 4. Mostrar vehículos de un propietario ordenados por matrícula
        System.out.println("\n=== Vehículos de Juan Perez ordenados por matrícula ===");
        List<Vehiculo> vehiculosJuan = repo.buscarVehiculosPorPropietarioOrdenMatricula("Juan Perez");
        vehiculosJuan.forEach(System.out::println);

        // 5. Mostrar rematriculaciones de un vehículo específico
        System.out.println("\n=== Rematriculaciones de VIN003 ordenadas por fecha ===");
        List<Rematriculacion> hist3 = repo.obtenerRematriculacionesVehiculoOrdenFecha("VIN003");
        hist3.forEach(System.out::println);

        // Ejemplo de error controlado (VIN inexistente)
        try {
            repo.obtenerRematriculacionesVehiculoOrdenFecha("VIN999");
        } catch (IllegalArgumentException e) {
            System.out.println("\n[ERROR ESPERADO] " + e.getMessage());
        }
    }
}

