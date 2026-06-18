package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.CONTROLLER;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.EXCEPTIONS.EmailExisteException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.MODELO.Publicacion;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.REPOSITORIO.RepoSocial;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.MODELO.Usuario;

public class Gestiona {
    public static void main(String[] args) {

        //Usuarios
        Usuario u1 = new Usuario("Elena", "elenapabe@gmail.com", 20);
        Usuario u2 = new Usuario("Rena", "renapabe@gmail.com", 24);
        Usuario u3 = new Usuario("Ali", "alioli@gmail.com", 16);
        Usuario u4 = new Usuario("Yina", "yinasan@gmail.com", 14);

        //Publicaciones
        Publicacion p1 = new Publicacion("No se que poner", 4);
        Publicacion p2 = new Publicacion("Descontrol de vida", 302);
        Publicacion p3 = new Publicacion("No me gusta programar", 32458);
        Publicacion p4 = new Publicacion("No se que poner tampoco ", 4);

        //Repositorio
        RepoSocial repo = new RepoSocial();

        //MÉTODOS

        //registrar usuarios
        try{
            repo.registrarUsuario(u1);
            repo.registrarUsuario(u2);
            repo.registrarUsuario(u3);
            repo.registrarUsuario(u4);
            repo.registrarUsuario(new Usuario("Copia", "elenapabe@gmail.com", 20));
        } catch (EmailExisteException e){
            System.out.println(e);
        }

        //publicar
        repo.publicar(u1,p1);
        repo.publicar(u1, p2);
        repo.publicar(u2, p3);
        repo.publicar(u3, p4);

        // Dar likes
        repo.darLike(u1, p1);
        repo.darLike(u1, p2);
        repo.darLike(u2, p3);

        // Usuario con más publicaciones
        System.out.println("\n--- USUARIO CON MÁS PUBLICACIONES ---");
        System.out.println(repo.mostrarUserMasPopular());

        // Ranking por likes
        System.out.println("\n--- RANKING POR LIKES ---");
        for (Usuario u : repo.mostrarRankingUsuarios()) {
            System.out.println(u.getNombre() + " → " + repo.totalLikes(u) + " likes");
        }

        // Publicaciones de u1 ordenadas por likes
        System.out.println("\n--- PUBLICACIONES DE " + u1.getNombre() + " ---");
        for (Publicacion p : repo.listarPublicaciones(u1)) {
            System.out.println(p);
        }
    }
}
