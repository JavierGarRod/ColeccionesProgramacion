package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.CONTROLADOR;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.MODELO.Pelicula;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.EXCEPCIONES.PeliculaNoDisponibleException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.REPOSITORIO.RepoPeliculas;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ2.MODELO.Tipo_Genero;

import java.time.LocalDate;
import java.util.HashSet;

public class Gestiona {
    public static void main(String[] args) {

        //Películas
        Pelicula p1 = new Pelicula("Juego de tronos", "Caesar", LocalDate.of(2000,12,23), Tipo_Genero.CIENCIA_FICCION, true);
        Pelicula p2 = new Pelicula("Harry Potter", "Magnus", LocalDate.of(2020,11,23), Tipo_Genero.COMEDIA, true);
        Pelicula p3 = new Pelicula("El Santuario de las 4 estaciones", "Helen", LocalDate.now(), Tipo_Genero.TERROR, true);
        Pelicula p4 = new Pelicula("El señor de los anillos", "Goblin", LocalDate.of(2011,1,23), Tipo_Genero.DRAMA, true);
        Pelicula p5 = new Pelicula("El retrato de Dorian Gray", "Dorian", LocalDate.of(2003,10,2), Tipo_Genero.CIENCIA_FICCION, true);
        Pelicula p6 = new Pelicula("El espejo del desierto", "Augustus", LocalDate.of(1999,12,5), Tipo_Genero.COMEDIA, true);
        Pelicula p7 = new Pelicula("La dimensión del contratiempo", "Yina", LocalDate.of(2006,7,22), Tipo_Genero.ACCION, true);
        Pelicula p8 = new Pelicula("El olvido de las sombras", "Yina", LocalDate.of(2003,3,3), Tipo_Genero.CIENCIA_FICCION, true);

        //Lista
        HashSet<Pelicula> peliculas = new HashSet<>();
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p4);
        peliculas.add(p5);
        peliculas.add(p6);
        peliculas.add(p7);
        peliculas.add(p8);

        //Repositorio
        RepoPeliculas repo = new RepoPeliculas(peliculas);

        //Alquileres
        repo.alquilar_por_id(7);
        repo.alquilar_por_id(4);
        repo.alquilar_por_id(5);

        //Devolución
        repo.devolverXID(5);

        //Alquilar una ya alquilada
        try{
            repo.alquilar_por_id(6);
        } catch (PeliculaNoDisponibleException ep){
            System.out.println(ep);
        }

        //Añado nueva
        repo.añadirPelicula(p3);

        //Listados
        System.out.println("\n---CATÁLOGO---");
        for(Pelicula p:repo.mostrar_catalogo()){
            System.out.println(p);
        }
        System.out.println("\n---MISMO AUTOR---");
        for(Pelicula p:repo.mostrar_pelis_director("Yina")){
            System.out.println(p);
        }

        System.out.println("\n---PELICULAS DISPONIBLES---");
        for(Pelicula p: repo.mostrar_disponibles()){
            System.out.println(p);
        }

        System.out.println("\n---PELICULAS ALQUILADAS---");
        System.out.println(repo.total_pelis_alquiladas());
    }
}
