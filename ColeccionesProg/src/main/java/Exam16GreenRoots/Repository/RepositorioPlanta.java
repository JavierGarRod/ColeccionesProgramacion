package Exam16GreenRoots.Repository;

import Exam16GreenRoots.Exception.GreenRootsException;

import java.util.HashMap;
import java.util.Map;

public class RepositorioPlanta {
    Map<String,Integer> repositorioVivero;

    public RepositorioPlanta() {
        this.repositorioVivero = new HashMap<>();
    }

    public void añadirClave(String clave, int valor){
        if(repositorioVivero.containsKey(clave)){
            throw new GreenRootsException("La planta ya ha sido registrada");
        }
        repositorioVivero.put(clave,valor);
    }

    public String buscarClave(String claveBuscar){
        boolean encontrado=false;
        int rep=0;
        String resultado="";
        while(!encontrado && rep<repositorioVivero.size()){
            for (String clave : repositorioVivero.keySet()) {
                if(clave.equals(claveBuscar)){
                    resultado=clave;
                    encontrado=true;
                }
            }
        }
        return resultado;
    }

    public void eliminarClave(String clave){
        if(repositorioVivero.containsKey(clave)){
            repositorioVivero.remove(clave);
        }
        else{
            throw new GreenRootsException("El repositorio no contiene la clave: "+clave);
        }
    }

    //Con la clave que cogo busco en el repositorio, si no está lo añado y si está lo modifico por el que está
    public void modificarClave(String claveModificar, int valorModificar){
        repositorioVivero.put(claveModificar, valorModificar);
    }

    @Override
    public String toString() {
        return "RepositorioPlanta{" +
                "repositorioVivero=" + repositorioVivero +
                '}';
    }
}