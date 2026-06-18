package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinENUM.Drones;

public class Ruta {

    // atributos
    String origen;
    String destino;
    double peso;
    EstadoPaquete estado; //  “Este paquete tiene un estado, y solo puede ser uno de esos cuatro.”

    // constructor
    public Ruta(String origen, String destino, double peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
        this.estado = EstadoPaquete.EN_PREPARACION; // Cuando se crea una ruta, el paquete siempre empieza en EN_PREPARACION.
    }

    // métodos
    public void cambiarEstado(EstadoPaquete nuevoEstado) {
        this.estado = nuevoEstado;
    }

    @Override public String toString() {
        return "Ruta{" +
                "origen='" +
                origen + '\'' +
                ", destino='" +
                destino + '\'' +
                ", peso=" + peso +
                ", estado=" +
                estado +
                '}';
    }
}

