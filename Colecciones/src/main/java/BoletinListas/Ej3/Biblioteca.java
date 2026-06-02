package Colecciones.src.main.java.BoletinListas.Ej3;

import java.util.List;

public class Biblioteca {
    List<Libro> librosRegistrados;

    public void agregarLibro (Libro l){
        if(!librosRegistrados.contains(l)){
            librosRegistrados.add(l);
        }
 /   }

    public void prestarLibro(Libro l){
        if(l.estadoLibro.equals(Estado.LIBRE)){
        }
    }
}
