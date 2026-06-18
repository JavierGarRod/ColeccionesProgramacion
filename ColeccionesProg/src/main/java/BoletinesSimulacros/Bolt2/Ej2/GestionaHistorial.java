package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt2.Ej2;

import java.time.LocalDate;
import java.util.Scanner;

public class GestionaHistorial {

    public static void main(String[] args) {

        Historial h = new Historial();
        Scanner sc = new Scanner(System.in);

        try {
            h.agregarPagina("google.com", LocalDate.of(2024, 1, 10));
            h.agregarPagina("youtube.com", LocalDate.now());
            h.agregarPagina("google.com", LocalDate.now().minusDays(2));
            h.agregarPagina("microsoft.com", LocalDate.of(2023, 12, 5));
            h.agregarPagina("youtube.com", LocalDate.now().minusDays(10));
            h.agregarPagina("futuro.com", LocalDate.now().plusDays(5));
        } catch (HistorialException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("HISTORIAL COMPLETO");
        h.mostrarHistorial();

        System.out.println("HISTORIAL PARA google.com");
        h.historialDeUrl("google.com");

        int opcion = 0;

        while (opcion != 7) {

            System.out.println("1. Agregar pagina");
            System.out.println("2. Mostrar historial completo");
            System.out.println("3. Historial de un dia");
            System.out.println("4. Historial por url");
            System.out.println("5. Borrar visitas por url");
            System.out.println("6. Mostrar ordenado por url");
            System.out.println("7. Salir");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Opcion invalida");
                continue;
            }

            try {
                switch (opcion) {

                    case 1:
                        System.out.print("URL: ");
                        String url = sc.nextLine();

                        System.out.print("Fecha YYYY-MM-DD o vacio para hoy: ");
                        String fecha = sc.nextLine();

                        LocalDate f = fecha.isEmpty() ? LocalDate.now() : LocalDate.parse(fecha);

                        h.agregarPagina(url, f);
                        break;

                    case 2:
                        h.mostrarHistorial();
                        break;

                    case 3:
                        System.out.print("Fecha YYYY-MM-DD: ");
                        LocalDate dia = LocalDate.parse(sc.nextLine());
                        h.historialDeDia(dia);
                        break;

                    case 4:
                        System.out.print("URL: ");
                        h.historialDeUrl(sc.nextLine());
                        break;

                    case 5:
                        System.out.print("URL a borrar: ");
                        h.borrarPorUrl(sc.nextLine());
                        break;

                    case 6:
                        h.mostrarOrdenadoPorUrl();
                        break;

                    case 7:
                        System.out.println("Saliendo");
                        break;

                    default:
                        System.out.println("Opcion invalida");
                }

            } catch (HistorialException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}

