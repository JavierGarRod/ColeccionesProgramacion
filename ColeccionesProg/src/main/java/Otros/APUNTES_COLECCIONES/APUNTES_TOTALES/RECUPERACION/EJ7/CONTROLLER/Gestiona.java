package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.CONTROLLER;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.EXCEPTIONS.ArtistaNoEncontradoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.EXCEPTIONS.ArtistaYaExisteException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.MODEL.Artista;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.MODEL.Cancion;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.MODEL.Tipo_GeneroM;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ7.REPOSITORY.RepoCanciones;

public class Gestiona {
    public static void main(String[] args) {

        //Artistas
        Artista a1 = new Artista("Elena", Tipo_GeneroM.ELECTRONICA, "España");
        Artista a2 = new Artista("Ali", Tipo_GeneroM.ROCK, "España");
        Artista a3 = new Artista("Yina", Tipo_GeneroM.JAZZ, "España");
        Artista a4 = new Artista("Jesús", Tipo_GeneroM.POP, "EEUU");

        //Canciones
        Cancion c1 = new Cancion("Los query", 123, 4);
        Cancion c2 = new Cancion("Los nenes", 345, 345);
        Cancion c3 = new Cancion("Los yeri", 567, 100);
        Cancion c4 = new Cancion("Los chusma", 50, 4345);
        Cancion c5 = new Cancion("Los tt", 80, 500);

        //Repositorio
        RepoCanciones repo = new RepoCanciones();

        try {
            repo.registrarArtista(a1);
            repo.registrarArtista(a2);
            repo.registrarArtista(a3);
            repo.registrarArtista(a4);
        }catch (ArtistaYaExisteException e){
            System.out.println(e);
        }

        try {
            repo.añadirCancion(a1, c1);
            repo.añadirCancion(a2, c2);
            repo.añadirCancion(a3, c3);
            repo.añadirCancion(a4, c4);
        }catch(ArtistaNoEncontradoException e){
            System.out.println(e);
        }

        repo.eliminarCancion(c1,a1);

        System.out.println("\n---ARTISTAS POR REPRODUCCIONES EN DESC ---");
        for(Artista a: repo.rankingArtistasPorReproducciones()){
            System.out.println(a);
        }
        System.out.println("\n---CANCIÓN MÁS REPRODUCIDA---");
        System.out.println(repo.obtenerCancionMasReproducida());

        System.out.println("\n---CANTIDAD DE REPRODUCCIONES POR ARTISTA---");
        System.out.println(repo.calcularCantReprXArtista(a4));

        System.out.println("\n---ARTISTAS CON MISMO GÉNERO MUSICAL---");
        for(Artista a: repo.obtenerArtistaGen(Tipo_GeneroM.ELECTRONICA)){
            System.out.println(a);
        }

        System.out.println("\n---ARTISTA + CANCIONES---");
        System.out.println(repo.obtenerArtistaMasCanciones());

    }
}
