package Colecciones.Apuntes_FINAL.PUNTESCOL;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class ApuntesMaps {

    public static void main(String[] args) {


        // 1. HASHMAP (por clave, rápido y desordenado, usa equals y hashcode de CLAVE)

        // ✔ Guarda pares CLAVE → VALOR  NEW!!!
        // ✔ No permite claves duplicadas
        // ✔ Muy rápido en búsqueda, inserción y eliminación
        // ❌ No mantiene ningún orden
        // ❗ Usa equals() y hashCode() de la CLAVE

        Map<String, Integer> hashMap = new HashMap<>();


        // AÑADIR ELEMENTOS

        hashMap.put("Ana", 20);      // clave "Ana", valor 20
        hashMap.put("Luis", 30);
        hashMap.put("Ana", 25);      // clave repetida → sobrescribe el valor


        // OBTENER VALORES

        System.out.println("Edad de Ana: " + hashMap.get("Ana")); // 25


        // COMPROBAR EXISTENCIA

        hashMap.containsKey("Luis");   // true
        hashMap.containsValue(30);     // true


        // ELIMINAR

        hashMap.remove("Luis");        // elimina la entrada con clave "Luis"


        // RECORRER MAP (4 FORMAS)


        System.out.println("\n--- HASHMAP: recorrer con keySet() ---");
        for (String clave : hashMap.keySet()) {
            System.out.println(clave + " → " + hashMap.get(clave));
        }

        System.out.println("\n--- HASHMAP: recorrer con values() ---");
        for (Integer valor : hashMap.values()) {
            System.out.println(valor);
        }

        System.out.println("\n--- HASHMAP: recorrer con entrySet() ---");
        for (Map.Entry<String, Integer> entrada : hashMap.entrySet()) {   //Entry es <clave, valor> y entrySet devuelve cada entry del mapa
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        System.out.println("\n--- HASHMAP: recorrer con forEach() ---");
        hashMap.forEach((clave, valor) -> { //clave y valor se definen en este momento y corresponden a cada Entry
            System.out.println(clave + " → " + valor);
        });



        // 2. LINKEDHASHMAP (ordenado, sin duplicados y más lento)

        // ✔ Mantiene el orden de inserción
        // ✔ No permite claves duplicadas
        // ✔ Más lento que HashMap, pero ordenado
        // ❗ Usa equals() y hashCode() de la CLAVE

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10, "Rojo");
        linkedHashMap.put(20, "Verde");
        linkedHashMap.put(30, "Azul");

        System.out.println("\n--- LINKEDHASHMAP (orden de inserción) ---");
        for (Map.Entry<Integer, String> entrada : linkedHashMap.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }



        // 3. TREEMAP (ordenado, CLAVES ordenadas automáticamente, sin CLAVES duplicadas y usa Comparable o Comparator)

        // ✔ Ordena automáticamente por la CLAVE
        // ✔ No permite claves duplicadas
        // ❗ La clave debe implementar Comparable o usar Comparator

        Map<String, Double> treeMap = new TreeMap<>();

        treeMap.put("Zorro", 2.5);
        treeMap.put("Ardilla", 1.2);
        treeMap.put("Caballo", 3.0);

        System.out.println("\n--- TREEMAP (ordenado por clave) ---");
        for (Map.Entry<String, Double> entrada : treeMap.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }


        // 4. MÉTODOS IMPORTANTES DE MAP

        Map<String, Integer> ejemplo = new HashMap<>();

        ejemplo.put("A", 1);
        ejemplo.put("B", 2);

        ejemplo.get("A");            // obtener valor
        ejemplo.containsKey("B");    // comprobar clave
        ejemplo.containsValue(2);    // comprobar valor
        ejemplo.remove("A");         // eliminar por clave
        ejemplo.size();              // tamaño
        ejemplo.clear();             // vaciar mapa
        ejemplo.isEmpty();           // comprobar vacío
    }

    /*

         Clave → Valor
         NO permite claves duplicadas

    - HashMap:
    "Diccionario sin duplicados, sin orden, rápido en búsquedas"
        → Sin orden
        → Muy rápido en búsquedas, inserción y eliminación
        → Ejemplo: lista de la compra (producto → kg)
                   diccionario de alumnos (dni → alumno)

    - LinkedHashMap:
    "Diccionario rápido que conserve el orden"
        → Mantiene orden de inserción
        → Ejemplo: historial de accesos, cache simple

    - TreeMap:
    "Diccionario ordenado por clave"
        → Ordenado por clave
        → Ejemplo: agenda ordenada por nombre, ranking por clave

     */
}
