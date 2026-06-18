package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro6;

import java.util.ArrayList;
import java.util.List;

public class CentroLogistico {

    private int idCentro;
    private String nombre;
    private String ciudad;
    private int numComedores;
    private List<Trabajador> trabajadores;

    public CentroLogistico(int idCentro, String nombre, String ciudad, int numComedores) {
        this.idCentro = idCentro;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numComedores = numComedores;
        this.trabajadores = new ArrayList<>();
    }

    public int getIdCentro() {
        return idCentro;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void agregarTrabajador(Trabajador t) {
        trabajadores.add(t);
    }

    @Override
    public String toString() {
        return "Centro " + idCentro + ": " + nombre + " (" + ciudad + "), Comedores=" + numComedores +
                ", Trabajadores=" + trabajadores.size();
    }
}

