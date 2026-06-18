package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej1;

import java.util.Scanner;

public class GestionaInstituto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instituto inst = new Instituto();
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("1. Agregar estudiante a un grupo");
            System.out.println("2. Agregar grupo al instituto");
            System.out.println("3. Mostrar estudiantes con notas por grupo");
            System.out.println("4. Mostrar información básica de un grupo");
            System.out.println("5. Promedio de notas de un estudiante");
            System.out.println("6. Promedio de notas por grupo");
            System.out.println("7. Salir");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Opción inválida");
                continue;
            }

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Descripción del grupo: ");
                        Grupo g1 = inst.buscarGrupo(sc.nextLine());
                        if (g1 == null) throw new GrupoNoEncontradoException("Grupo no existe");

                        System.out.print("Nombre estudiante: ");
                        String nom = sc.nextLine();
                        System.out.print("ID estudiante: ");
                        String id = sc.nextLine();

                        Estudiante e = new Estudiante(nom, id);

                        System.out.print("Número de notas: ");
                        int n = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < n; i++) {
                            System.out.print("Nota " + (i + 1) + ": ");
                            e.agregarNota(Double.parseDouble(sc.nextLine()));
                        }
                        g1.agregarEstudiante(e);
                        break;

                    case 2:
                        System.out.print("ID grupo: ");
                        String gid = sc.nextLine();
                        System.out.print("Descripción: ");
                        String desc = sc.nextLine();
                        System.out.print("Tutor: ");
                        String tut = sc.nextLine();
                        System.out.print("Aula: ");
                        String aula = sc.nextLine();
                        inst.agregarGrupo(new Grupo(gid, desc, tut, aula));
                        break;

                    case 3:
                        for (Grupo g : inst.getGrupos()) {
                            System.out.println(g.getDescripcion());
                            for (Estudiante es : g.getEstudiantes())
                                System.out.println("  " + es);
                        }
                        break;

                    case 4:
                        System.out.print("Descripción del grupo: ");
                        Grupo g4 = inst.buscarGrupo(sc.nextLine());
                        if (g4 == null) throw new GrupoNoEncontradoException("Grupo no existe");
                        System.out.println(g4);
                        break;

                    case 5:
                        System.out.print("Descripción del grupo: ");
                        Grupo g5 = inst.buscarGrupo(sc.nextLine());
                        if (g5 == null) throw new GrupoNoEncontradoException("Grupo no existe");

                        System.out.print("ID del estudiante: ");
                        Estudiante est = g5.buscarEstudiante(sc.nextLine());
                        if (est == null) throw new EstudianteNoEncontradoException("Estudiante no existe");

                        System.out.println("Promedio: " + est.promedio());
                        break;

                    case 6:
                        System.out.print("Descripción del grupo: ");
                        Grupo g6 = inst.buscarGrupo(sc.nextLine());
                        if (g6 == null) throw new GrupoNoEncontradoException("Grupo no existe");

                        System.out.println("Promedio del grupo: " + g6.promedioGrupo());
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
