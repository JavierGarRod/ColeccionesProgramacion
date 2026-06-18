package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.CONTROLLER;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.EXCEPTIONS.AlumnoYaMatriculadoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.EXCEPTIONS.ClaseLlenaException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL.Alumno;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL.Clase;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL.Nivel;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL.Profesor;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.REPOSITORY.repoClase;

import java.time.LocalDate;
import java.util.HashSet;

public class Gestiona {
    public static void main(String[] args) {

        // Profesores
        Profesor p1 = new Profesor("Luccas", "Terreo Crumus", "12345678Q", "696153160","inglés",12);
        Profesor p2 = new Profesor("Leo", "Crauis", "12345648Q", "693153160","español",1);
        Profesor p3 = new Profesor("Teodoro", "Centeno Ulises", "12325678Q", "696153150","inglés",10);
        Profesor p4 = new Profesor("Teodoro", "Centeno Ulises", "12325678Q", "696153150","inglés",20);
        Profesor p5 = new Profesor("Leonardo", "Fali", "22325678Q", "645153150","español",2);

        HashSet<Profesor> profesores = new HashSet<>();
        profesores.add(p1);
        profesores.add(p2);
        profesores.add(p3);
        profesores.add(p4);
        profesores.add(p5);

        // Alumnos
        Alumno a1 = new Alumno("Alice", "Return", "12345678R", "696153180", Nivel.AVANZADO, LocalDate.now());
        Alumno a2 = new Alumno("Alice", "Return", "12345678R", "696153180", Nivel.AVANZADO, LocalDate.now());
        Alumno a3 = new Alumno("Rena", "Costuin Rae", "12342378R", "696343180", Nivel.INICIAL, LocalDate.of(2020,12,3));
        Alumno a4 = new Alumno("Anne", "Tania Reah", "12388678R", "696221180", Nivel.INTERMEDIO, LocalDate.now());
        Alumno a5 = new Alumno("Reah", "Sonia Pablo", "32399678R", "126233180", Nivel.INTERMEDIO, LocalDate.now());

        HashSet<Alumno> alumnos = new HashSet<>();
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);

        // Clases (cada clase debe tener su propia lista de alumnos vacía)
        Clase c1 = new Clase("inglés", p1);
        Clase c2 = new Clase("español", p2);
        Clase c3 = new Clase("inglés", p3);
        Clase c4 = new Clase("inglés", p4);
        Clase c5 = new Clase("español", p5);

        HashSet<Clase> clases = new HashSet<>();
        clases.add(c1);
        clases.add(c2);
        clases.add(c3);
        clases.add(c4);

        // Repositorio
        repoClase repo = new repoClase(clases, profesores, alumnos);

        // PRUEBAS DEL EJERCICIO

        try {
            repo.matricular_alumno_en_clase(a5, c1);
        } catch (ClaseLlenaException | AlumnoYaMatriculadoException e) {
            System.out.println(e.getMessage());
        }

        repo.crear_clase_y_asignar_profe(c5, p5);

        System.out.println("Clases donde está a5:");
        System.out.println(repo.buscar_alumno_clases("32399678R"));

        repo.eliminar_alumno_de_clase(a2);

        repo.registrar_profesor(new Profesor("Lion", "Magnus Cuae", "22345678Q", "645553150","español",3));
    }
}
