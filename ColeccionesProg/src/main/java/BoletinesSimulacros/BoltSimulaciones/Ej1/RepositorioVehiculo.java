package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// "Repositorio que contiene la colección de vehículos"
public class RepositorioVehiculo {
    // Usamos List porque el enunciado no obliga a usar Map
    private List<Vehiculo> vehiculos;

    public RepositorioVehiculo() {
        vehiculos = new ArrayList<>();
    }

    //"Registrar un nuevo vehículo"
    public void registrarVehiculo(Vehiculo v) {

        // Comprobamos que no exista otro vehículo con el mismo VIN
        for (Vehiculo existente : vehiculos) {
            if (existente.getVin().equals(v.getVin())) {
                System.out.println("ERROR: Ya existe un vehículo con ese VIN");
            }
        }
        vehiculos.add(v);
    }

    // "Registrar una rematriculación"
    public void registrarRematriculacion(String vin, String nuevaMatricula, LocalDate fecha) {

        Vehiculo v = buscarPorVin(vin);

        if (v != null) {
            v.agregarRematriculacion(new Rematriculacion(nuevaMatricula, fecha));
        }
        else {
            System.out.println("ERROR: No existe un vehículo con ese VIN");
        }
    }

    // "Buscar vehículo por su número de bastidor"
    public Vehiculo buscarPorVin(String vin) {
        for (Vehiculo v : vehiculos) {
            if (v.getVin().equals(vin)) {
                return v;
            }
        }
        return null; // No encontrado
    }


        // Creamos una lista donde guardaremos los vehículos encontrados
        public List<Vehiculo> buscarPorPropietario (String propietario){

            // Creamos una lista donde guardaremos los vehículos encontrados
            List<Vehiculo> resultado = new ArrayList<>();

            // Recorremos todos los vehículos del repositorio
            for (Vehiculo v : vehiculos) {

                // Si el propietario coincide, lo añadimos a la lista resultado
                if (v.getPropietarioActual().equalsIgnoreCase(propietario)) {
                    resultado.add(v);
                }
            }

            for (int i = 0; i < resultado.size() - 1; i++) {

                // Este segundo for compara el elemento i con TODOS los que están a su derecha.
                // Por eso j empieza en i + 1.
                for (int j = i + 1; j < resultado.size(); j++) {

                    // Obtenemos los dos vehículos que vamos a comparar
                    Vehiculo v1 = resultado.get(i);
                    Vehiculo v2 = resultado.get(j);

                    // Comparamos las matrículas alfabéticamente usando compareTo
                    // Si v1 > v2 significa que están desordenados
                    if (v1.getMatriculaActual().compareTo(v2.getMatriculaActual()) > 0) {

                        // INTERCAMBIO DE POSICIONES
                        // Guardamos v1 temporalmente
                        Vehiculo aux = v1;

                        // Ponemos v2 en la posición de v1
                        resultado.set(i, v2);

                        // Ponemos v1 en la posición de v2
                        resultado.set(j, aux);
                    }
                }
            }

            // Devolvemos la lista ya ordenada
            return resultado;
        }
}
