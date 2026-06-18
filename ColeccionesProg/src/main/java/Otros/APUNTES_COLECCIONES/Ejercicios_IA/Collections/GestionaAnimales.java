package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.Ejercicios_IA.Collections;

public class GestionaAnimales {
        public static void main(String[] args) {
            menu();   // ✔ El main solo llama a la función menu
        }

        public static void menu() {

            // Crear repositorio
            RepositorioAnimal repo = new RepositorioAnimal();

            // Crear animales
            Animal a1 = new Perro("Luna1", "Yin", 12, 3.6, TipoSangre.A);
            Animal a2 = new Tortuga("Manolo", 10, 2.3, TipoSangre.O);
            Animal a3 = new Perro("Rex1", "Yang", 6, 4, TipoSangre.B);

            // Registrar animales en el repositorio
            repo.add_animal(a1);
            repo.add_animal(a2);
            repo.add_animal(a3);

            // Mostrar animales ordenados
            System.out.println("=== ANIMALES ORDENADOS ===");
            repo.mostrar_ordenado();

            // Consultar animal por ID
            System.out.println("\n=== CONSULTA POR ID ===");
            int idBuscado = a2.getId();
            Animal encontrado = repo.consultar_datos(idBuscado);
            if (encontrado != null) {
                System.out.println("Encontrado: " + encontrado);
            }

            // Modificar datos
            System.out.println("\n=== MODIFICAR NOMBRE ===");
            repo.modificar_datos(a1.getId(), "LunaRenombrada");

            // Mostrar de nuevo para ver el cambio
            System.out.println("\n=== ANIMALES TRAS MODIFICAR ===");
            repo.mostrar_ordenado();

            // Emitir sonidos
            System.out.println("\n=== SONIDOS ===");
            a1.emitirSonido();
            a2.emitirSonido();
            a3.emitirSonido();

            // Registrar adopción (solo perros)
            System.out.println("\n=== ADOPCIÓN ===");
            if (a1 instanceof Adoptable adoptable) {
                adoptable.registrarAdopcion("Familia García");
                System.out.println("Perro adoptado por Familia García");
            }

            // Comprobación final
            System.out.println("\n=== CONSULTA FINAL ===");
            System.out.println(repo.consultar_datos(a1.getId()));
        }
    }


