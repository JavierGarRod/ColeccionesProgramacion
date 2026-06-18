package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej3;

import java.util.List;
import java.util.Scanner;

public class GestionBiblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();
        int opcion = 0;

        while (opcion != 7) {

            System.out.println("1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Información detallada por ISBN");
            System.out.println("6. Buscar por título o autor");
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
                        System.out.print("ISBN: ");
                        String isbn = sc.nextLine();
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        System.out.print("Género: ");
                        String genero = sc.nextLine();
                        System.out.print("Año: ");
                        int año = Integer.parseInt(sc.nextLine());

                        b.agregarLibro(new Libro(isbn, titulo, autor, genero, año));
                        break;

                    case 2:
                        System.out.print("ISBN del libro a prestar: ");
                        b.prestarLibro(sc.nextLine());
                        break;

                    case 3:
                        System.out.print("ISBN del libro a devolver: ");
                        b.devolverLibro(sc.nextLine());
                        break;

                    case 4:
                        b.mostrarLibros();
                        break;

                    case 5:
                        System.out.print("ISBN: ");
                        Libro l = b.buscarPorIsbn(sc.nextLine());
                        if (l == null) System.out.println("No existe");
                        else System.out.println(l.infoDetallada());
                        break;

                    case 6:
                        System.out.print("Texto a buscar: ");
                        List<Libro> lista = b.buscarPorTituloOAutor(sc.nextLine());
                        for (Libro li : lista) System.out.println(li);
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }

            } catch (BibliotecaException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}
