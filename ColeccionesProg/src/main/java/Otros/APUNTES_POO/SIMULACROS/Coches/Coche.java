package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.Coches;

import java.util.Objects;

public class Coche {

    private String marca;
    private String modelo;
    private String matricula;
    private Conductor dueno;
    private EstadoCoche estado;
    private Sensores sensores;

    public Coche(String marca, String modelo, String matricula, Conductor dueno, Sensores sensores) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.dueno = dueno;
        this.sensores = sensores;
        this.estado = EstadoCoche.APAGADO; // ✔ estado inicial correcto
    }

    // Solo el dueño puede arrancar
    public void arrancar(Conductor c) {
        if (!c.equals(dueno)) {
            System.out.println("Solo el dueño puede arrancar este coche");
        }

        if (sensores.avisarObstaculo()) {
            System.out.println("No se puede arrancar: obstáculo cercano");
        }

        estado = EstadoCoche.ARRANCADO;
        System.out.println("Coche arrancado");
    }

    public void apagar() {
        if (estado == EstadoCoche.ARRANCADO) {
            estado = EstadoCoche.APAGADO;
            System.out.println("Coche apagado");
        } else {
            System.out.println("El coche ya está apagado");
        }
    }

    // Método que pide el enunciado
    public void verificarSiDebeParar() {

        do {

            if (sensores.avisarObstaculo()) {
                System.out.println("Peligro detectado. Parando coche...");
                estado = EstadoCoche.APAGADO;
            } else {
                estado = EstadoCoche.ARRANCADO;
            }
        } while (estado == EstadoCoche.ARRANCADO) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coche coche)) return false;
        return Objects.equals(matricula, coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + matricula + ") - Estado: " + estado;
    }
}

