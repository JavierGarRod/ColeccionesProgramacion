package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt2.Ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositorioAnimal {

    private String nombre;
    private String lugar;
    private double presupuestoAnual;
    private List<Animal> animales;

    public RepositorioAnimal(String nombre, String lugar, double presupuestoAnual) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.presupuestoAnual = presupuestoAnual;
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal a) {
        if (!animales.contains(a)) {
            animales.add(a);
            Collections.sort(animales);
        }
    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            System.out.println(a);
        }
    }
}
