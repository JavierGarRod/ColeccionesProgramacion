package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.Ejercicios_IA.Collections;

import java.util.*;

public class GestionAnimalesMenu {
        public static void main(String[] args) {
            menu();
        }

        public static void menu() {

            Scanner sc = new Scanner(System.in);
            RepositorioAnimal repo = new RepositorioAnimal();

            int opcion;

            do {
                System.out.println("\n===== MENÚ PROTECTORA =====");
                System.out.println("1. Añadir animal");
                System.out.println("2. Mostrar animales ordenados");
                System.out.println("3. Consultar animal por ID");
                System.out.println("4. Modificar nombre de un animal");
                System.out.println("5. Registrar adopción (solo adoptables)");
                System.out.println("6. Emitir sonido de un animal");
                System.out.println("0. Salir");
                System.out.print("Elige opción: ");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1 -> {
                        System.out.println("\n--- Añadir animal ---");
                        System.out.println("1. Perro");
                        System.out.println("2. Tortuga");
                        System.out.print("Tipo: ");
                        int tipo = Integer.parseInt(sc.nextLine());

                        String familia = null;

                        if (tipo == 1) {
                            System.out.print("Familia: ");
                            familia = sc.nextLine();
                        }

                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Edad: ");
                        int edad = Integer.parseInt(sc.nextLine());

                        System.out.print("Peso: ");
                        double peso = Double.parseDouble(sc.nextLine());

                        System.out.print("Tipo de sangre (A, B, O): ");
                        TipoSangre sangre = TipoSangre.valueOf(sc.nextLine().toUpperCase());

                        Animal a = null;

                        if (tipo == 1) {
                            a = new Perro(familia, nombre, edad, peso, sangre);
                        } else if (tipo == 2) {
                            a = new Tortuga(nombre, edad, peso, sangre);
                        }

                        if (repo.add_animal(a))
                            System.out.println("Animal añadido correctamente.");
                        else
                            System.out.println("El animal ya existe.");
                    }

                    case 2 -> {
                        System.out.println("\n--- MOSTRAR ORDENADO ---");
                        repo.mostrar_ordenado();
                    }

                    case 3 -> {
                        System.out.print("\nID a consultar: ");
                        int id = Integer.parseInt(sc.nextLine());
                        Animal a = repo.consultar_datos(id);
                        if (a != null) System.out.println(a);
                        else System.out.println("No existe ese animal.");
                    }

                    case 4 -> {
                        System.out.print("\nID del animal a modificar: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Nuevo nombre: ");
                        String nuevo = sc.nextLine();
                        repo.modificar_datos(id, nuevo);
                    }

                    case 5 -> {
                        System.out.print("\nID del animal a adoptar: ");
                        int id = Integer.parseInt(sc.nextLine());
                        Animal a = repo.consultar_datos(id);

                        if (a == null) {
                            System.out.println("No existe ese animal.");
                            break;
                        }

                        if (a instanceof Adoptable adoptable) {
                            System.out.print("Familia adoptante: ");
                            String fam = sc.nextLine();
                            adoptable.registrarAdopcion(fam);
                            System.out.println("Adopción registrada.");
                        } else {
                            System.out.println("Este animal NO es adoptable.");
                        }
                    }

                    case 6 -> {
                        System.out.print("\nID del animal: ");
                        int id = Integer.parseInt(sc.nextLine());
                        Animal a = repo.consultar_datos(id);
                        if (a != null) a.emitirSonido();
                        else System.out.println("No existe ese animal.");
                    }

                    case 0 -> System.out.println("Saliendo del programa...");

                    default -> System.out.println("Opción no válida.");
                }

            } while (opcion != 0);
        }
    }

