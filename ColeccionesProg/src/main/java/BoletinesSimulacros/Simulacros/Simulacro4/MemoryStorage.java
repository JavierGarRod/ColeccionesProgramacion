package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro4;

import java.util.*;

public class MemoryStorage {

    private TreeSet<Usuario> usuarios;
    private Map<Integer, Mensaje> mensajes;
    private int contadorMensajes;

    public MemoryStorage() {
        usuarios = new TreeSet<>();
        mensajes = new HashMap<>();
        contadorMensajes = 1;
    }

    public void agregarUsuario(Usuario u) throws UserMemoryException {
        if (!usuarios.add(u)) {
            throw new UserMemoryException("Usuario ya existe");
        }
    }

    public void agregarMensaje(String nombreUsuario, String contenido, String tipo)
            throws UserMemoryException {

        Usuario u = usuarios.stream()
                .filter(x -> x.getNombre().equalsIgnoreCase(nombreUsuario))
                .findFirst()
                .orElseThrow(() -> new UserMemoryException("Usuario no existe"));

        Mensaje m;

        switch (tipo.toLowerCase()) {
            case "tweet":
                m = new Tweet(contadorMensajes++, contenido, u);
                break;
            case "post":
                m = new Post(contadorMensajes++, contenido, u);
                break;
            case "recomendacion":
                m = new Recomendacion(contadorMensajes++, contenido, u);
                break;
            default:
                throw new UserMemoryException("Tipo de mensaje no válido");
        }

        mensajes.put(m.getId(), m);
    }

    public void valorarMensaje(int idMensaje, Usuario usuario, ValoracionTipo tipo)
            throws UserMemoryException {

        Mensaje m = mensajes.get(idMensaje);
        if (m == null) {
            throw new UserMemoryException("Mensaje no existe");
        }

        if (!usuarios.contains(usuario)) {
            throw new UserMemoryException("Usuario no existe");
        }

        m.addValoracion(new Valoracion(usuario, tipo));
    }

    public List<Mensaje> obtenerMensajesDeUsuario(String nombre) {
        return mensajes.values().stream()
                .filter(m -> m.getUsuario().getNombre().equalsIgnoreCase(nombre))
                .toList();
    }

    public List<Mensaje> obtenerMensajesDeUsuarioPorTipo(String nombre, String tipo) {
        return mensajes.values().stream()
                .filter(m -> m.getUsuario().getNombre().equalsIgnoreCase(nombre))
                .filter(m -> m.getClass().getSimpleName().equalsIgnoreCase(tipo))
                .toList();
    }

    public List<Mensaje> obtenerMensajesOrdenadosPorValoracion() {
        List<Mensaje> lista = new ArrayList<>(mensajes.values());
        lista.sort(new ComparadorMensajes());
        return lista;
    }
}

