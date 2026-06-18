package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt2.Ej1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GestionaReservas {

    public static void mostrarOrdenadosPorNombreYFecha(List<Animal> lista) {

        Collections.sort(lista, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                int comp = a1.getNombre().compareToIgnoreCase(a2.getNombre());
                if (comp == 0) {
                    return a1.getFechaNacimiento().compareTo(a2.getFechaNacimiento());
                }
                return comp;
            }
        });

        for (Animal a : lista) {
            System.out.println(a);
        }
    }
}
