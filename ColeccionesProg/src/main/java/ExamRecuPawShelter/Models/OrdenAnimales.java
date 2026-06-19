package Models;

import java.time.LocalDate;
import java.util.Comparator;

public class OrdenAnimales implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int resultado=(o1.getFechaIngreso()).compareTo(o2.getFechaIngreso());
        if(resultado==0){
            resultado=o1.getIdAnimal().compareTo(o2.getIdAnimal());
        }
        return resultado;
    }
}
