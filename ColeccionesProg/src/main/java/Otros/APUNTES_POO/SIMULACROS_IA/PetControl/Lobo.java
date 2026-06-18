package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.PetControl;

import java.time.LocalDate;

public class Lobo extends Animal implements Salvaje{

    //constructor
    public Lobo(String nombre, LocalDate fecha, double peso) {
        super(nombre, fecha, peso);
    }

    // métodos
    @Override
    public void mostrar_info() {
        System.out.println("ID: " + getId() + " | Nombre: " + getNombre() + "| Peso: " + getPeso() + "| Fecha: " + getFecha());
    }

    @Override
    public double coste_mantenimiento_diario() {
        double coste = 5 * getPeso();
        return coste;
    }

    @Override
    public void vigilar() {
        System.out.println("Siento que me están vigilando...");
    }
}
