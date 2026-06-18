package ColeccionesProg.src.main.java.BoletinesSimulacros.RegistroTrafico;

import java.time.LocalDate;
import java.util.*;

public class RepositorioVehiculo {
    List<Vehiculo> vehiculos;
    Map<String, List<Vehiculo>> registrovehiculos;

    public RepositorioVehiculo(List<Vehiculo> vehiculos, Map<String, List<Vehiculo>> registrovehiculos) {
        this.vehiculos = vehiculos;
        this.registrovehiculos = registrovehiculos;
    }

    public RepositorioVehiculo() {
    }

    public void addVehiculo(Vehiculo v){
        if (registrovehiculos.containsKey(v.getNumBastidorVIN())){
            vehiculos=registrovehiculos.get(v.getNumBastidorVIN());
            vehiculos.add(v);
        }
        v = new Vehiculo(v.getNumBastidorVIN(), v.getMatricula(), v.getMarca(), v.getModelo(), v.getAñoFabricacion(), v.getPropietario());
        vehiculos.add(v);
        registrovehiculos.put(v.getNumBastidorVIN(), vehiculos);
    }

    public void buscarVehiculo(String vin){
        List<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
        boolean encontrado=false;
        int posicion=0;
        while(!encontrado || posicion<vehiculos.size()){
            if(registrovehiculos.containsKey(vin)){
                System.out.println(vehiculos);
                encontrado=true;
            }
            else{
                posicion++;
            }
        }
    }
}
