package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin2.Ej2.Models;

import APUNTES_EXCEPCIONES.Boletines.boletin2.Ej2.Exceptions.CocinaException;

public class Receta {

    //atributos
    private int id;
    private static int contador;
    private String nombre;
    private String[] ingredientes; // mejor ingrediente[] ingredientes
    private double [] cantidades;

    private int numIngredientes;

    //constructor
    public Receta(String nombre) {
        this.ingredientes = new String[30];
        this.cantidades = new double[30];
        this.nombre = nombre;
        this.id = contador++;
    }

    //métodos
    public boolean addIngrediente(String nombreIng, double cantidad){
        if (numIngredientes >= ingredientes.length){
            return false;
        }
        else{
            ingredientes[numIngredientes] = nombreIng;
            cantidades[numIngredientes] = cantidad;
            numIngredientes++;
            return true;
        }

    }

    public double[] cocinar(int comensales) throws CocinaException {
        double[] tabla = new double[30];

        if(comensales <= 0){
            throw new CocinaException("\nNúmero de comensales inválido");
        }
        else if (comensales > 1000){
            throw new CocinaException("\nNúmero de comensales inválido");
        }
        else{
            System.out.println("\nCocinando "+ nombre + " para " + comensales + " comensales:");

            for (int i = 0; i < numIngredientes; i++) {
                tabla [i]  = cantidades[i] * comensales;
                System.out.println("- " + ingredientes[i] + ": " + tabla[i]);
            }
        }
        return tabla;
    }

    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double[] getCantidades() {
        return cantidades;
    }

    public void setCantidades(double[] cantidades) {
        this.cantidades = cantidades;
    }
}
