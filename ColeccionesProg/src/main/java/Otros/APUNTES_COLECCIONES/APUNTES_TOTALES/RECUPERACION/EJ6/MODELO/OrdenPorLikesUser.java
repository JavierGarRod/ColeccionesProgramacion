package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.MODELO;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ6.REPOSITORIO.RepoSocial;

import java.util.Comparator;

public class OrdenPorLikesUser implements Comparator<Usuario> {
    //Tengo que implementar Comparator porque quiero ordenar una clase con los datos de otra (likes publicacion de user concreto)
    //Además tengo que usar el método de la repo

    //atributos
    private RepoSocial repo;

    //constructor
    public OrdenPorLikesUser(RepoSocial repo) {
        this.repo = repo;
    }

    //uso el método del repositorio
    @Override
    public int compare(Usuario u1, Usuario u2) {
        return Integer.compare(repo.totalLikes(u2), repo.totalLikes(u1)); // descendente
    }
}
