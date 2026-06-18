package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Notas;

public class GestionoNotasAlumnos {
    public static void main(String[] args) {
        NotaAsignatura progLucia = new NotaAsignatura("Programación", 5, 7, 7);
        NotaAsignatura bdLucia = new NotaAsignatura("Bases de Datos", 6, 6, 7);
        Alumno lucia = new Alumno("Lucía", "lucia@email.com");

        lucia.programacion = progLucia;
        lucia.baseDatos = bdLucia;

        // ===== ANDRÉS =====
        NotaAsignatura progAndres = new NotaAsignatura("Programación", 4, 4, 6);
        NotaAsignatura bdAndres = new NotaAsignatura("Bases de Datos", 9, 8, 8);
        Alumno andres = new Alumno("Andrés", "andres@email.com");

        andres.programacion = progAndres;
        andres.baseDatos = bdAndres;

        // ===== VICENTE =====
        NotaAsignatura progVicente = new NotaAsignatura("Programación", 2, 2, 3);
        NotaAsignatura bdVicente = new NotaAsignatura("Bases de Datos", 6, 6, 7);
        Alumno vicente = new Alumno("Vicente", "vicente@email.com");

        vicente.programacion = progVicente;
        vicente.baseDatos = bdVicente;

        // ===== IMPRIMIR MEDIA DE VICENTE =====
        System.out.println("La media de Vicente en Programación es: " + vicente.programacion.calcularMedia());

        // ===== IMPRIMIR SI HAN APROBADO =====
        vicente.imprimeSiHaAprobado("Programación");
        lucia.imprimeSiHaAprobado("Programación");

    }
}
