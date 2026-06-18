package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class ApuntesListas {

    public static void main(String[] args) {

        // 1. ARRAYLIST (rápido recorridos, lentas modificaciones y ordenación de introducción)

        // Estructura interna: array dinámico
        // ✔ Acceso rápido por índice
        // ✔ Muy eficiente al recorrer
        // ❌ Insertar/borrar en medio es lento (hay que desplazar elementos)

        List<String> arrayList = new ArrayList<>();


        // AÑADIR ELEMENTOS

        arrayList.add("Ana");          // añade al final
        arrayList.add("Luis");
        arrayList.add("Carlos");
        arrayList.add("Ana");          // permite repetidos

        // añadir en una posición concreta
        arrayList.add(1, "María");     // inserta en índice 1 (posición concreta)


        // OBTENER ELEMENTOS

        String nombre = arrayList.get(0);  // acceso por índice
        System.out.println("Primer elemento: " + nombre);


        // REEMPLAZAR ELEMENTOS

        arrayList.set(2, "NuevoNombre");   // reemplaza el elemento del índice 2

        // ELIMINAR ELEMENTOS

        arrayList.remove("Ana");   // elimina la primera coincidencia
        arrayList.remove(1);       // elimina por índice


        // BUSCAR ELEMENTOS

        boolean existe = arrayList.contains("Luis");
        System.out.println("¿Existe Luis? " + existe);

        int primeraPos = arrayList.indexOf("Ana");
        int ultimaPos = arrayList.lastIndexOf("Ana");


        // TAMAÑO

        System.out.println("Tamaño del ArrayList: " + arrayList.size());


        // RECORRER LISTA (3 FORMAS)


        System.out.println("\n--- FOR CLÁSICO ---");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("\n--- FOR-EACH ---");
        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("\n--- ITERATOR ---");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }



        // 2. LINKEDLIST (rápidas modificaciones, recorridos lentos y ordenación de introducción)

        // Estructura interna: nodos enlazados
        // ✔ Insertar/borrar en medio es muy rápido
        // ✔ Ideal para colas y pilas
        // ❌ Acceso por índice es lento (NO usar get(i) en bucles grandes)

        List<String> linkedList = new LinkedList<>();


        // AÑADIR ELEMENTOS

        linkedList.add("Madrid");
        linkedList.add("Sevilla");
        linkedList.add("Valencia");

        // insertar en posición concreta
        linkedList.add(1, "Barcelona");


        // ELIMINAR ELEMENTOS

        linkedList.remove("Madrid");
        linkedList.remove(0);


        // RECORRER LINKEDLIST (usar iterador)

        System.out.println("\n--- LINKEDLIST CON ITERATOR ---");
        Iterator<String> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }


        // TAMAÑO

        System.out.println("Tamaño del LinkedList: " + linkedList.size());

        /*
             Permiten duplicados
             Mantienen orden

        - ArrayList:
        "Lista para acceder por índice"
        → Acceso rápido por índice
        → Muchas lecturas, pocas inserciones en medio
        → Ejemplo: lista de alumnos, lista de tareas

        - LinkedList:
        "Lista con muchas inserciones/eliminaciones"
        → Muchas inserciones/eliminaciones en medio o al principio
        → Ejemplo: cola de clientes, historial de navegación

        */

    }
}

