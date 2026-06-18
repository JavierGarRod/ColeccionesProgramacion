package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Notas;

public class Alumno {
    String nombre;
    String apellidos;
    String email;
    NotaAsignatura programacion;
    NotaAsignatura baseDatos;

    // constructor
    public Alumno(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // metodos
    public void imprimeSiHaAprobado(String nombreAsignatura) {

        NotaAsignatura asignatura = null;

        // Elegir la asignatura correcta
        if (nombreAsignatura.equalsIgnoreCase("Programación")) {
            asignatura = programacion;
        } else if (nombreAsignatura.equalsIgnoreCase("Bases de Datos")) {
            asignatura = baseDatos;
        }

        // Si no existe esa asignatura
        if (asignatura == null) {
            System.out.println("La asignatura " + nombreAsignatura + " no existe para este alumno.");
        }
        else {
            // Comprobar si aprueba
            if (asignatura.calcularMedia() >= 5) {
                System.out.println("El alumno " + nombre + " ha aprobado la asignatura " + nombreAsignatura);
            } else {
                System.out.println("El alumno " + nombre + " NO ha aprobado la asignatura " + nombreAsignatura);
            }
        }
    }


    @Override public String toString() {
        return "Alumno{" + "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", programacion=" + programacion +
                ", baseDatos=" + baseDatos +
                '}';
    }
}
