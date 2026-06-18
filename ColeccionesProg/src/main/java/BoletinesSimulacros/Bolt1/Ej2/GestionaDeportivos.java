package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej2;

public class GestionaDeportivos {
    public static void main(String[] args) {

        try {
            Equipo futbol = new Equipo("Fútbol");
            Equipo baloncesto = new Equipo("Baloncesto");

            Alumno a1 = new Alumno("Juan", "111A");
            Alumno a2 = new Alumno("Ana", "222B");
            Alumno a3 = new Alumno("Luis", "333C");
            Alumno a4 = new Alumno("Ana", "222B");

            futbol.añadirAlumno(a1);
            futbol.añadirAlumno(a2);

            baloncesto.añadirAlumno(a2);
            baloncesto.añadirAlumno(a3);

            System.out.println("Fútbol:");
            futbol.mostrar();

            System.out.println("Baloncesto:");
            baloncesto.mostrar();

            System.out.println("¿Pertenece Ana a fútbol?");
            System.out.println(futbol.buscarAlumno(a4));

            System.out.println("Unión:");
            Equipo union = futbol.union(baloncesto);
            union.mostrar();

            System.out.println("Intersección:");
            Equipo inter = futbol.interseccion(baloncesto);
            inter.mostrar();

            System.out.println("Intentando añadir alumno repetido:");
            futbol.añadirAlumno(a4); 

        } catch (DeportivosException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
