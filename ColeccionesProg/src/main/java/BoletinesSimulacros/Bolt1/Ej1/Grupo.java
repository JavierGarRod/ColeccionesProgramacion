package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej1;

import java.util.ArrayList;

public class Grupo {
    private String id;
    private String descripcion;
    private String tutor;
    private String aula;
    private ArrayList<Estudiante> estudiantes;
    private Horario horario;

    public Grupo(String id, String descripcion, String tutor, String aula) {
        this.id = id;
        this.descripcion = descripcion;
        this.tutor = tutor;
        this.aula = aula;
        this.estudiantes = new ArrayList<>();
        this.horario = new Horario();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public Estudiante buscarEstudiante(String id) {
        for (Estudiante e : estudiantes)
            if (e.getId().equalsIgnoreCase(id))
                return e;
        return null;
    }

    public double promedioGrupo() {
        if (estudiantes.size() == 0) return 0;
        double suma = 0;
        for (Estudiante e : estudiantes) suma += e.promedio();
        return suma / estudiantes.size();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String toString() {
        return "Grupo: " + descripcion + " Tutor: " + tutor + " Estudiantes: " + estudiantes.size();
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}

