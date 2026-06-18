package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro7;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class RepositorioActividades {

    // HashSet evita duplicados y es eficiente
    private Set<Actividad> actividades;

    public RepositorioActividades() {
        actividades = new HashSet<>();
    }

    public void agregarActividad(Actividad a) {
        actividades.add(a);
    }

    private Actividad buscarActividad(String nombre, LocalDate fecha) throws GuarderiaException {
        return actividades.stream()
                .filter(a -> a.getNombre().equalsIgnoreCase(nombre)
                        && a.getFecha().equals(fecha))
                .findFirst()
                .orElseThrow(() -> new GuarderiaException("Actividad no encontrada"));
    }

    // 1. Agregar alumno a actividad
    public void agregarAlumnoActividad(String nombre, LocalDate fecha, Alumno a)
            throws GuarderiaException {

        Actividad act = buscarActividad(nombre, fecha);

        if (a.getEdad() != act.getEdadRecomendada()) {
            throw new GuarderiaException("Edad no adecuada");
        }

        if (act.getAlumnos().size() >= act.getMaxAlumnos()) {
            throw new GuarderiaException("No hay plazas disponibles");
        }

        if (act.getAlumnos().contains(a)) {
            throw new GuarderiaException("Alumno ya inscrito");
        }

        act.agregarAlumno(a);
    }

    // 2. Saber si un alumno está apuntado
    public boolean isAlumnoApuntado(String nombre, LocalDate fecha, Alumno a)
            throws GuarderiaException {

        Actividad act = buscarActividad(nombre, fecha);
        return act.getAlumnos().contains(a);
    }

    // 3. Obtener alumnado con alergias
    public List<Alumno> getAlumnadoConAlergias(String nombre, LocalDate fecha)
            throws GuarderiaException {

        Actividad act = buscarActividad(nombre, fecha);

        return act.getAlumnos().stream()
                .filter(al -> !al.getAlergias().isEmpty())
                .collect(Collectors.toList());
    }

    // 4. Lista de actividades ordenadas por fecha
    public List<Actividad> getListaActividades() {
        return actividades.stream()
                .sorted(Comparator.comparing(Actividad::getFecha))
                .collect(Collectors.toList());
    }
}

