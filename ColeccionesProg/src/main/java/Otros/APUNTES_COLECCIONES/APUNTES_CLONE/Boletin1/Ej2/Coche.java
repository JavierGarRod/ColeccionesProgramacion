package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_CLONE.Boletin1.Ej2;
public class Coche implements Cloneable {

    // ATRIBUTOS

    private String matricula;
    private String modelo;
    private int kilometraje;
    private Motor motor;


    // CONSTRUCTOR

    public Coche(String matricula, String modelo, int kilometraje, Motor motor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.motor = motor;
    }


    // GETTERS Y SETTERS

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    // CLONE

    @Override
    public Coche clone() {
        try {
            Coche copia = (Coche) super.clone();
            copia.motor = this.motor.clone();   // DEEP CLONE
            return copia;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // TOSTRING

    @Override
    public String toString() {
        return "Coche{" + matricula + ", " + modelo + ", km=" + kilometraje + ", " + motor + "}";
    }
}

