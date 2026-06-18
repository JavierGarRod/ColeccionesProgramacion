package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej2.Models;

import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin1.Ej1.Model.Estudiante;
import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin1.Ej2.Exception.DeportivosException;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private List<Alumno> alumnos;

    public Equipo(String nombreEquipo, List<Alumno> alumnos) {
        this.nombreEquipo = nombreEquipo;
        this.alumnos = alumnos;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno a) {
        if(alumnos.contains(a)){
            throw new DeportivosException("Ya esta agregado xoxo");
        }
        else{
            alumnos.add(a);
        }
    }

    public void borrarAlumno(Alumno a){
        if(!alumnos.contains(a)){
            throw new DeportivosException("No existe alumno");
        }
        else{
            alumnos.remove(a);
        }
    }

    public Alumno buscarAlumno(Alumno a){
        boolean encontrado=false;
        Alumno aSalida = null;
        int posicion=0;

        if(alumnos.contains(a)){
            posicion = alumnos.indexOf(a);
            aSalida = alumnos.get(posicion);
        }
        return aSalida;
    }

    public void mostrarAlumno(){
        for(int i=0;i<this.alumnos.size();i++){
            System.out.println(this.nombreEquipo+" - "+this.alumnos.get(i).toString());
        }
    }

    public Equipo union(Equipo e){
        return e;
    }

    public Equipo interseccion(Equipo e){
        return e;
    }
}
