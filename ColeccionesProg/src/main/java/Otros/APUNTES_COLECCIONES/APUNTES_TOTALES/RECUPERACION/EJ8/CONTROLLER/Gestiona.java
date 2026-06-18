package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.CONTROLLER;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.EXCEPTIONS.ClienteNoEncontradoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.EXCEPTIONS.ClienteYaExistenteException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.EXCEPTIONS.LibroNoEncontradoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.EXCEPTIONS.LibroYaExistenteException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.MODEL.Categoria;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.MODEL.Cliente;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.MODEL.Libro;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.REPOSITORY.RepoBiblioteca;

public class Gestiona {
    public static void main(String[] args) {

        //Clientes
        Cliente c1 = new Cliente("Elena", "epaben@gmail.com", "696153160");
        Cliente c2 = new Cliente("Alena", "epasdfen@gmail.com", "695343160");
        Cliente c3 = new Cliente("Rena", "23452n@gmail.com", "696153340");

        //Libros
        Libro l1 = new Libro("Sangre pura", 12.6, Categoria.CIENCIA);
        Libro l2 = new Libro("Sangre fría", 20.6, Categoria.HISTORIA);
        Libro l3 = new Libro("Cazadores", 10.6, Categoria.INFANTIL);
        Libro l4 = new Libro("Humanos enfermos", 12.4, Categoria.HISTORIA);
        Libro l5 = new Libro("Yerman", 12.7, Categoria.NOVELA);
        Libro l6 = new Libro("Dios de la sombra", 28.6, Categoria.CIENCIA);

        //Repositorio
        RepoBiblioteca repo = new RepoBiblioteca();

        try{
            repo.registrarCliente(c1);
            repo.registrarCliente(c2);
            repo.registrarCliente(c3);
        } catch(ClienteYaExistenteException e){
            System.out.println(e);
        }

        try{
            repo.añadirNewLibro(l1);
            repo.añadirNewLibro(l2);
            repo.añadirNewLibro(l3);
            repo.añadirNewLibro(l4);
            repo.añadirNewLibro(l5);
            repo.añadirNewLibro(l6);
        }catch (LibroYaExistenteException e){
            System.out.println(e);
        }

        try{
            repo.comprarLibro(c1,l2);
            repo.comprarLibro(c1,l3);
            repo.comprarLibro(c1,l4);
            repo.comprarLibro(c2,l2);
            repo.comprarLibro(c3,l5);
            repo.comprarLibro(c3,l6);
            repo.comprarLibro(c2,l1);
        }catch (LibroNoEncontradoException | ClienteNoEncontradoException e){
            System.out.println(e);
        }

        System.out.println("\n---LIBROS COMPRADOS---");
        for(Libro l: repo.mostrarLibrosComprados(c1)){
            System.out.println(l);
        }

        System.out.println("\n---CLIENTE QUE MÁS HA GASTADO MONEY---");
        System.out.println(repo.mostrarClienteMasGastos());

        System.out.println("\n---CLIENTES REGISTRADOS---");
        for(Cliente c: repo.mostrarClientes()){
            System.out.println(c);
        }

        System.out.println("\n---LIBROS POR CATEGORÍA CIENTÍFICA---");
        for(Libro l: repo.mostrarLibrosCategoria(Categoria.CIENCIA)){
            System.out.println(l);
        }
    }
}
