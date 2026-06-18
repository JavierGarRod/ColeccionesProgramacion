package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.Coches;

public class Sensores {

    private double distanciaObstaculo;
    private double velocidad;

    public Sensores(double distanciaObstaculo, double velocidad) {
        this.distanciaObstaculo = distanciaObstaculo;
        this.velocidad = velocidad;
    }

    public boolean avisarObstaculo() {
        if (distanciaObstaculo < 50) {
            System.out.println("OBSTÁCULO CERCANO!!!");
            return true;
        }
        return false;
    }

    public boolean avisarVelocidad() {
        if (velocidad > 120) {
            System.out.println("VELOCIDAD SUPERIOR A 120!!!");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Distancia: " + distanciaObstaculo + "cm, Velocidad: " + velocidad + "km/h";
    }
}

