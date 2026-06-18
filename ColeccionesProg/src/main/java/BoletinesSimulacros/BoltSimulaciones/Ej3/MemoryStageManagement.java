package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej3;

public class MemoryStageManagement {

    public static void main(String[] args) {

        MemoryStorage ms = new MemoryStorage();

        try {
            User u1 = new User("Carlos", "Abc12345");
            User u2 = new User("Maria", "Clave123A");

            ms.addUser(u1);
            ms.addUser(u2);

            Tweet t = new Tweet("Hola soy Carlos", u1);
            Post p = new Post("Este es mi primer post", u1);
            Recomendacion r = new Recomendacion("A".repeat(120), u2);

            ms.addMessage(t);
            ms.addMessage(p);
            ms.addMessage(r);

            t.valorar(Valoracion.SUPERBUENA);
            p.valorar(Valoracion.REGULAR);

            System.out.println("Mensajes de Carlos:");
            ms.mostrarMensajesUsuario("Carlos");

            System.out.println("Solo tweets de Carlos:");
            ms.mostrarMensajesUsuario("Carlos", EstadoMensaje.TWEET);

        } catch (UserMemoryException e) {
            System.out.println(e.getMessage());
        }
    }
}
