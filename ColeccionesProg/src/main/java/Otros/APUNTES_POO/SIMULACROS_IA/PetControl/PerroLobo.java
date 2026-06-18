package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.PetControl;

import java.time.LocalDate;

public class PerroLobo extends Animal implements Domestico,Salvaje{

    //constructor
    public PerroLobo(String nombre, LocalDate fecha, double peso) {
        super(nombre, fecha, peso);
    }

    // métodos
    @Override
    public void mostrar_info() {
        System.out.println("ID: " + getId() + " | Nombre: " + getNombre() + "| Peso: " + getPeso() + "| Fecha: " + getFecha());
    }

    @Override
    public double coste_mantenimiento_diario() {
        double coste = 4 * getPeso();
        return coste + 2;
    }

    @Override
    public void acariciar() {
        System.out.println("Me están acariciando!!");
    }

    @Override
    public void vigilar() {
        System.out.println("Siento que me están vigilando...");
    }

}
