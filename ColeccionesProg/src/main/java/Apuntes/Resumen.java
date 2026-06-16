package Apuntes;

public class Resumen {
/*
========================================
COLECCIONES EN JAVA - RESUMEN COMPLETO
========================================

IMPORTACIÓN GENERAL

import java.util.*;

========================================
1. ARRAYLIST
========================================

Características:
- Permite duplicados.
- Mantiene orden de inserción.
- Acceso por índice.
- Muy utilizada.

Creación:
ArrayList<String> lista = new ArrayList<>();

Añadir:
lista.add("Juan");
lista.add("Ana");

Añadir en posición:
lista.add(1, "Pedro");

Obtener:
lista.get(0);

Modificar:
lista.set(0, "Carlos");

Eliminar por índice:
lista.remove(0);

Eliminar por valor:
lista.remove("Ana");

Buscar:
lista.contains("Juan");

Tamaño:
lista.size();

Vaciar:
lista.clear();

Comprobar si está vacía:
lista.isEmpty();

Recorrer:
for(String nombre : lista){
    System.out.println(nombre);
}

for(int i=0;i<lista.size();i++){
    System.out.println(lista.get(i));
}

========================================
2. LINKEDLIST
========================================

Características:
- Permite duplicados.
- Mantiene orden.
- Mejor para inserciones/eliminaciones frecuentes.

Creación:
LinkedList<String> lista = new LinkedList<>();

Métodos especiales:

lista.addFirst("Juan");
lista.addLast("Pedro");

lista.getFirst();
lista.getLast();

lista.removeFirst();
lista.removeLast();

========================================
3. HASHSET
========================================

Características:
- NO permite duplicados.
- NO mantiene orden.

Creación:
HashSet<String> set = new HashSet<>();

Añadir:
set.add("Juan");
set.add("Ana");

Buscar:
set.contains("Juan");

Eliminar:
set.remove("Ana");

Recorrer:
for(String nombre : set){
    System.out.println(nombre);
}

========================================
4. LINKEDHASHSET
========================================

Características:
- NO permite duplicados.
- Mantiene orden de inserción.

Creación:
LinkedHashSet<String> set =
        new LinkedHashSet<>();

========================================
5. TREESET
========================================

Características:
- NO permite duplicados.
- Ordena automáticamente.

Creación:
TreeSet<Integer> numeros =
        new TreeSet<>();

Añadir:
numeros.add(10);
numeros.add(3);
numeros.add(20);

Resultado:
[3,10,20]

Primer elemento:
numeros.first();

Último elemento:
numeros.last();

Mayor que:
numeros.higher(10);

Menor que:
numeros.lower(10);

========================================
6. HASHMAP
========================================

Características:
- Clave -> Valor
- Claves únicas.
- Muy rápido.

Creación:
HashMap<String,String> mapa =
        new HashMap<>();

Insertar:
mapa.put("123A","Juan");
mapa.put("456B","Ana");

Obtener:
mapa.get("123A");

Modificar:
mapa.put("123A","Carlos");

Eliminar:
mapa.remove("123A");

Buscar clave:
mapa.containsKey("123A");

Buscar valor:
mapa.containsValue("Ana");

Tamaño:
mapa.size();

Recorrer claves:
for(String clave : mapa.keySet()){
    System.out.println(clave);
}

Recorrer valores:
for(String valor : mapa.values()){
    System.out.println(valor);
}

Recorrer todo:
for(Map.Entry<String,String> e : mapa.entrySet()){

    System.out.println(
        e.getKey() + " -> " +
        e.getValue()
    );
}

========================================
7. LINKEDHASHMAP
========================================

Características:
- Mantiene orden de inserción.

Creación:
LinkedHashMap<Integer,String> mapa =
        new LinkedHashMap<>();

========================================
8. TREEMAP
========================================

Características:
- Ordena automáticamente por clave.

Creación:
TreeMap<Integer,String> mapa =
        new TreeMap<>();

Métodos:

mapa.firstKey();

mapa.lastKey();

mapa.higherKey(10);

mapa.lowerKey(10);

========================================
9. QUEUE
========================================

FIFO:
First In First Out

Creación:
Queue<String> cola =
        new LinkedList<>();

Añadir:
cola.offer("Juan");
cola.offer("Ana");

Ver primero:
cola.peek();

Eliminar primero:
cola.poll();

========================================
10. PRIORITYQUEUE
========================================

Características:
- Ordena automáticamente.

Creación:
PriorityQueue<Integer> cola =
        new PriorityQueue<>();

cola.offer(10);
cola.offer(1);
cola.offer(20);

peek() devuelve:
1

========================================
11. ITERATOR
========================================

Creación:
Iterator<String> it =
        lista.iterator();

Recorrido:

while(it.hasNext()){

    String valor = it.next();

    System.out.println(valor);
}

Eliminar mientras recorres:

while(it.hasNext()){

    String valor = it.next();

    if(valor.equals("Juan")){
        it.remove();
    }
}

========================================
12. COLLECTIONS
========================================

Ordenar:
Collections.sort(lista);

Invertir:
Collections.reverse(lista);

Mezclar:
Collections.shuffle(lista);

Máximo:
Collections.max(lista);

Mínimo:
Collections.min(lista);

========================================
13. COMPARABLE
========================================

Sirve para definir el orden natural
de una clase.

Implementación:

public class Persona
implements Comparable<Persona>{

    private String nombre;
    private int edad;

    @Override
    public int compareTo(Persona p){

        return Integer.compare(
                this.edad,
                p.edad
        );
    }
}

compareTo devuelve:

< 0 -> menor
= 0 -> igual
> 0 -> mayor

Ordenar:

Collections.sort(listaPersonas);

Se usa mucho en:
- Collections.sort()
- TreeSet
- TreeMap

========================================
14. COMPARATOR
========================================

Permite varios criterios de ordenación.

Ejemplo:

Comparator<Persona> compEdad =
        new Comparator<Persona>() {

    @Override
    public int compare(
            Persona p1,
            Persona p2) {

        return Integer.compare(
                p1.edad,
                p2.edad
        );
    }
};

Uso:

Collections.sort(
        personas,
        compEdad
);

========================================
15. COMPARATOR CON LAMBDA
========================================

personas.sort(
    (p1,p2) ->
        Integer.compare(
            p1.edad,
            p2.edad
        )
);

========================================
16. COMPARATOR.COMPARING
========================================

Ordenar por nombre:

personas.sort(
    Comparator.comparing(
        Persona::getNombre
    )
);

Ordenar por edad:

personas.sort(
    Comparator.comparing(
        Persona::getEdad
    )
);

Orden descendente:

personas.sort(
    Comparator
        .comparing(Persona::getEdad)
        .reversed()
);

========================================
17. VARIOS CRITERIOS
========================================

Primero edad y luego nombre:

personas.sort(
    Comparator
        .comparing(Persona::getEdad)
        .thenComparing(
            Persona::getNombre
        )
);

========================================
18. TREESET CON COMPARATOR
========================================

TreeSet<Persona> personas =
    new TreeSet<>(
        (p1,p2) ->
            p1.getNombre()
              .compareTo(
                  p2.getNombre()
              )
    );

========================================
19. TREEMAP CON COMPARATOR
========================================

TreeMap<Persona,String> mapa =
    new TreeMap<>(
        (p1,p2) ->
            p1.getNombre()
              .compareTo(
                  p2.getNombre()
              )
    );

========================================
20. RESUMEN EXAMEN
========================================

ArrayList:
- Duplicados.
- Orden de inserción.

LinkedList:
- Duplicados.
- Mejor para insertar/eliminar.

HashSet:
- Sin duplicados.
- Sin orden.

LinkedHashSet:
- Sin duplicados.
- Mantiene orden.

TreeSet:
- Sin duplicados.
- Ordenado.

HashMap:
- Clave-valor.
- Muy rápido.

LinkedHashMap:
- Clave-valor.
- Mantiene orden.

TreeMap:
- Clave-valor.
- Ordenado.

Queue:
- FIFO.

PriorityQueue:
- Cola con prioridad.

Comparable:
- compareTo()
- Orden natural.

Comparator:
- compare()
- Orden personalizado.

Collections.sort():
- Ordena listas.

TreeSet y TreeMap:
- Necesitan Comparable o Comparator.
*/
}
