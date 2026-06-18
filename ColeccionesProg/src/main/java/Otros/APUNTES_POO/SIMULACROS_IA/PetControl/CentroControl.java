package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.PetControl;

import java.time.LocalDate;

public class CentroControl {

    public static void main(String[] args) {

        // Crear centro
        Centro centro = new Centro();

        // Crear animales
        Animal a1 = new Perro("Darkness", LocalDate.of(2020, 12, 21), 5.68);
        Animal a2 = new Lobo("Jacob", LocalDate.now(), 80.9);
        Animal a3 = new PerroLobo("Vanroll", LocalDate.of(2000, 1, 30), 7.2);
        Animal a4 = new PerroLobo("Nejiré", LocalDate.of(2012, 6, 26), 14.2);

        // Registrar animales en el centro
        centro.registrarAnimal(a1);
        centro.registrarAnimal(a2);
        centro.registrarAnimal(a3);
        centro.registrarAnimal(a4);

        // Mostrar información de cada animal
        System.out.println("=== ANIMALES REGISTRADOS ===");
        for (Animal a : centro.getAnimales()) {
            if (a == null) continue;

            a.mostrar_info();
            System.out.println("Coste diario: " + a.coste_mantenimiento_diario());

            if (a instanceof Domestico d) d.acariciar();
            if (a instanceof Salvaje s) s.vigilar();

            System.out.println();
        }

        // Mostrar coste total del centro
        System.out.println("Coste total del centro: " + centro.suma());

        // Mostrar cuántos animales se han creado (ID máximo)
        System.out.println("Total animales creados: " + (a4.getId()));
    }
}

