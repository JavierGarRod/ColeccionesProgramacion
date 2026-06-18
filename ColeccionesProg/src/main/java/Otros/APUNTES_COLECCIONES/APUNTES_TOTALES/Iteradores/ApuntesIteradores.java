package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.Iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ApuntesIteradores {
    public static void main(String[] args) {

        // ¿POR QUÉ EXISTEN LOS ITERADORES?

        // ✔ Porque NO se puede eliminar/modificar una colección
        //   mientras la recorres con un for-each → ERROR
        //
        // Ejemplo prohibido:
        //
        // for (String s : lista) {
        //     lista.remove(s);  // ❌ ConcurrentModificationException
        // }
        //
        // ✔ Iterator permite eliminar elementos de forma SEGURA
        //   mientras recorres la colección.
        //
        // ✔ ListIterator además permite:
        //      - ir hacia atrás
        //      - añadir elementos
        //      - modificar elementos
        //
        // En resumen:
        // for-each → solo leer
        // Iterator → leer + eliminar
        // ListIterator → leer + eliminar + añadir + modificar + retroceder


        // 1. ITERATOR (recorrer y eliminar elementos de forma segura)

        // ✔ Sirve para recorrer cualquier colección (List, Set…)
        // ✔ Métodos importantes:
        //      hasNext() → ¿queda elemento?
        //      next()    → devuelve el siguiente
        //      remove()  → elimina el último devuelto por next()
        // ❌ No permite ir hacia atrás
        // ❌ No permite añadir elementos

        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Borrar");
        lista.add("Luis");

        System.out.println("\n--- ITERATOR: recorrer y eliminar ---");

        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            String elemento = it.next();
            System.out.println("Leyendo: " + elemento);

            if (elemento.equals("Borrar")) {
                it.remove(); // eliminación segura
                System.out.println("Elemento 'Borrar' eliminado");
            }
        }

        System.out.println("Lista final: " + lista);



        // 2. LISTITERATOR (solo para List, permite ir hacia atrás)

        // ✔ Solo funciona con List (ArrayList, LinkedList)
        // ✔ Permite:
        //      - avanzar
        //      - retroceder
        //      - añadir elementos
        //      - modificar elementos
        // ✔ Métodos extra:
        //      hasPrevious(), previous(), add(), set()

        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Bea");
        nombres.add("Carlos");

        System.out.println("\n--- LISTITERATOR: modificar elementos ---");

        ListIterator<String> lit = nombres.listIterator();

        while (lit.hasNext()) {
            String nombre = lit.next();

            if (nombre.equals("Bea")) {
                lit.set("Beatriz"); // modificar elemento actual
            }

            if (nombre.equals("Carlos")) {
                lit.add("Nuevo"); // añadir después del actual
            }
        }

        System.out.println("Lista modificada: " + nombres);



        // 3. LISTITERATOR HACIA ATRÁS


        System.out.println("\n--- LISTITERATOR: recorrer hacia atrás ---");

        ListIterator<String> lit2 = nombres.listIterator(nombres.size());
        // empieza al final

        while (lit2.hasPrevious()) {
            System.out.println("Hacia atrás: " + lit2.previous());
        }


        // 4. RECORRER OBJETOS CON ITERATOR (ejemplo importante)

        // ✔ Puedes recorrer objetos igual que Strings
        // ✔ Puedes acceder a sus atributos (nombre, edad…)
        // ✔ Puedes eliminar objetos mientras recorres

        System.out.println("\n--- ITERATOR: recorrer objetos Persona ---");

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 20));
        personas.add(new Persona("Luis", 30));
        personas.add(new Persona("Bea", 25));

        Iterator<Persona> itPersonas = personas.iterator();

        while (itPersonas.hasNext()) {
            Persona p = itPersonas.next();

            // Acceder a atributos del objeto
            System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.getEdad());

            // Ejemplo: eliminar personas menores de 25
            if (p.getEdad() < 25) {
                itPersonas.remove();
                System.out.println("Eliminada: " + p.getNombre());
            }
        }

        System.out.println("Personas finales: " + personas);


        // 5. ¿POR QUÉ NO SE PUEDE ELIMINAR EN UN FOR-EACH?

        // ❌ Esto lanza ConcurrentModificationException:
        //
        // for (String s : lista) {
        //     lista.remove(s); // ERROR
        // }
        //
        // ✔ Solución → usar Iterator.remove()

        System.out.println("\n--- Recordatorio: eliminar en for-each es ilegal ---");
        System.out.println("Usa Iterator.remove() para eliminar mientras recorres.");
    }


}

