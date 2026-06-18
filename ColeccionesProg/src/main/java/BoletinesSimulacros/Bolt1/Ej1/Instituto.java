package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej1;

import java.util.ArrayList;

public class Instituto {
    private ArrayList<Grupo> grupos;

    public Instituto() {
        grupos = new ArrayList<>();
    }

    public void agregarGrupo(Grupo g) {
        grupos.add(g);
    }

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

