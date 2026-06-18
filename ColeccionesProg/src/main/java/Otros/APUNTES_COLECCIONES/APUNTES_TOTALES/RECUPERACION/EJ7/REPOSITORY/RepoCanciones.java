package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.REPOSITORY;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.EXCEPTIONS.ArtistaNoEncontradoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.EXCEPTIONS.ArtistaYaExisteException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.MODEL.Artista;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.MODEL.Cancion;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.MODEL.OrdenReprCanciones;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.MODEL.Tipo_GeneroM;

import java.util.List;
import java.util.*;

public class RepoCanciones {

    //atributos
    Map<Artista, List<Cancion>> canciones;

    //constructor
    public RepoCanciones() {
        this.canciones = new HashMap<>();
    }

    //métodos

    public void registrarArtista(Artista a) throws ArtistaYaExisteException {
        if(canciones.containsKey(a)){
            throw new ArtistaYaExisteException("El artista ya existe");
        }
        canciones.put(a,new ArrayList<>());
    }

    public void añadirCancion(Artista a, Cancion c) throws ArtistaNoEncontradoException {
        if(!canciones.containsKey(a)){
            throw new ArtistaNoEncontradoException("Artista no encontrado");
        }
        canciones.get(a).add(c); //si ya existe, se añade la canción a la lista
    }

    public void eliminarCancion(Cancion c, Artista a){
        List<Cancion> cancionList = canciones.get(a);
        Iterator<Cancion> it = cancionList.iterator();
        while(it.hasNext()){
            Cancion can = it.next();
            if(can.getId() == c.getId()){
                it.remove();
            }
        }
    }

    public int calcularCantReprXArtista(Artista a){
        int total = 0;
        List<Cancion> cancionList = canciones.get(a); //esto toma la lista original
        for(Cancion c: cancionList){
            total = total + c.getReproducciones();
        }
        return total;
    }

    public List<Artista> rankingArtistasPorReproducciones() {
        List<Artista> lista = new ArrayList<>(canciones.keySet());
        Collections.sort(lista, new OrdenReprCanciones(this));
        return lista;
    }

    public Artista obtenerArtistaMasCanciones(){
        int max = 0;
        Artista mayor = null;
        for(Map.Entry<Artista, List<Cancion>> entry : canciones.entrySet()){
            if(entry.getValue().size() > max){
                max = entry.getValue().size();
                mayor = entry.getKey();
            }
        }
        return mayor;
    }

    public Cancion obtenerCancionMasReproducida(){
        int max = 0;
        Cancion cn = null;
        for(List<Cancion> lc: canciones.values()){
            for(Cancion c: lc){
                if(c.getReproducciones() > max){
                    max = c.getReproducciones();
                    cn = c;
                }
            }
        }
        return cn;
    }

    public List<Artista> obtenerArtistaGen(Tipo_GeneroM tipo){
        List<Artista> artistaList = new ArrayList<>();
        for(Artista a: canciones.keySet()){
            if(a.getGeneroMusical().equals(tipo)){
                artistaList.add(a);
            }
        }
        return artistaList;
    }
}
