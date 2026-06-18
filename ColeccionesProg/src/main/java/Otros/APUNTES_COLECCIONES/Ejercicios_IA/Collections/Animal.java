package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.Ejercicios_IA.Collections;

import java.util.*;

public abstract class Animal implements Comparable<Animal>{

    //atributos
    private int id;
    private static int contador;
    private String nombre;
    private int edad;
    private double peso;
    private TipoSangre tipe_blood;
    private List<String> notas_medicas;
    private Set<String> alergias;
    private Set<String> vacunas;

    //constructor
    public Animal(String nombre, int edad, double peso, TipoSangre tipe_blood) {
        this.id = contador++;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tipe_blood = tipe_blood;
        this.notas_medicas = new ArrayList<>();
        this.alergias = new LinkedHashSet<>();
        this.vacunas = new LinkedHashSet<>();
    }

    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipe_blood() {
        return tipe_blood;
    }

    public void setTipe_blood(TipoSangre tipe_blood) {
        this.tipe_blood = tipe_blood;
    }

    public List<String> getNotas_medicas() {
        return notas_medicas;
    }

    public void setNotas_medicas(List<String> notas_medicas) {
        this.notas_medicas = notas_medicas;
    }

    public Set<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(Set<String> alergias) {
        this.alergias = alergias;
    }

    public Set<String> getVacunas() {
        return vacunas;
    }

    public void setVacunas(Set<String> vacunas) {
        this.vacunas = vacunas;
    }

    // toString

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", contador=" + contador +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", tipe_blood=" + tipe_blood +
                ", notas_medicas=" + notas_medicas +
                ", alergias=" + alergias +
                ", vacunas=" + vacunas +
                '}';
    }

    //métodos
    public abstract String emitirSonido();

    //compareTo

    @Override
    public int compareTo(Animal o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    //equals y hashcode


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return id == animal.id && Objects.equals(nombre, animal.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}
