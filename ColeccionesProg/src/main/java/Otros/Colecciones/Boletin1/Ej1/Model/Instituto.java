package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej1.Model;

import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin1.Ej1.Exception.GrupoNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    // ATRIBUTOS

    private List<Grupo> grupos;


    // CONSTRUCTOR

    public Instituto() {
        grupos = new ArrayList<>();
    }


    // MÉTODOS

    public void agregarGrupo(Grupo g) {
        grupos.add(g);
    }

    public Grupo buscarGrupo(String descripcion) throws GrupoNoEncontradoException {
        for (Grupo g : grupos) {
            if (g.getDescripcion().equalsIgnoreCase(descripcion))
                return g;
        }
        throw new GrupoNoEncontradoException("No existe un grupo con esa descripción.");
    }

    public void muestroInformacionEstudiantePorGrupo(){
        for(Grupo g:this.grupos){
            g.muestraGrupoYEstudiante();
        }
    }


    // GETTERS Y SETTERS


    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}
