package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt2.Ej1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenadoPorNombre {
    
    public OrdenadoPorNombre(List<Animal> lista) {

        Collections.sort(lista, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {

                int comp = a1.getMedio().compareToIgnoreCase(a2.getMedio());

                if (comp == 0) {
                    return a1.getNombre().compareToIgnoreCase(a2.getNombre());
                }

                return comp;
            }
        });

        for (Animal a : lista) {
            System.out.println(a);
        }
    }
}