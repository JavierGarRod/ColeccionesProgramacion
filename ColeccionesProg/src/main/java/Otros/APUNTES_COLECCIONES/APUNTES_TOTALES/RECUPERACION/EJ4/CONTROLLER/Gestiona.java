package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.CONTROLLER;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.EXCEPTIONS.PartidoDuplicadoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.EXCEPTIONS.PartidoYaFinalizadoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL.Categoria;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL.Jugador;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL.Pareja;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.MODEL.Partido;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ4.REPOSITORY.RepoJuego;

public class Gestiona {
        public static void main(String[] args) {

            // Jugadores
            Jugador j1 = new Jugador("Carlos", "García López", 12, Categoria.PRIMERA);
            Jugador j2 = new Jugador("Luis", "Martínez Ruiz", 45, Categoria.SEGUNDA);
            Jugador j3 = new Jugador("Ana", "Pérez Soto", 8, Categoria.PRIMERA);
            Jugador j4 = new Jugador("María", "López Vega", 33, Categoria.TERCERA);
            Jugador j5 = new Jugador("Pedro", "Sánchez Gil", 21, Categoria.SEGUNDA);
            Jugador j6 = new Jugador("Laura", "Romero Cruz", 17, Categoria.PRIMERA);
            Jugador j7 = new Jugador("Marcos", "Díaz Leal", 55, Categoria.TERCERA);
            Jugador j8 = new Jugador("Sofía", "Navarro Ríos", 40, Categoria.SEGUNDA);

            // Parejas
            Pareja pareja1 = new Pareja("Los Ases", j1, j2);
            Pareja pareja2 = new Pareja("Thunder", j3, j4);
            Pareja pareja3 = new Pareja("Los Crack", j5, j6);
            Pareja pareja4 = new Pareja("Imparables", j7, j8);

            // Repositorio
            RepoJuego repo = new RepoJuego();

            // Registrar parejas
            repo.registrar_parejas(pareja1);
            repo.registrar_parejas(pareja2);
            repo.registrar_parejas(pareja3);
            repo.registrar_parejas(pareja4);

            // Programar partidos
            Partido partido1 = new Partido(pareja1, pareja2);
            Partido partido2 = new Partido(pareja3, pareja4);
            Partido partido3 = new Partido(pareja1, pareja3);
            Partido partido4 = new Partido(pareja2, pareja4);
            Partido partido5 = new Partido(pareja1, pareja4);
            Partido partido6 = new Partido(pareja2, pareja3);

            try {
                repo.programarPartido(partido1);
                repo.programarPartido(partido2);
                repo.programarPartido(partido3);
                repo.programarPartido(partido4);
                repo.programarPartido(partido5);
                repo.programarPartido(partido6);
            } catch (PartidoDuplicadoException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Intentar partido duplicado
            try {
                Partido duplicado = new Partido(pareja1, pareja2);
                repo.programarPartido(duplicado);
            } catch (PartidoDuplicadoException e) {
                System.out.println("Duplicado capturado: " + e.getMessage());
            }

            // Registrar resultados
            try {
                repo.registrarResultado(partido1, new Integer[]{6, 3});
                repo.registrarResultado(partido2, new Integer[]{4, 6});
                repo.registrarResultado(partido3, new Integer[]{6, 2});
                repo.registrarResultado(partido4, new Integer[]{5, 6});
                repo.registrarResultado(partido5, new Integer[]{6, 4});
            } catch (PartidoYaFinalizadoException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Intentar registrar resultado en partido ya finalizado
            try {
                repo.registrarResultado(partido1, new Integer[]{3, 6});
            } catch (PartidoYaFinalizadoException e) {
                System.out.println("Ya finalizado capturado: " + e.getMessage());
            }

            // Ranking
            System.out.println("\n--- RANKING DE PAREJAS ---");
            for (Pareja p : repo.mostrarRankingParejas()) {
                System.out.println(p.getNombre() + " - Victorias: " + repo.contadorVictorias(p));
            }

            // Partidos pendientes
            System.out.println("\n--- PARTIDOS PENDIENTES ---");
            for (Partido p : repo.mostrarPartidosPendientes()) {
                System.out.println(p);
            }

            // Historial de una pareja
            System.out.println("\n--- HISTORIAL DE " + pareja1.getNombre() + " ---");
            for (Partido p : repo.getHistorialPareja(pareja1)) {
                System.out.println(p);
            }

            // Pareja con más victorias
            System.out.println("\n--- PAREJA CON MÁS VICTORIAS ---");
            System.out.println(repo.getParejaConMasVictorias().getNombre());
        }
    }

