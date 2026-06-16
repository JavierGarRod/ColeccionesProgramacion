package Apuntes;


import java.util.*;

public class Resumen_Mapa{
    public static void main(String[] args) {

        // --- A. TREEMAP CON ORDEN NATURAL (Usa Comparable / compareTo) ---
        Map<Estudiante, Double> calificaciones = new TreeMap<>();
        calificaciones.put(new Estudiante(3, "Carlos"), 8.5);
        calificaciones.put(new Estudiante(1, "Ana"), 9.5);
        calificaciones.put(new Estudiante(2, "Beto"), 7.0);

        System.out.println("1. TreeMap (Ordenado por ID automáticamente):");
        calificaciones.forEach((k, v) -> System.out.println(k + " -> Nota: " + v));


        // --- B. ORDENAR UN MAPA POR UN CRITERIO DIFERENTE (Comparator) ---
        // Si queremos ordenar por NOMBRE en lugar de ID:
        List<Map.Entry<Estudiante, Double>> listaOrdenada = new ArrayList<>(calificaciones.entrySet());

        // Usando Comparator (Lambda) para comparar por el nombre del estudiante
        listaOrdenada.sort(Comparator.comparing(entry -> entry.getKey().getNombre()));

        System.out.println("\n2. Lista de Mapa ordenada por NOMBRE:");
        for (Map.Entry<Estudiante, Double> e : listaOrdenada) {
            System.out.println(e.getKey().getNombre() + " tiene un " + e.getValue());
        }


        // --- C. MÉTODOS DE UTILIDAD QUE FALTABAN ---
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Manzanas", 10);

        // compute: Calcula un nuevo valor basado en el actual
        stock.compute("Manzanas", (k, v) -> (v == null) ? 1 : v + 5);

        // merge: Combina valores si la llave ya existe
        stock.merge("Peras", 5, Integer::sum);

        // getOrDefault: Evita NullPointerException si la llave no existe
        int valor = stock.getOrDefault("Plátanos", 0);

        System.out.println("\n3. Métodos modernos (Compute/Merge):");
        System.out.println(stock);


        // --- D. RECORRIDO TOTAL (RESUMEN) ---
        // 1. EntrySet (Eficiente)
        // 2. KeySet (Solo llaves)
        // 3. Values (Solo valores)
        // 4. ForEach + Lambda (Limpio)
        // 5. Streams (Para filtros complejos)
        long aprobados = calificaciones.entrySet().stream()
                .filter(e -> e.getValue() >= 9.0)
                .count();
        System.out.println("\n4. Stream API: Estudiantes con 9 o más: " + aprobados);
    }
}