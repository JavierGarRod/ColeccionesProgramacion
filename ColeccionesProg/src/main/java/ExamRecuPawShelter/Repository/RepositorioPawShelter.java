package Repository;

import Models.Animal;
import Models.CentroAcogida;
import Exception.MiExcepcion;
import Models.OrdenAnimales;

import java.util.*;


public class RepositorioPawShelter {
    Map<CentroAcogida, Set<Animal>> repoPawShelter; //He escogido esta estructura de datos ya que necesito guardar los objetos (Clave, Valor), donde el valor es una Lista que se tienen que guardar ordenador y sin repetidos

    public RepositorioPawShelter() {
        this.repoPawShelter = new HashMap<>();
    }

    public void registrarCentro(CentroAcogida nombreCentroRegistrar) throws MiExcepcion{
        if(!repoPawShelter.containsKey(nombreCentroRegistrar)){
            repoPawShelter.put(nombreCentroRegistrar,new HashSet<Animal>());
        }
        else{
            throw new MiExcepcion("Este centro ya ha sido registrado en el sistema");
        }
    }

    public boolean buscarCentro(CentroAcogida centroBuscar){
        boolean encontrado=false;

        if(repoPawShelter.containsKey(centroBuscar)){
            encontrado=true;
        }
        return encontrado;
    }

    public void registrarAnimal(String nombreCentro, String ciudadCentro, int capacidadMaxCentro, Animal animalRegistrar) throws  MiExcepcion{
        CentroAcogida centro=new CentroAcogida(nombreCentro,ciudadCentro,capacidadMaxCentro);
        if(repoPawShelter.containsKey(centro)){
            if(repoPawShelter.containsValue(animalRegistrar)){
                throw new MiExcepcion("Este animal ya está acogido en este centro");
            }
            else{
                Set<Animal> animales=this.repoPawShelter.get(centro);
                animales.add(animalRegistrar);
            }
        }
        else{
            Set<Animal> animales=new HashSet<Animal>();
            animales.add(animalRegistrar);
            repoPawShelter.put(centro,animales);
        }
    }

    public List<Animal> getAnimalesCentro(CentroAcogida nombreCentro) throws MiExcepcion{
        if(!repoPawShelter.containsKey(nombreCentro)){
            throw new MiExcepcion("El centro no está registrado en el sistema");
        }
        else{
            List<Animal> resultado=new ArrayList<Animal>(repoPawShelter.get(nombreCentro));
            Collections.sort(resultado, new OrdenAnimales());
            return resultado;
        }
    }

    /*
    public String getEspecie(){
        Set<Animal> animales=new HashSet<Animal>();
        String especie = "";
        for (Set<Animal> a: repoPawShelter.values()) {
            System.out.println(a);
        }
        return especie;
    }
    */

    //NO ME FUNCIONA NO SE COMO HACERLO
    public Map<String, List<Animal>> obtenerAnimalesPorEspecie(){  //Clave=Especie, Valor=Lista de animales
        Map<String, List<Animal>> resultado = new HashMap<>();
        if(repoPawShelter.isEmpty()){
            return resultado;
        }
        for(CentroAcogida c : repoPawShelter.keySet()){
            List<Animal> animales= new ArrayList<Animal>(repoPawShelter.get(c));
            resultado.put(String.valueOf(animales.getLast()),animales);
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "RepositorioPawShelter{" +
                "repoPawShelter=" + repoPawShelter +
                '}';
    }
}
