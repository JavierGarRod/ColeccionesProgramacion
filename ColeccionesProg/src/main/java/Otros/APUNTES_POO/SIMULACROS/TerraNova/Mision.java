package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS.TerraNova;

import java.time.LocalDate;

public abstract class Mision {

    //atributos
    private int cod;
    private String nombre;
    private LocalDate fecha_lanz;
    private Nave nave;
    private EstadoMision estado;

    //constructor
    public Mision(int cod, String nombre, LocalDate fecha_lanz, Nave nave) {
        this.cod = cod;
        this.nombre = nombre;
        this.nave = nave;
        this.estado = EstadoMision.PLANIFICADA;
        setFecha_lanz(fecha_lanz);
    }

    //getters y setters

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_lanz() {
        return fecha_lanz;
    }

    public void setFecha_lanz(LocalDate fecha_lanz) { //validacion
        if (fecha_lanz.isBefore(LocalDate.now())){
            System.out.println("ERROR: La fecha no puede ser pasada");
        }
        else{
            this.fecha_lanz = fecha_lanz;
        }
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public EstadoMision getEstado() {
        return estado;
    }

    public void setEstado(EstadoMision estado) {
        this.estado = estado;
    }

    //metodos
    public abstract boolean mision_riesgo(); // un metodo abstracto no puede ser privado

    //toString

    @Override
    public String toString() {
        return  cod + ":" + nombre + " - " + fecha_lanz + "(" + estado + ") ->" + nave.getId();
    }
}
