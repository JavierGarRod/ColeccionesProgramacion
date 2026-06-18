package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc2;

public class Detergente extends Producto implements Liquido, Descuento {

    private String marca;
    private TipoDetergente tipo;
    private TipoRopa ropa;
    private double volumen;
    private String envase;
    private double descuento;

    public Detergente(String id, String nombre, String descripcion,
                      double peso, double precioCompra, double precioVenta,
                      String marca, TipoDetergente tipo, TipoRopa ropa) {

        super(id, nombre, descripcion, peso, precioCompra, precioVenta, 0.21);
        this.marca = marca;
        this.tipo = tipo;
        this.ropa = ropa;
    }

    // Liquido
    public void setVolumen(double v) { this.volumen = v; }
    public double getVolumen() { return volumen; }
    public void setTipoEnvase(String env) {
        this.envase = env;
    }
    public String getTipoEnvase() { return envase; }

    // Descuento
    public void setDescuento(double des) {
        this.descuento = des;
    }
    public double getDescuento() { return descuento; }
    public double getPrecioDescuento() { return precioVenta * (1 - descuento); }
}


