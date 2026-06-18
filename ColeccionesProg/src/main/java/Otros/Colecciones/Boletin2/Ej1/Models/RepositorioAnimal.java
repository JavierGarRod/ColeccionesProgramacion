package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin2.Ej1.Models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class RepositorioAnimal {

    private String nombre;
    private String lugar;
    private double presupuestoAnual;
    private TreeSet<Animal> animales;

    public RepositorioAnimal(String nombre, String lugar, double presupuestoAnual) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.presupuestoAnual = presupuestoAnual;
        this.animales = new  TreeSet<Animal>();
    }

    public boolean agregarAnimal(Animal a) {
        return animales.add(a); // TreeSet evita duplicados y mantiene orden
    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            System.out.println(a);
        }
    }

    public boolean modificarNombreAnimal(int id, String nuevoNombre) {
        for (Animal a : animales) {
            if (a.getId() == id) {
                animales.remove(a);
                Animal modificado = new Animal(id, nuevoNombre, a.especie, a.edad,
                        a.getClasificacionComida(), a.getFechaNacimiento(), a.peso,
                        a.getMedio(), a.clasificacionGestacion);
                animales.add(modificado);
                return true;
            }
        }
        return false;
    }

    public List<Animal> pasoDeTreeSetAList(){
        List<Animal> animalList=new ArrayList<Animal>();
        Iterator<Animal> iterador = this.animales.iterator();
        while(iterador.hasNext()){
            Animal a = iterador.next();
            animalList.add(a);
        }
        return animalList;
    }
}