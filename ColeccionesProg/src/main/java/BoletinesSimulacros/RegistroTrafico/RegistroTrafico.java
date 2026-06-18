package ColeccionesProg.src.main.java.BoletinesSimulacros.RegistroTrafico;

import java.time.LocalDate;

public class RegistroTrafico {
    static void main() {
        RepositorioVehiculo rep1=new RepositorioVehiculo();
        //Registro un vehiculo
        Vehiculo v1 = new Vehiculo("123456", "1234ABC", "Seat", "Leon", LocalDate.of(2026, 3, 1), "Pepe");
        Vehiculo v3 = new Vehiculo("123444", "1234BAC", "Seat", "Leon", LocalDate.of(2026, 1, 1), "Josefa");
        rep1.addVehiculo(v1);
        rep1.addVehiculo(v3);
        //Registrar el mismo vehiculo con otra matricula
        Vehiculo v2 = new Vehiculo("123456", "1234AAC", "Seat", "Leon", LocalDate.of(2026, 4, 1), "Pepe");
        rep1.addVehiculo(v2);
        rep1.buscarVehiculo("123456");
    }
}
