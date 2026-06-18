package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.REPOSITORIO;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.EXCEPTIONS.EmailExisteException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.MODELO.OrdenPorLikesDesc;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.MODELO.OrdenPorLikesUser;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.MODELO.Publicacion;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.MODELO.Usuario;

import java.util.*;

public class RepoSocial {

    //atributos
    Map<String, Usuario> usuarios;
    Map<Usuario, List<Publicacion>> publicaciones;

    //constructor
    public RepoSocial() {
        this.usuarios = new HashMap<>();
        this.publicaciones = new HashMap<>();
    }

    //métodos
    public void registrarUsuario(Usuario usuario) throws EmailExisteException {
        if (usuarios.containsKey(usuario.getEmail())){
            throw new EmailExisteException("El email ya existe");
        }
        usuarios.put(usuario.getEmail(), usuario);
    }

    public void publicar(Usuario u, Publicacion p){
        if(!publicaciones.containsKey(u)){
            publicaciones.put(u,new ArrayList<>());
        }
        publicaciones.get(u).add(p);
    }

    public void darLike(Usuario usuario,Publicacion publicacion){
        List<Publicacion> lista = publicaciones.get(usuario);
        for(Publicacion pu: lista){
            if(pu.getId() == publicacion.getId()){
                pu.setLikes(pu.getLikes()+1);
            }
        }

        /*
        ESTO ES POR SI EL USUARIO NO ES ESPECÍFICO
        for(List<Publicacion> p: publicaciones.values()){
            for(Publicacion pu: p){
                if(pu.getId() == publicacion.getId()){
                    pu.setLikes(pu.getLikes()+1);
                }
            }
        } */
    }

    public Usuario mostrarUserMasPopular(){
        Usuario masPopular = null;
        int max = 0;
        for(Map.Entry<Usuario, List<Publicacion>> entry : publicaciones.entrySet()){
            if(entry.getValue().size() > max){
                max = entry.getValue().size();
                masPopular = entry.getKey();
            }
        }
        return masPopular;
    }

    public int totalLikes(Usuario usuario){
        int total = 0;
        List<Publicacion> publicacionList = publicaciones.get(usuario); //esto toma la lista original
        for(Publicacion pu: publicacionList){
            total = total + pu.getLikes();
        }
        return total;
    }

    public List<Usuario> mostrarRankingUsuarios(){
        List<Usuario> usuarios1 = new ArrayList<>(publicaciones.keySet());
        Collections.sort(usuarios1, new OrdenPorLikesUser(this));
        return usuarios1;

        /*
        LAS DOS FORMAS ESTÁN BIEN
        List<Usuario> usuarios1 = new ArrayList<>();
        for(Usuario u: publicaciones.keySet()){
            usuarios1.add(u);
        }
        Collections.sort(usuarios1, new OrdenPorLikes(this));
        return usuarios1; */
    }

    public List<Publicacion> listarPublicaciones (Usuario usuario){
        List<Publicacion> publicacionList = new ArrayList<>(publicaciones.get(usuario));  //esto hace una lista nueva con los valores de la original
        Collections.sort(publicacionList, new OrdenPorLikesDesc());
        return publicacionList;
    }
}
