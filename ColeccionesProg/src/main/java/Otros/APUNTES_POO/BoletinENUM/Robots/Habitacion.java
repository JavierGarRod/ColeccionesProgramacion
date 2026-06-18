package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinENUM.Robots;

public class Habitacion {

    // atributos
    String nombre;
    double tamaño;
    double nvl_suciedad;
    EstadoHabitacion estado; // un robot guarda una habitación completa, no un número (int)

    // constructor

    public Habitacion(String nombre, double tamaño, double nvl_suciedad) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.nvl_suciedad = nvl_suciedad;
        this.estado = EstadoHabitacion.LIBRE;
    }

    // métodos

    public void ponerEnLimpieza() {
        this.estado = EstadoHabitacion.LIMPIANDO;
    }
}
