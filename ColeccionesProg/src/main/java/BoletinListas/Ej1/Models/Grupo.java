package BoletinListas.Ej1.Models;

import java.util.ArrayList;

public class Grupo {
    private String id; // Identificador del grupo (por ejemplo: 1DAM-A)
    private String descripcion; // Descripción del grupo
    private String tutor; // Nombre del tutor del grupo
    private String aula; // Aula donde se imparte clase
    private Horario horario; // Horario del grupo
    private ArrayList<Estudiante> estudiantes; // Lista de estudiantes del grupo

    // Constructor: inicializa todos los datos del grupo
    public Grupo(String id, String descripcion, String tutor, String aula) {
        this.id = id;
        this.descripcion = descripcion;
        this.tutor = tutor;
        this.aula = aula;
        this.horario = new Horario();
        this.estudiantes = new ArrayList<>();
    }

    public String getDescripcion() { return descripcion; }
    public ArrayList<Estudiante> getEstudiantes() { return estudiantes; }

    // Agrega un estudiante al grupo
    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    // Busca un estudiante por su ID (ignorando mayúsculas/minúsculas)
    public Estudiante buscarEstudiante(String id) {
        for (Estudiante e : estudiantes)
            if (e.getId().equalsIgnoreCase(id))
                return e;
        return null;
    }

    // Calcula el promedio del grupo (promedio de los promedios)
    public double promedioGrupo() {
        if (estudiantes.isEmpty()) return 0;
        double suma = 0;
        for (Estudiante e : estudiantes)
            suma += e.promedio();
        return suma / estudiantes.size();
    }

    // Muestra información básica del grupo
    public void mostrarBasico() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Tutor: " + tutor);
        System.out.println("Número de estudiantes: " + estudiantes.size());
    }
}