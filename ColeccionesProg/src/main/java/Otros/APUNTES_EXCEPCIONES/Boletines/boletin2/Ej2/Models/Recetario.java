package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin2.Ej2.Models;

import APUNTES_EXCEPCIONES.Boletines.boletin2.Ej2.Exceptions.RecetarioException;

public class Recetario {

    //atributos
    private Receta[] recetas;
    private int numRecetas;

    //constructor
    public Recetario() {
        this.recetas = new Receta[50];
    }

    //métodos

    public boolean addReceta(Receta r) {
        if (numRecetas >= recetas.length) {
            return false;
        } else {
            recetas[numRecetas] = r;
            numRecetas++;
            return true;
        }
    }

    public Receta buscar(String nombre) throws RecetarioException { // LAS BÚSQUEDAS SIEMPRE CON WHILE
        boolean encontrado = false;
        int i = 0;
        Receta r = null;

        while (!encontrado && i < numRecetas) {
            if (recetas[i].getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                r = recetas[i];
            } else {
                i++;
            }

        }
        if (!encontrado) {
            throw new RecetarioException ("\nLa receta " + nombre + " no existe en el recetario");
        }
        return r;
    }
}



