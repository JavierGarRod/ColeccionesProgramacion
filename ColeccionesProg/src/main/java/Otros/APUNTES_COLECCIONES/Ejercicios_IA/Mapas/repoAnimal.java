package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.Ejercicios_IA.Mapas;

import java.util.*;

public class repoAnimal {
    Map<String, List<Animal>> animales = new HashMap<>();

    public boolean addAnimal(Animal a) {

        // Si no está, creamos la lista de especie
        if (!animales.containsKey(a.getEspecie())) {
            animales.put(a.getEspecie(), new ArrayList<>());
        }

        // Recuperamos la LISTA que está asociada a esa especie
        List<Animal> listaDeEstaEspecie = animales.get(a.getEspecie());

        // Añadimos el animal a la LISTA
        boolean insertado = listaDeEstaEspecie.add(a);

        // Devolvemos el resultado
        return insertado;
    }

    public Map<String, Integer> contarAnimalesPorEspecie(){
        Map<String, Integer> resultado = new HashMap<>();

        for(String especie: animales.keySet()){
            List<Animal> lista = animales.get(especie);
            int cantidad = lista.size();
            resultado.put(especie, cantidad);
        }
        return resultado;
    }

    public List<Animal> obtenerAnimalesMayores(){
        List<Animal> mayores = new ArrayList<>();
        for(List<Animal> animal: animales.values()){ //me da todas las listas de cada animal
            for(Animal a: animal){ //me da cada animal de cada especie
                if(a.getEdad() > 10) mayores.add(a);
            }
        }
        return mayores;
    }

    public void darDeAltaAnimales(){
       for(List<Animal> lista: animales.values()){
           Iterator<Animal> animalIterator = lista.iterator();
           while (animalIterator.hasNext()){
               Animal a = animalIterator.next();
               if(a.getTipo_Estado().equals(Estado.ALTA)){
                   animalIterator.remove();
               }
           }
       }
    }

    public Animal obtenerMasPesado(String especieABuscar){
        List <Animal> lista = animales.get(especieABuscar);
        Animal masPesado = null;

        if(lista != null && !lista.isEmpty()){
            masPesado = lista.get(0);

            for(Animal a : lista){
                if(a.getPeso() > masPesado.getPeso()){
                    masPesado = a;
                }
            }
        }
        return masPesado;
    }

}
