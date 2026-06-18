package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.EXAMEN_COLECCIONES.CORRECCION.repositorio;

import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.CORRECCION.modelos.Batalla;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.excepciones.BatallaException;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.Comandante;

import java.util.*;

public class RepositorioBatallas {

    // atributos
    private Set<Batalla> batallas;

    // constructor
    public RepositorioBatallas() {
        this.batallas = new HashSet<>();
    }

    // agregar o actualizar batalla (por id)
    public void agregarBatalla(Batalla batalla) {
        batallas.remove(batalla); // usa equals por id (si no borra batalla, no existe y la añade)
        batallas.add(batalla);
    }

    // agregar comandante a una batalla concreta
    public void agregarComandante(Comandante comandante, String idBatalla) throws BatallaException {
        Batalla b = buscarBatalla(idBatalla);
        if (b == null) {
            throw new BatallaException("INVÁLIDO, la batalla no existe");
        }
        b.agregarComandante(comandante);
    }

    // buscar batalla por id
    public Batalla buscarBatalla(String idBatalla) {
        for (Batalla b : batallas) {
            if (b.getIdBatalla().equals(idBatalla)) {
                return b;
            }
        }
        return null;
    }

    // obtener comandantes únicos ordenados de una batalla
    public List<Comandante> obtenerComandantesOrdenados(String idBatalla) {
        Batalla b = buscarBatalla(idBatalla);
        if (b == null) {
            return new ArrayList<>();
        }

        // únicos
        Set<Comandante> set = new HashSet<>(b.getComandantes()); //ojo
        List<Comandante> lista = new ArrayList<>(set);

        // primero por casa (orden natural), luego por nombre
        lista.sort(Comparator.naturalOrder()); // por casa (Collections.sort(lista))
        lista.sort(new Orden_nombre().thenComparing(Comandante::getCasa)); // o solo por nombre si querían eso (Collections.sort(lista, ordenedad))

        // si quieres exactamente: primero casa, luego nombre:
        lista.sort(Comparator.comparing(Comandante::getCasa)
                .thenComparing(Comandante::getNombre));

        return lista;
    }

    // obtener batallas ordenadas de menos a más sangrientas
    public List<Batalla> obtenerBatallasMenosSangrientas() {
        List<Batalla> lista = new ArrayList<>(batallas);
        Collections.sort(lista); // usa compareTo por bajas
        return lista;
    }
}

