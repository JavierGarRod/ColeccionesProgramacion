package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej2;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Alumno> alumnos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Equipo) {
            Equipo e = (Equipo) o;
            return this.nombre.equalsIgnoreCase(e.nombre);
        }
        return false;
    }

    public void añadirAlumno(Alumno a) throws DeportivosException {
        if (alumnos.contains(a)) {
            throw new DeportivosException("El alumno ya está en el equipo");
        }
        alumnos.add(a);
    }

    public void borrarAlumno(Alumno a) throws DeportivosException {
        if (!alumnos.contains(a)) {
            throw new DeportivosException("El alumno no está en el equipo");
        }
        alumnos.remove(a);
    }

    public Alumno buscarAlumno(Alumno a) {
        for (Alumno al : alumnos) {
            if (al.equals(a)) {
                return al;
            }
        }
        return null;
    }

    public void mostrar() {
        System.out.println("Equipo: " + nombre);
        for (Alumno a : alumnos) {
            System.out.println(" - " + a);
        }
    }

    public Equipo union(Equipo otro) {
        Equipo nuevo = new Equipo(this.nombre + "+" + otro.nombre);

        for (Alumno a : this.alumnos) {
            nuevo.alumnos.add(a);
        }

        for (Alumno a : otro.alumnos) {
            if (!nuevo.alumnos.contains(a)) {
                nuevo.alumnos.add(a);
            }
        }

        return nuevo;
    }

    public Equipo interseccion(Equipo otro) {
        Equipo nuevo = new Equipo(this.nombre + "n" + otro.nombre);

        for (Alumno a : this.alumnos) {
            if (otro.alumnos.contains(a)) {
                nuevo.alumnos.add(a);
            }
        }

        return nuevo;
    }
}
