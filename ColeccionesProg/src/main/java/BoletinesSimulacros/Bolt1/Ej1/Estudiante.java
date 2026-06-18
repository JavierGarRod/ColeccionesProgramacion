package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej1;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String id;
    private ArrayList<Nota> notas;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(double n) {
        notas.add(new Nota(n));
    }

    public double promedio() {
        double suma = 0;
        for (Nota n : notas) suma += n.getValor();
        return notas.size() == 0 ? 0 : suma / notas.size();
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return nombre + " (" + id + ") Promedio: " + promedio();
    }
}
