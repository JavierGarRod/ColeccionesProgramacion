package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej3;

import java.util.ArrayList;
import java.util.TreeSet;

public class MemoryStorage {

    private TreeSet<User> usuarios;
    private ArrayList<Message> mensajes;

    public MemoryStorage() {
        usuarios = new TreeSet<>();
        mensajes = new ArrayList<>();
    }

    public void addUser(User u) {
        usuarios.add(u);
    }

    public User buscarUsuario(String nombre) {
        for (User u : usuarios) {
            if (u.getNombre().equals(nombre))
                return u;
        }
        return null;
    }

    public void addMessage(Message m) {
        mensajes.add(m);
    }

    public void mostrarMensajesUsuario(String nombre) {
        for (Message m : mensajes) {
            if (m.getAutor().getNombre().equals(nombre)) {
                System.out.println(m);
            }
        }
    }

    public void mostrarMensajesUsuario(String nombre, EstadoMensaje tipo) {
        for (Message m : mensajes) {
            if (m.getAutor().getNombre().equals(nombre)) {

                if (tipo == EstadoMensaje.TWEET && m instanceof Tweet)
                    System.out.println(m);

                if (tipo == EstadoMensaje.POST && m instanceof Post)
                    System.out.println(m);

                if (tipo == EstadoMensaje.RECOMENDACION && m instanceof Recomendacion)
                    System.out.println(m);
            }
        }
    }
}
