package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej1.Controller;

import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin1.Ej1.Model.Estudiante;
import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin1.Ej1.Model.Grupo;
import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin1.Ej1.Model.Instituto;

import java.util.Scanner;

public class GestionaEstudiantes {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        Instituto inst = new Instituto();
        GestionaEstudiantes referencia = new GestionaEstudiantes();
        int opcion = 0;

        do {
            try {

                opcion = referencia.pintoMenu(sc);
                sc.nextLine(); // limpiar buffer

                switch (opcion) {

                    case 1:
                        try {
                            System.out.print("Grupo: ");
                            Grupo g = inst.buscarGrupo(sc.nextLine());

                            System.out.print("Nombre estudiante: ");
                            String nombre = sc.nextLine();

                            System.out.print("ID estudiante: ");
                            String id = sc.nextLine();

                            g.agregarEstudiante(new Estudiante(nombre, id));
                            System.out.println("Estudiante agregado.");

                        } catch (Exception e) {
                            System.out.println("Error al agregar estudiante: " + e.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            System.out.print("Descripción del grupo: ");
                            String desc = sc.nextLine();

                            System.out.print("Tutor: ");
                            String tutor = sc.nextLine();

                            System.out.print("Aula: ");
                            String aula = sc.nextLine();

                            inst.agregarGrupo(new Grupo(desc, tutor, aula));
                            System.out.println("Grupo agregado.");

                        } catch (Exception e) {
                            System.out.println("Error al agregar grupo.");
                        }
                        break;

                    case 3:
                        inst.muestroInformacionEstudiantePorGrupo();
                        break;

                    case 4:
                        try {
                            System.out.print("Grupo: ");
                            Grupo g4 = inst.buscarGrupo(sc.nextLine());
                            System.out.println(g4);

                        } catch (Exception e) {
                            System.out.println("Error al mostrar grupo.");
                        }
                        break;

                    case 5:
                        try {
                            System.out.print("Grupo: ");
                            Grupo g5 = inst.buscarGrupo(sc.nextLine());

                            System.out.print("ID estudiante: ");
                            Estudiante est = g5.buscarEstudiante(sc.nextLine());

                            System.out.println("Media: " + est.calcularPromedio());

                        } catch (Exception e) {
                            System.out.println("Error al calcular promedio del estudiante.");
                        }
                        break;

                    case 6:
                        try {
                            System.out.print("Grupo: ");
                            Grupo g6 = inst.buscarGrupo(sc.nextLine());
                            System.out.println("Media del grupo: " + g6.promedioGrupo());

                        } catch (Exception e) {
                            System.out.println("Error al calcular promedio del grupo.");
                        }
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (Exception e) {
                System.out.println("Debes introducir un número.");
                sc.nextLine(); // limpiar entrada incorrecta
            }

        } while (opcion != 7);

    }

    public int pintoMenu(Scanner sc){

        System.out.println("--- MENÚ ---");
        System.out.println("1. Agregar estudiante a un grupo");
        System.out.println("2. Agregar grupo al instituto");
        System.out.println("3. Mostrar estudiantes con notas por grupo");
        System.out.println("4. Mostrar info básica de un grupo");
        System.out.println("5. Promedio de notas de un estudiante");
        System.out.println("6. Promedio de notas de un grupo");
        System.out.println("7. Salir");
        System.out.println("Introduce una opcion: ");

        int opcion = sc.nextInt();
        return opcion;
    }
}
