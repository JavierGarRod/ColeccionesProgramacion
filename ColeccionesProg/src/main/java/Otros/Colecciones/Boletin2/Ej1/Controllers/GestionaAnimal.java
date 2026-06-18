package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin2.Ej1.Controllers;

import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin2.Ej1.Models.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GestionaAnimal {
    public static void main(String[] args) {
        RepositorioAnimal repo = new RepositorioAnimal("FaunaWorld", "Madrid", 50000);

        repo.agregarAnimal(new Animal(1, "Aqua", "León", 5, ClasificacionComida.CARNIVOROS,
                LocalDate.of(2019, 3, 10), 190.5, Medio.TIERRA, ClasificacionGestacion.VIVIPAROS));

        repo.agregarAnimal(new Animal(2, "Aqua", "Delfín", 8, ClasificacionComida.CARNIVOROS,
                LocalDate.of(2016, 7, 21), 150.0, Medio.AGUA, ClasificacionGestacion.VIVIPAROS));

        repo.agregarAnimal(new Animal(3, "Bambi", "Ciervo", 2, ClasificacionComida.HERVIBOROS,
                LocalDate.of(2022, 5, 2), 60.0, Medio.TIERRA, ClasificacionGestacion.VIVIPAROS));

        System.out.println("=== Animales iniciales ===");
        repo.mostrarAnimales();

        System.out.println("\nModificando nombre del animal con ID 3...\n");
        repo.modificarNombreAnimal(3, "Cervatillo");

        System.out.println("=== Animales tras modificación ===");
        repo.mostrarAnimales();

        System.out.println("\n=== Animales ordenados por nombre y fecha de nacimiento ===");
        List<Animal> animalesLista = repo.pasoDeTreeSetAList();

        Collections.sort(animalesLista,new ComparadorNombreFechaAnimal());
        System.out.println(animalesLista);
    }
}
