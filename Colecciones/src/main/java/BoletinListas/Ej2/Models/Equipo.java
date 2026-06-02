package Colecciones.src.main.java.BoletinListas.Ej2.Models;

import Colecciones.src.main.java.BoletinListas.Ej2.Exception.DeportivosException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
    private String nombre;
    List<Alumno> alumnos;

    public Equipo(String nombre, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<Alumno>();
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.alumnos=new ArrayList<Alumno>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public void añadirAlumno(Alumno a) throws DeportivosException{
        if(alumnos.contains(a)){
            throw new DeportivosException("Ese alumno ya ha sido aceptado en este grupo");
        }

        alumnos.add(a);
    }

    public void borrarAlumno(Alumno a) throws DeportivosException{
        if(alumnos.contains(a)){
            alumnos.remove(a);
        }
        throw new DeportivosException("Ese alumno no existe en este grupo");
    }

    public Alumno buscarAlumno(Alumno a){
        if(alumnos.contains(a)){
            return a;
        }
        return null;
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        for (Alumno a : alumnos) {
            System.out.println(" - " + a);
        }
    }

    public Equipo unionEquipo(Equipo otro) {
        Equipo resultado = new Equipo(this.nombre + "+" + otro.nombre);

        // Añadir todos los alumnos del primer equipo
        for (Alumno a : this.alumnos) {
            resultado.alumnos.add(a);
        }

        // Añadir los del segundo evitando duplicados
        for (Alumno a : otro.alumnos) {
            if (!resultado.alumnos.contains(a)) {
                resultado.alumnos.add(a);
            }
        }

        return resultado;
    }

    public Equipo interseccionEquipo(Equipo otro) {
        Equipo resultado = new Equipo(this.nombre + "∩" + otro.nombre);

        for (Alumno a : this.alumnos) {
            if (otro.alumnos.contains(a)) {
                resultado.alumnos.add(a);
            }
        }

        return resultado;
    }
}
