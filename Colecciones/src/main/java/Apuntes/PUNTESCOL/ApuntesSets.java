package Colecciones.Apuntes_FINAL.PUNTESCOL;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class ApuntesSets {

    public static void main(String[] args) {


        // 1. HASHSET (desordenado, sin duplicados y rápido, utiliza equals y hashcode)

        // ✔ No permite elementos duplicados  NEW GOOD!!!
        // ✔ No garantiza ningún orden  NEW BAD!!!
        // ✔ Muy rápido en búsqueda, inserción y eliminación (tiene lo bueno de las arraylist-búsquedas y lo bueno de los linkedlist-insercción y eliminación)
        // ❗ Usa equals() y hashCode() para detectar duplicados  NEW!!!

        Set<String> hashSet = new HashSet<>();


        // AÑADIR ELEMENTOS

        hashSet.add("Perro");
        hashSet.add("Gato");
        hashSet.add("Tortuga");
        hashSet.add("Gato"); // duplicado → NO se añade


        // RECORRER (orden aleatorio)

        System.out.println("\n--- HASHSET ---");
        for (String s : hashSet) {
            System.out.println(s);
        }


        // MÉTODOS IMPORTANTES

        hashSet.contains("Perro"); // buscar
        hashSet.remove("Gato");    // eliminar
        hashSet.size();            // tamaño
        hashSet.clear();           // vaciar



        // 2. LINKEDHASHSET (lento, sin duplicados y ordenado)

        // ✔ No permite duplicados
        // ✔ Mantiene el orden de inserción (como las list, mejor que los hashset)
        // ✔ Más lento que HashSet, pero ordenado
        // ❗ Usa equals() y hashCode()


        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Rojo");
        linkedHashSet.add("Verde");
        linkedHashSet.add("Azul");
        linkedHashSet.add("Verde"); // duplicado → NO se añade

        System.out.println("\n--- LINKEDHASHSET (orden de inserción) ---");
        for (String s : linkedHashSet) {
            System.out.println(s);
        }



        // 3. TREESET (ordenado, sin uplicados, usa compareTo())

        // ✔ No permite duplicados
        // ✔ Ordena automáticamente los elementos
        // ✔ Usa compareTo() (orden natural) o Comparator
        // ❗ Los elementos deben ser comparables

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Zorro");
        treeSet.add("Ardilla");
        treeSet.add("Caballo");
        treeSet.add("Ardilla"); // duplicado → NO se añade

        System.out.println("\n--- TREESET (ordenado alfabéticamente) ---");
        for (String s : treeSet) {
            System.out.println(s);
        }


        // 4. RECORRER UN SET CON ITERATOR

        System.out.println("\n--- RECORRER CON ITERATOR ---");
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /*
         NO permiten duplicados

    - HashSet:
    "Conjunto sin duplicados, sin orden, muy rápido"
        → Sin orden
        → Muy rápido en búsquedas, inserción y eliminación
        → Ejemplo: conjunto de DNI, emails únicos

    - LinkedHashSet:
    "Conjunto sin duplicados, pero con orden de inserción"
        → Mantiene orden de inserción
        → Rápido
        → Ejemplo: historial de elementos sin duplicados

    - TreeSet:
    "Conjunto ordenado automáticamente"
        → Ordenado automáticamente
        → Más lento
        → Ejemplo: ranking ordenado, lista de palabras ordenadas

     */
}

