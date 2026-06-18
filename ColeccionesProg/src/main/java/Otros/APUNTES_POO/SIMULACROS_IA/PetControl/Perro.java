package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.PetControl;

import java.time.LocalDate;

public class Perro extends Animal implements Domestico{

    //constructor
    public Perro(String nombre, LocalDate fecha, double peso) {
        super(nombre, fecha, peso);
    }

    // métodos
    @Override
    public void mostrar_info() {
        System.out.println("ID: " + getId() + " | Nombre: " + getNombre() + "| Peso: " + getPeso() + "| Fecha: " + getFecha());
    }

    @Override
    public double coste_mantenimiento_diario() {
        double coste = 3 * getPeso();
        return coste;
    }

    @Override
    public void acariciar() {
        System.out.println("Me están acariciando!!");
    }
}
