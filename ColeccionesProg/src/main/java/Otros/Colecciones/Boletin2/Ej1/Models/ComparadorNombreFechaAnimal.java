package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin2.Ej1.Models;

import java.util.Comparator;

public class ComparadorNombreFechaAnimal implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int resultado = o1.getNombre().compareTo(o2.getNombre());
        if(resultado == 0)
        {
            resultado = o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
        }
        return resultado;
    }
}
