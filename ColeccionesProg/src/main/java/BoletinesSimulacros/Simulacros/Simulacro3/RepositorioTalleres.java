package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro3;

import java.util.*;
import java.util.stream.Collectors;

public class RepositorioTalleres {

    private Map<String, Taller> talleres;

    public RepositorioTalleres() {
        talleres = new HashMap<>();
    }

    public void agregarTaller(Taller t) {
        talleres.put(t.getNombre(), t);
    }

    public Taller getTallerPorNombre(String nombre) throws TallerException {
        Taller t = talleres.get(nombre);
        if (t == null) {
            throw new TallerException("No existe el taller: " + nombre);
        }
        return t;
    }

    public void inscribirAlumno(String nombreTaller, Alumno a) throws TallerException {

        Taller t = getTallerPorNombre(nombreTaller);

        if (a.getEdad() < t.getEdadMinima()) {
            throw new TallerException("El alumno no cumple la edad mínima");
        }

        if (t.getAlumnos().size() >= t.getAforoMaximo()) {
            throw new TallerException("No hay plazas disponibles");
        }

        if (t.getAlumnos().contains(a)) {
            throw new TallerException("El alumno ya está inscrito en este taller");
        }

        t.agregarAlumno(a);
    }

    public List<Alumno> getAlumnosDeTaller(String nombreTaller) throws TallerException {
        return getTallerPorNombre(nombreTaller).getAlumnos();
    }

    public List<Taller> getTalleresOrdenadosPorNumeroAlumnos() {
        return talleres.values().stream()
                .sorted(Comparator.comparingInt(t -> t.getAlumnos().size()))
                .collect(Collectors.toList());
    }

    public List<Alumno> getAlumnosMayoresDe(String nombreTaller, int edad) throws TallerException {
        return getTallerPorNombre(nombreTaller).getAlumnos().stream()
                .filter(a -> a.getEdad() > edad)
                .collect(Collectors.toList());
    }
}

