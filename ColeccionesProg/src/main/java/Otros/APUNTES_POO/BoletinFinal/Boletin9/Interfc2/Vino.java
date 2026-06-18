package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc2;

import java.time.LocalDate;

public class Vino extends Producto implements Liquido, Alimento, Descuento {

    private String marca;
    private TipoVino tipo;
    private double grados;
    private double volumen;
    private String envase;
    private double descuento;
    private LocalDate caducidad;

    public Vino(String id, String nombre, String descripcion,
                double peso, double precioCompra, double precioVenta,
                String marca, TipoVino tipo, double grados) {

        super(id, nombre, descripcion, peso, precioCompra, precioVenta, 0.21);
        this.marca = marca;
        this.tipo = tipo;
        this.grados = grados;
    }

    // Liquido
    public void setVolumen(double v) {
        volumen = v;
    }
    public double getVolumen() { return volumen; }
    public void setTipoEnvase(String env) {
        envase = env;
    }
    public String getTipoEnvase() { return envase; }

    // Alimento
    public void setCaducidad(LocalDate fecha) {
        caducidad = fecha;
    }

    public LocalDate getCaducidad() { return caducidad; }
    public int getCalorias() {
        return (int)(grados * 10);
    }

    // Descuento
    public void setDescuento(double des) { descuento = des; }
    public double getDescuento() { return descuento; }
    public double getPrecioDescuento() {
        return precioVenta * (1 - descuento); }
}

