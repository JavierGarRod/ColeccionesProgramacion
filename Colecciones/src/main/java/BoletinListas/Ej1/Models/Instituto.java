package BoletinListas.Ej1.Models;

import java.util.ArrayList;

public class Instituto {
    private ArrayList<Grupo> grupos; // Lista de todos los grupos del instituto

    // Constructor: inicializa la lista vacía
    public Instituto() {
        grupos = new ArrayList<>();
    }

    // Agrega un grupo al instituto
    public void agregarGrupo(Grupo g) {
        grupos.add(g);
    }

    // Busca un grupo por su descripción (ignorando mayúsculas/minúsculas)
    public Grupo buscarGrupo(String descripcion) {
        for (Grupo g : grupos)
            if (g.getDescripcion().equalsIgnoreCase(descripcion))
                return g;
        return null;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }
}