package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.REPOSITORIO;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.EXCEPCIONES.AnioInvalidoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.EXCEPCIONES.PeliculaDuplicadaException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.EXCEPCIONES.PeliculaNoDisponibleException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.EXCEPCIONES.PeliculaNoEncontradaException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.MODELO.Orden_Anio;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.MODELO.Orden_Anio_Desc;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.MODELO.Pelicula;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RepoPeliculas {

    //atributos
    HashSet<Pelicula> peliculas;

    //constructor
    public RepoPeliculas(HashSet<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    //métodos

    public void añadirPelicula(Pelicula nueva) {

        // Validar año
        int anio = nueva.getFecha().getYear();
        int actual = LocalDate.now().getYear();
        if (anio < 1888 || anio > actual) {
            throw new AnioInvalidoException("Año inválido");
        }

        // Comprobar duplicado
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(nueva.getTitulo()) && p.getDirector().equalsIgnoreCase(nueva.getDirector())) {
                throw new PeliculaDuplicadaException("Película duplicada");
            }
        }
        peliculas.add(nueva);
    }


    public boolean alquilar_por_id(int id) throws PeliculaNoDisponibleException, PeliculaNoEncontradaException {
        boolean encontrada = false;
        boolean alquilada = false;

        for (Pelicula p : peliculas) {
            if (p.getId() == id) {
                encontrada = true;
                if (!p.isDisponible()) {
                    throw new PeliculaNoDisponibleException("Película no disponible");
                }
                p.setDisponible(false);
                alquilada = true;
            }
        }
        if (!encontrada) {
            throw new PeliculaNoEncontradaException("Película no encontrada");
        }
        return alquilada;
    }


    public Pelicula devolverXID(int id){
        for(Pelicula p:peliculas){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public List<Pelicula> mostrar_pelis_director(String director){
        List<Pelicula> peliculas1 = new ArrayList<>();
        for(Pelicula p:peliculas){
            if(p.getDirector().equalsIgnoreCase(director)){
                peliculas1.add(p);
            }
        }
        Collections.sort(peliculas1, new Orden_Anio());
        return peliculas1;
    }

    public List<Pelicula> mostrar_catalogo(){
        List<Pelicula> peliculas2 = new ArrayList<>();
        peliculas2.addAll(peliculas);
        Collections.sort(peliculas2);
        return peliculas2;
    }

    public List<Pelicula> mostrar_disponibles(){
        List<Pelicula> peliculas3 = new ArrayList<>();
        for(Pelicula p : peliculas){
            if(p.isDisponible()){
                peliculas3.add(p);
            }
        }
        Collections.sort(peliculas3, new Orden_Anio_Desc());
        return peliculas3;
    }

    public int total_pelis_alquiladas(){
        int total = 0;
        for(Pelicula p: peliculas){
            if(!p.isDisponible()){
                total++;
            }
        }
        return total;
    }
}
