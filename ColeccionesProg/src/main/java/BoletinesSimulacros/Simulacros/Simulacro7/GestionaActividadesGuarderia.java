package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro7;

import java.time.LocalDate;
import java.util.List;

public class GestionaActividadesGuarderia {

    public static void main(String[] args) {

        RepositorioActividades repo = new RepositorioActividades();

        Maestro m1 = new Maestro("Laura", "Gómez", "111A", "A1");

        Actividad a1 = new Actividad("Pintura", Lugar.AULA,
                LocalDate.of(2026, 6, 20), 5, 2, m1);

        repo.agregarActividad(a1);

        Alumno al1 = new Alumno("Lucía", "Pérez", 5, "600111222",
                List.of("gluten"), true, m1);

        Alumno al2 = new Alumno("Mario", "López", 5, "600333444",
                List.of(), true, m1);

        try {
            repo.agregarAlumnoActividad("Pintura", LocalDate.of(2026, 6, 20), al1);
            repo.agregarAlumnoActividad("Pintura", LocalDate.of(2026, 6, 20), al2);

            System.out.println("Alumnos inscritos:");
            repo.getAlumnadoConAlergias("Pintura", LocalDate.of(2026, 6, 20))
                    .forEach(System.out::println);

        } catch (GuarderiaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

