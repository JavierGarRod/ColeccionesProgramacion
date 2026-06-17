package Exam17GestionContenido.Repository;

import Exam17GestionContenido.Models.CategoriaEtiqueta;
import Exam17GestionContenido.Models.Contenido;
import Exam17GestionContenido.Exception.ContenidoException;

import java.util.HashSet;
import java.util.Set;

public class RepositorioContenidos {
    Set<Contenido> repositorioContenido;

    public RepositorioContenidos(Set<Contenido> repositorioContenido) {
        this.repositorioContenido = new HashSet<>();
    }

    public void agregarContenido(Contenido contenidoAgregar){
        if(!repositorioContenido.contains(contenidoAgregar)){
            repositorioContenido.add(contenidoAgregar);
        }
        else{
            repositorioContenido.remove(contenidoAgregar);
            repositorioContenido.add(contenidoAgregar);
        }
    }

    public void agregarEtiqueta(String nombreContenidoAgregar, CategoriaEtiqueta categoriaAgregar, String nombreEtiquetaAgregar) throws ContenidoException{

    }

    public Contenido buscarContenido(String idContenidoBuscar) throws ContenidoException{
        boolean encontrado=false;
        int posicion=0;
        Contenido resultado=null;
        while(!encontrado && posicion< repositorioContenido.size()){
            for (Contenido c: repositorioContenido) {
                if(c.equals(idContenidoBuscar)){
                    resultado.equals(c);
                    encontrado=true;
                }
                else{
                    posicion++;
                }
            }
        }
        if(resultado.equals(null)){
            throw new ContenidoException("Ese contenido no existe en el repositorio");
        }
        return resultado;
    }
}
