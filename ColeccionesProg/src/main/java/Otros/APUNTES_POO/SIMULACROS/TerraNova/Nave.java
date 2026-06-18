package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.TerraNova;

import java.util.Objects;

public class Nave {
    //atributos

    private String id;
    private String modelo;
    private int horas_vuelo;
    private Comandante comandante;

    //constructor

    public Nave(String id, String modelo, int horas_vuelo, Comandante comandante) {
        this.id = id;
        this.modelo = modelo;
        this.horas_vuelo = horas_vuelo;
        this.comandante = comandante;
    }

    //getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHoras_vuelo() {
        return horas_vuelo;
    }

    public void setHoras_vuelo(int horas_vuelo) {
        this.horas_vuelo = horas_vuelo;
    }

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Nave nave)) return false;
        return Objects.equals(id, nave.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //toString

    @Override
    public String toString() {
        return id + "(" + modelo + ") - Cmd: " + comandante.getNombre();
    }
}
