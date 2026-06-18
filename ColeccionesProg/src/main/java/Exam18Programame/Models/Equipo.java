package Exam18Programame.Models;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombreEquipo;
    private String nombreCentro;
    private String idEquipo;
    private List<String> integrantes;

    public Equipo(String nombreEquipo, String nombreCentro, List<String> integrantes) {
        this.nombreEquipo = nombreEquipo;
        this.nombreCentro = nombreCentro;
        this.idEquipo = nombreCentro+"-"+nombreEquipo;
        this.integrantes = new ArrayList<>();
    }

    public Equipo(String idEquipo) {
        this.idEquipo = nombreEquipo.concat(nombreCentro);
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public List<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<String> integrantes) {
        this.integrantes = integrantes;
    }
}
