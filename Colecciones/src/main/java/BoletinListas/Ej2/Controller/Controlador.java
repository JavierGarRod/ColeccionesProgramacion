package Colecciones.src.main.java.BoletinListas.Ej2.Controller;

import Colecciones.src.main.java.BoletinListas.Ej2.Exception.DeportivosException;
import Colecciones.src.main.java.BoletinListas.Ej2.Models.Alumno;
import Colecciones.src.main.java.BoletinListas.Ej2.Models.Equipo;

public class Controlador {

    public static void main(String[] args) {

        // Crear alumnos
        Alumno a1 = new Alumno("Ana", "111A");
        Alumno a2 = new Alumno("Luis", "222B");
        Alumno a3 = new Alumno("Marta", "333C");
        Alumno a4 = new Alumno("Pedro", "444D");
        Alumno a5 = new Alumno("Lucía", "555E");

        // Crear equipos
        Equipo equipo1 = new Equipo("Rojo");
        Equipo equipo2 = new Equipo("Azul");

        // Añadir alumnos al equipo 1
        try {
            equipo1.añadirAlumno(a1);
            equipo1.añadirAlumno(a2);
            equipo1.añadirAlumno(a3);
        } catch (DeportivosException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Añadir alumnos al equipo 2
        try {
            equipo2.añadirAlumno(a3); // repetido en ambos equipos
            equipo2.añadirAlumno(a4);
            equipo2.añadirAlumno(a5);
        } catch (DeportivosException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Mostrar equipos
        System.out.println("\n--- EQUIPO 1 ---");
        equipo1.mostrarEquipo();

        System.out.println("\n--- EQUIPO 2 ---");
        equipo2.mostrarEquipo();

        // Probar borrar alumno
        System.out.println("\nIntentando borrar a Luis del equipo 1...");
        try {
            equipo1.borrarAlumno(a2);
            System.out.println("Luis borrado correctamente.");
        } catch (DeportivosException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Probar borrar alumno que NO está
        System.out.println("\nIntentando borrar a Pedro del equipo 1...");
        try {
            equipo1.borrarAlumno(a4);
        } catch (DeportivosException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Unión
        System.out.println("\n--- UNIÓN DE EQUIPOS ---");
        Equipo union = equipo1.unionEquipo(equipo2);
        union.mostrarEquipo();

        // Intersección
        System.out.println("\n--- INTERSECCIÓN DE EQUIPOS ---");
        Equipo inter = equipo1.interseccionEquipo(equipo2);
        inter.mostrarEquipo();
    }
}
