package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro3;

public class GestionaTalleres {

    public static void main(String[] args) {

        RepositorioTalleres repo = new RepositorioTalleres();

        // Crear talleres
        Taller t1 = new Taller("Pintura Creativa", 6, 3);
        Taller t2 = new Taller("Robótica Infantil", 8, 2);

        repo.agregarTaller(t1);
        repo.agregarTaller(t2);

        // Crear alumnos
        Alumno a1 = new Alumno("Lucía Gómez", 7, "600111222");
        Alumno a2 = new Alumno("Mario Ruiz", 9, "600333444");
        Alumno a3 = new Alumno("Ana Torres", 5, "600555666");
        Alumno a4 = new Alumno("Carlos Pérez", 10, "600777888");

        // Inscripciones correctas
        try {
            repo.inscribirAlumno("Pintura Creativa", a1);
            repo.inscribirAlumno("Pintura Creativa", a2);
        } catch (TallerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Inscripción con error (edad insuficiente)
        try {
            repo.inscribirAlumno("Pintura Creativa", a3);
        } catch (TallerException e) {
            System.out.println("[OK] Error esperado: " + e.getMessage());
        }

        // Inscripción en otro taller
        try {
            repo.inscribirAlumno("Robótica Infantil", a2);
            repo.inscribirAlumno("Robótica Infantil", a4);
        } catch (TallerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Taller lleno
        try {
            repo.inscribirAlumno("Robótica Infantil", a1);
        } catch (TallerException e) {
            System.out.println("[OK] Taller lleno: " + e.getMessage());
        }

        // Mostrar alumnos de un taller
        try {
            System.out.println("\nAlumnos en Pintura Creativa:");
            repo.getAlumnosDeTaller("Pintura Creativa").forEach(System.out::println);
        } catch (TallerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Talleres ordenados por número de alumnos
        System.out.println("\nTalleres ordenados por número de alumnos:");
        repo.getTalleresOrdenadosPorNumeroAlumnos().forEach(System.out::println);

        // Alumnos mayores de una edad
        try {
            System.out.println("\nAlumnos mayores de 8 en Robótica Infantil:");
            repo.getAlumnosMayoresDe("Robótica Infantil", 8).forEach(System.out::println);
        } catch (TallerException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

