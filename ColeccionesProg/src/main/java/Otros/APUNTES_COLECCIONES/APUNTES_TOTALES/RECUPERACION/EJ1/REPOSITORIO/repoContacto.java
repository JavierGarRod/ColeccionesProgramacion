package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.REPOSITORIO;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.EXCEPCIONES.ContactoNoEncontradoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.MODELO.Contacto;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ1.MODELO.Tipo_Contacto;

import java.util.*;

public class repoContacto {
    //atributos
    private HashSet<Contacto> contactos;

    //constructor
    public repoContacto(HashSet<Contacto> contactos) {
        this.contactos = contactos;
    }

    //getters y setters
    public HashSet<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(HashSet<Contacto> contactos) {
        this.contactos = contactos;
    }

    //métodos
    public boolean eliminarContacto(String telefono) throws ContactoNoEncontradoException {
        Iterator<Contacto> it = contactos.iterator();
        boolean eliminado = false;

        while (it.hasNext()){
            Contacto c = it.next();
            if(c.getTelefono().equals(telefono)){
                it.remove();
                eliminado = true;
            }
        }
        if (!eliminado){
            throw new ContactoNoEncontradoException("Contacto no encontrado");
        }
        return eliminado;
    }

    public List<Contacto> listarContactos(){
        List<Contacto> lista = new ArrayList<>();
        lista.addAll(contactos); //añade todo lo que haya en el HashSet contactos
        Collections.sort(lista); // usa compareTo()
      // Si usa Comparator: Collections.sort(lista, new ComparadorPorNombre());
        return lista;
    }

    public List<Contacto> listarPorTipoContacto(Tipo_Contacto tipo) {
        List<Contacto> lista = new ArrayList<>();
        for(Contacto c: contactos){
            if (c.getTipo() == tipo){
                lista.add(c);
            }
        }
        Collections.sort(lista);
        return lista;
    }

    public int contactos_totales(){
        int tamaño = contactos.size();
        return tamaño;
    }
}
