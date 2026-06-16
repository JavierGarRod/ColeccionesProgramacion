package ExamRecuSonorama.Repository;

import ExamRecuSonorama.Exception.MiException;
import ExamRecuSonorama.Models.Actuacion;
import ExamRecuSonorama.Models.Escenario;
import ExamRecuSonorama.Models.OrdenActuacion;

import java.util.*;

public class RepositorioSonorama {

    //atributos
    HashMap<Escenario, HashSet<Actuacion>> actuaciones;

    /*Elegí el HashMap porque se ordena com comparable o comparator y distingue duplicados con el equals y hashcode, permite insertar, eliminar y buscar rápidamente y no permite duplicados
    * Además, creé una lista HashSet porque no permite duplicados para cada escenario, se ordena con comparable o comparator, diferencia iguales con equals y hashcode y es rápido
    * en búsquedas y modificaciones como eliminaciones e insercciones */

    //constructor
    public RepositorioSonorama() {
        this.actuaciones = new HashMap<>();
    }

    //métodos

    public void registrarEscenario(Escenario escenario) throws MiException {
        if (actuaciones.containsKey(escenario)) {
            throw new MiException("El escenario ya está registrado");
        }
        actuaciones.put(escenario, new HashSet<>());
    }

    //APARTADO 2

    public boolean validarRegistroEscenario(String nombre){
       boolean existe = false;
        List<Escenario> escenarios1 = new ArrayList<>(actuaciones.keySet());
        for(Escenario e: escenarios1){
            if(e.getNombreEscenario().equalsIgnoreCase(nombre)){
                existe = true;
            }
        }
        return existe;
    }

    //APARTADO 3

    public void asignarActuacionAEscenario(String nombre, String musica, int afor, Actuacion actuacion) throws MiException {
        boolean encontrado = false;

        for (Escenario e : actuaciones.keySet()) {
            if (e.getNombreEscenario().equalsIgnoreCase(nombre)) {
                encontrado = true;
                if (actuaciones.get(e).contains(actuacion)) {
                    throw new MiException("Ya está asignada esta actuación al escenario");
                }
                actuaciones.get(e).add(actuacion);
            }
        }
        if (!encontrado) {
            HashSet<Actuacion> nuevasActuaciones = new HashSet<>();
            nuevasActuaciones.add(actuacion);
            actuaciones.put(new Escenario(nombre, musica, afor), nuevasActuaciones);
        }
    }

    //APARTADO 4

    public List<Actuacion> mostrarActuacionesEscenario(Escenario escenario) throws MiException{
        if(!actuaciones.containsKey(escenario)){
         throw new MiException("El escenario no está registrado en el sistema");
        }
        List<Actuacion> actuacionList = new ArrayList<>(actuaciones.get(escenario));
        Collections.sort(actuacionList, new OrdenActuacion());
        return actuacionList;
    }

    //APARTADO 5

    public int contarNumActuacionesPorEscenario(Escenario escenario) {
        return actuaciones.get(escenario).size();
    }

    public Map<String, Integer> obtenerNumeroActuacionesPorTipoMusica() {
        Map<String, Integer> resultado = new HashMap<>();
        if (actuaciones.isEmpty()) {
            return resultado;
        }
        for (Escenario e : actuaciones.keySet()) {
            resultado.put(e.getTipoMusica(), contarNumActuacionesPorEscenario(e));
        }
        return resultado;
    }

}
