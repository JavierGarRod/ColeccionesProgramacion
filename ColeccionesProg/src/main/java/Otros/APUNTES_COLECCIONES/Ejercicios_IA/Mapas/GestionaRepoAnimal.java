package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.Ejercicios_IA.Mapas;

import java.util.List;
import java.util.Map;

public class GestionaRepoAnimal {

    public static void main(String[] args) {
        // 1. Instanciamos el repositorio
        repoAnimal miRepo = new repoAnimal();

        // 2. Creamos algunos animales de prueba
        Animal a1 = new Animal("Bobby", 12, 25.5, "Perro", Estado.SALUDABLE);
        Animal a2 = new Animal("Rex", 5, 30.0, "Perro", Estado.ALTA);
        Animal a3 = new Animal("Misifú", 3, 4.5, "Gato", Estado.EN_TRATAMIENTO);
        Animal a4 = new Animal("Dumbo", 15, 500.0, "Elefante", Estado.ALTA);
        Animal a5 = new Animal("Garfield", 8, 10.2, "Gato", Estado.SALUDABLE);

        // 3. Los añadimos al repo
        miRepo.addAnimal(a1);
        miRepo.addAnimal(a2);
        miRepo.addAnimal(a3);
        miRepo.addAnimal(a4);
        miRepo.addAnimal(a5);

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("Conteos: " + miRepo.contarAnimalesPorEspecie());

        // 4. Probar: Obtener animales mayores de 10 años
        System.out.println("\n--- ANIMALES MAYORES DE 10 AÑOS ---");
        List<Animal> viejitos = miRepo.obtenerAnimalesMayores();
        for (Animal a : viejitos) {
            System.out.println(a);
        }

        // 5. Probar: Animal más pesado de una especie
        System.out.println("\n--- EL GATO MÁS PESADO ---");
        Animal gatoGordo = miRepo.obtenerMasPesado("Gato");

        if (gatoGordo != null) {
            System.out.println("El gato más pesado es: " + gatoGordo);
        } else {
            System.out.println("No se ha encontrado ningún gato en el sistema.");
        }

        // 6. Probar: Dar de alta (Borrar con Iterator)
        System.out.println("\n--- DANDO DE ALTA ANIMALES (Limpieza) ---");
        miRepo.darDeAltaAnimales();

        System.out.println("--- ESTADO TRAS LAS ALTAS ---");
        // Deberían haber desaparecido Rex y Dumbo
        Map<String, Integer> conteoFinal = miRepo.contarAnimalesPorEspecie();
        System.out.println("Conteos finales: " + conteoFinal);

        // Comprobación específica: ¿Qué pasó con el elefante?
        System.out.println("¿Queda algún Elefante?: " + conteoFinal.containsKey("Elefante"));
    }
}
