package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.Ejercicios_IA.Collections;

import java.util.*;

public class RepositorioAnimal {

    //  atributos
    private List<Animal> lista; //creo una lista interna porque es lo que necesito para los métodos que me piden

    //constructor
    public RepositorioAnimal() {
        this.lista = new ArrayList<>();
    }

    //métodos
    public boolean add_animal(Animal a){
        if (!lista.contains(a)){
            lista.add(a);
            return true;
        }
        else{
            return false;
        }
    }

    public void mostrar_ordenado(){
        System.out.println("\n---Ordenación por nombre---");
        List<Animal> copia1 = new ArrayList<>(lista);
        Collections.sort(copia1);
        copia1.forEach(System.out::println); // forEach -- for (Animal a: copia1) -> (System.out:println(a))

        System.out.println("-----------------------------------");

        System.out.println("---Ordenación por edad---");
        List<Animal> copia2 = new ArrayList<>(lista);
        Orden_Edad ordenEdad = new Orden_Edad();
        Collections.sort(copia2, ordenEdad); // o (new Orden_Edad())
        copia2.forEach(System.out::println); //soutc
    }

    public Animal consultar_datos(int id){
        for (Animal animals: lista){
            if (animals.getId() == id){
                return animals;
            }
        }
        return null;
    }

    public void modificar_datos(int id, String nombre){
        boolean encontrado = false;

        Iterator<Animal> itAnimal = lista.iterator();

        do{
            Animal nest = itAnimal.next();
            if(nest.getId() == id){
                nest.setNombre(nombre);
                System.out.println("Nombre modificado correctamente");
                encontrado = true;
            }
        }while (itAnimal.hasNext());

        if (!encontrado) {
            System.out.println("No existe un animal con ese id");
        }
    }

}
