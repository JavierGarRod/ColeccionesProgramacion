package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.REPOSITORY;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.EXCEPTIONS.ClienteNoEncontradoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.EXCEPTIONS.ClienteYaExistenteException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.EXCEPTIONS.LibroNoEncontradoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.EXCEPTIONS.LibroYaExistenteException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.MODEL.Categoria;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.MODEL.Cliente;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.MODEL.Libro;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ8.MODEL.OrdenPrecioDesc;

import java.util.*;

public class RepoBiblioteca {

    //atributos
    Map<String, Cliente> clientes;
    Map<Cliente, List<Libro>> librosPrestados;
    HashSet<Libro> libros;

    //constructor
    public RepoBiblioteca() {
        this.clientes = new HashMap<>();
        this.librosPrestados = new HashMap<>();
        this.libros = new HashSet<>();
    }

    //métodos

    public void registrarCliente(Cliente cliente) throws ClienteYaExistenteException {
        if(clientes.containsKey(cliente.getEmail())){
            throw new ClienteYaExistenteException("El cliente ya existe");
        }
        clientes.put(cliente.getEmail(), cliente);

        /*for(String email: clientes.keySet()){
            if(email.equals(cliente.getEmail())){
                throw new ClienteYaExistenteException("El cliente ya existe");
            }
        }*/
    }

    public void añadirNewLibro(Libro libro) throws LibroYaExistenteException {
        if(libros.contains(libro)){
            throw new LibroYaExistenteException("El libro ya existe");
        }
        libros.add(libro);
    }

    public void comprarLibro(Cliente cliente, Libro libro) //OJO
            throws ClienteNoEncontradoException, LibroNoEncontradoException {

        if (!clientes.containsKey(cliente.getEmail())) {
            throw new ClienteNoEncontradoException("Cliente no encontrado");
        }
        if (!libros.contains(libro)) {
            throw new LibroNoEncontradoException("Libro no encontrado");
        }
        if (!librosPrestados.containsKey(cliente)) {
            librosPrestados.put(cliente, new ArrayList<>());
        }
        librosPrestados.get(cliente).add(libro);
        libros.remove(libro); // se elimina del catálogo al comprarlo
    }

    public List<Libro> mostrarLibrosComprados(Cliente cliente){
        List<Libro> libros1 = new ArrayList<>(librosPrestados.get(cliente)); //todos los libros de un cliente
        Collections.sort(libros1,new OrdenPrecioDesc());
        return libros1;
    }

    public double calcularGastoCliente(Cliente cliente){
        double total = 0;
        List<Libro> libros1 = new ArrayList<>(librosPrestados.get(cliente));
        for (Libro l: libros1){
            total = total+ l.getPrecio();
        }
        return total;
    }

    public Cliente mostrarClienteMasGastos(){
        double max = 0;
        Cliente rico = null;
        for(Map.Entry<Cliente, List<Libro>> entry: librosPrestados.entrySet()){
            if(calcularGastoCliente(entry.getKey()) > max){
                max = calcularGastoCliente(entry.getKey());
                rico = entry.getKey();
            }
        }
        return rico;
    }

    public List<Cliente> mostrarClientes(){
        List<Cliente> clientes1 = new ArrayList<>(clientes.values());
        Collections.sort(clientes1);
        return clientes1;
    }

    public List<Libro> mostrarLibrosCategoria(Categoria categoria){
        List<Libro> libros1 = new ArrayList<>();
        for(Libro l: libros){
            if(l.getCategoria().equals(categoria)){
                libros1.add(l);
            }
        }
        return libros1;
    }
}
