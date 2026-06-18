package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.Ordenación;

class Persona implements Comparable<Persona> {

    //CompareTo compara atributos (órden natural de la lista) y Comparator compara dos objetos

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // ORDEN NATURAL → por nombre
    @Override
    public int compareTo(Persona o) {  //compareTo devuelve: negativo → this < o, 0 → iguales, positivo → this > o
        return this.nombre.compareTo(o.nombre);
    }

    /*

     1) Comparable (orden natural)
    -----------------------------
    - La clase implementa Comparable<T>
    - Sobrescribe compareTo()
    - Se usa cuando la clase tiene un orden "por defecto"

    Ejemplo:
    public int compareTo(Persona p) {
        return this.nombre.compareTo(p.nombre);
    }


    SE PUEDEN COMPARAR DOS COSAS CON CONDICIONES

    @Override
    public int compareTo(Persona o) {
        int resultado = this.edad.compareTo(o.edad);
        if (resultado != 0) {
             return resultado; // si las edades no son iguales, ya tenemos el orden y si son iguales, ordena por el nombre
        }
        return this.nombre.compareTo(o.nombre);
     }



    SE PUEDEN COMPARAR MÁS DE DOS COSAS SIN CONDICIONES (Comparator.comparing)

    @Override
    public int compareTo(Persona o) {
    return Comparator
            .comparing(Persona::getNombre)
            .thenComparing(Persona::getEdad)
            .thenComparing(Persona::getDni)
            .compare(this, o);
    }
*/

    @Override
    public String toString() {

        return nombre + " (" + edad + ")";
    }

}
