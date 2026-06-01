package BoletinListas.Ej1.Controller;


import BoletinListas.Ej1.Exception.EstudianteNoEncontradoException;
import BoletinListas.Ej1.Exception.GrupoNoEncontradoException;
import BoletinListas.Ej1.Models.Estudiante;
import BoletinListas.Ej1.Models.Grupo;
import BoletinListas.Ej1.Models.Instituto;

import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instituto instituto = new Instituto();
        int opcion = 0;
        // Bucle principal del menú
        do{
            Controlador ref=new Controlador();
            opcion=ref.menu(sc, opcion);
            switch (opcion) {
                case 1:
                    // Agregar estudiante
                    System.out.print("Descripción del grupo: ");
                    sc.nextInt();
                    String desc = sc.nextLine();
                    Grupo g = instituto.buscarGrupo(desc);

                    if (g == null) {
                        System.out.println("Grupo no encontrado.");
                        break;
                    }

                    System.out.print("Nombre del estudiante: ");
                    String nom = sc.nextLine();
                    System.out.print("ID del estudiante: ");
                    String id = sc.nextLine();

                    g.agregarEstudiante(new Estudiante(nom, id));
                    System.out.println("Estudiante agregado.");
                    break;

                case 2:
                    // Agregar grupo

                    System.out.print("Identificador: ");
                    sc.nextInt();
                    String idg = sc.nextLine();
                    System.out.print("Descripción: ");
                    String d = sc.nextLine();
                    System.out.print("Tutor: ");
                    String t = sc.nextLine();
                    System.out.print("Aula: ");
                    String a = sc.nextLine();

                    instituto.agregarGrupo(new Grupo(idg, d, t, a));
                    System.out.println("Grupo agregado.");
                    break;

                case 3:
                    // Mostrar estudiantes por grupo
                    for (Grupo gr : instituto.getGrupos()) {
                        System.out.println("\nGrupo: " + gr.getDescripcion());
                        for (Estudiante e : gr.getEstudiantes())
                            System.out.println(e);
                    }
                    break;

                case 4:
                    // Mostrar información básica de un grupo
                    System.out.print("Descripción del grupo: ");
                    String dg = sc.nextLine();
                    Grupo grupo = instituto.buscarGrupo(dg);

                    if (grupo == null) {
                        System.out.println("Grupo no encontrado.");
                    } else {
                        grupo.mostrarBasico();
                    }
                    break;

                case 5:
                    // Submenú de promedios
                    System.out.println("1. Promedio de un estudiante");
                    System.out.println("2. Promedio de un grupo");
                    int sub = Integer.parseInt(sc.nextLine());

                    if (sub == 1) {
                        try {
                            System.out.print("Grupo: ");
                            String gdesc = sc.nextLine();
                            Grupo gr = instituto.buscarGrupo(gdesc);

                            if (gr == null)
                                throw new GrupoNoEncontradoException("Grupo no existe.");

                            System.out.print("ID del estudiante: ");
                            String estid = sc.nextLine();
                            Estudiante est = gr.buscarEstudiante(estid);

                            if (est == null)
                                throw new EstudianteNoEncontradoException("Estudiante no encontrado.");

                            System.out.println("Promedio: " + est.promedio());

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    } else if (sub == 2) {
                        try {
                            System.out.print("Grupo: ");
                            String gdesc = sc.nextLine();
                            Grupo gr = instituto.buscarGrupo(gdesc);

                            if (gr == null)
                                throw new GrupoNoEncontradoException("Grupo no existe.");

                            System.out.println("Promedio del grupo: " + gr.promedioGrupo());

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }while (opcion != 6);
        System.out.println("Saliendo...");
    }

    public int menu(Scanner sc, int opcion){
        // Menú de opciones
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Agregar estudiante a un grupo");
        System.out.println("2. Agregar grupo al Instituto");
        System.out.println("3. Mostrar estudiantes por grupo");
        System.out.println("4. Mostrar información básica de un grupo");
        System.out.println("5. Calcular promedios");
        System.out.println("6. Salir");
        System.out.println("Elige una opcion: ");
        opcion=sc.nextInt();
        return opcion;
    }
}