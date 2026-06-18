package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.Ordenación;

import java.util.*;

public class ApuntesOrdenacion {

    public static void main(String[] args) {


        // 1. ORDENACIÓN NATURAL → Comparable + compareTo()
        // La clase Persona implementa Comparable y define su orden natural (por nombre)

        List<Persona> lista = new ArrayList<>();

        lista.add(new Persona("Carlos", 30));
        lista.add(new Persona("Ana", 25));
        lista.add(new Persona("Bea", 20));

        // Ordenar usando el orden natural definido en compareTo()
        Collections.sort(lista);

        System.out.println("\n--- ORDEN NATURAL (compareTo) ---");
        for (Persona p : lista) {
            System.out.println(p);
        }


        // 2. ORDENACIÓN ALTERNATIVA → Comparator (en otra clase)
        // Usamos tu clase ComparadorPorEdad para ordenar por edad

        ComparadorPorEdad compEdad = new ComparadorPorEdad();

        Collections.sort(lista, compEdad);

        System.out.println("\n--- ORDEN POR EDAD (Comparator externo) ---");
        for (Persona p : lista) {
            System.out.println(p);
        }


        // 3. TREESET → Ordenación automática usando compareTo()
        // OBLIGATORIO USAR COMPARABLES!!!!!

        Set<Persona> treeSet = new TreeSet<>(); // usa compareTo() de Persona automáticamente

        treeSet.add(new Persona("Carlos", 30));
        treeSet.add(new Persona("Ana", 25));
        treeSet.add(new Persona("Bea", 20));

        System.out.println("\n--- TREESET ORDENADO (compareTo) ---");
        for (Persona p : treeSet) {
            System.out.println(p);
        }


        // 4. TREESET CON COMPARATOR EXTERNO

        Set<Persona> treeSetEdad = new TreeSet<>(compEdad);

        treeSetEdad.add(new Persona("Carlos", 30));
        treeSetEdad.add(new Persona("Ana", 25));
        treeSetEdad.add(new Persona("Bea", 20));

        System.out.println("\n--- TREESET ORDENADO POR EDAD (Comparator externo) ---");
        for (Persona p : treeSetEdad) {
            System.out.println(p);
        }


        // 5. TREEMAP → Ordenado por la CLAVE
        // La clave debe implementar Comparable o usar Comparator
        // OBLIGATORIO USAR COMPARABLES EN CLAVES!!!!!

        Map<String, Persona> treeMap = new TreeMap<>();

        treeMap.put("Zorro", new Persona("Z", 10));
        treeMap.put("Ardilla", new Persona("A", 20));
        treeMap.put("Caballo", new Persona("C", 30));

        System.out.println("\n--- TREEMAP ORDENADO POR CLAVE ---");
        for (Map.Entry<String, Persona> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}

