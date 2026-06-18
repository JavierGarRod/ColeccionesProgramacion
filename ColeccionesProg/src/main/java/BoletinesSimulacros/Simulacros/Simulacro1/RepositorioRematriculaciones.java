package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class RepositorioRematriculaciones {

    // Estructura principal: VIN -> Vehiculo
    private Map<String, Vehiculo> vehiculosPorVin;

    public RepositorioRematriculaciones() {
        this.vehiculosPorVin = new HashMap<>();
    }

    // 1. Registrar un nuevo vehículo
    public void registrarVehiculo(Vehiculo v) {
        if (vehiculosPorVin.containsKey(v.getVin())) {
            throw new IllegalArgumentException("Ya existe un vehículo con VIN " + v.getVin());
        }
        vehiculosPorVin.put(v.getVin(), v);
    }

    // 2. Registrar una rematriculación
    public void registrarRematriculacion(String vin, String nuevaMatricula, LocalDate fecha) {
        Vehiculo v = vehiculosPorVin.get(vin);
        if (v == null) {
            throw new IllegalArgumentException("No existe vehículo con VIN " + vin);
        }
        Rematriculacion r = new Rematriculacion(nuevaMatricula, fecha);
        v.agregarRematriculacion(r);
    }

    // 3. Buscar vehículo por VIN (con su info completa)
    public Vehiculo buscarVehiculoPorVin(String vin) {
        return vehiculosPorVin.get(vin);
    }

    // 4. Mostrar todos los vehículos de un propietario ordenados por matrícula
    public List<Vehiculo> buscarVehiculosPorPropietarioOrdenMatricula(String propietario) {
        return vehiculosPorVin.values().stream()
                .filter(v -> v.getPropietarioActual().equalsIgnoreCase(propietario))
                .sorted(Comparator.comparing(Vehiculo::getMatriculaActual))
                .collect(Collectors.toList());
    }

    // 5. Mostrar todas las rematriculaciones de un vehículo ordenadas por fecha
    public List<Rematriculacion> obtenerRematriculacionesVehiculoOrdenFecha(String vin) {
        Vehiculo v = vehiculosPorVin.get(vin);
        if (v == null) {
            throw new IllegalArgumentException("No existe vehículo con VIN " + vin);
        }
        return v.getHistoricoMatriculaciones().stream()
                .sorted(Comparator.comparing(Rematriculacion::getFechaRematriculacion))
                .collect(Collectors.toList());
    }

    // Método auxiliar para ver todos los vehículos
    public List<Vehiculo> getTodosVehiculos() {
        return new ArrayList<>(vehiculosPorVin.values());
    }
}

