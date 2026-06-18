package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej3;

import java.util.Objects;

public abstract class Robot {

    // atributos
    private int id;
    private static int contador;
    private String modelo;
    private int bateria;
    private Estado estado;
    private String combustible;
    private String descripcion;

    //constructor
    public Robot(String modelo, int bateria, String combustible, String descripcion) {
        this.modelo = modelo;
        this.bateria = bateria;
        this.combustible = combustible;
        this.descripcion = descripcion;
        this.id = contador++;
        this.estado = Estado.APAGADO;
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

    public static void setContador(int contador) {
        Robot.contador = contador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // equals y hashcode
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Robot robot)) return false;
        return id == robot.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // métodos
    public boolean bateria_suficiente(){
        if(bateria < 10){
            System.out.println("Batería insuficiente");
            return false;
        }
        System.out.println("Batería suficiente");
        return true;
    }

    public abstract void ejecutarTarea();
    public abstract boolean recargar();

    // toString
    @Override
    public String toString() {
        return id +
                " | " + this.getClass().getSimpleName() + //nombre de la clase
                " | "+ bateria +
                " | " + estado;
    }
}
