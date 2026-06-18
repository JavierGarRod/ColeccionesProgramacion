package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc2;

public abstract class Producto {

    protected String id;
    protected String nombre;
    protected String descripcion;
    protected double peso;
    protected double precioCompra;
    protected double precioVenta;
    protected double iva;

    public Producto(String id, String nombre, String descripcion,
                    double peso, double precioCompra, double precioVenta, double iva) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.iva = iva;
    }

    public double precioNeto() {
        return precioVenta;
    }

    public double precioBruto() {
        return precioVenta * (1 + iva);
    }

    @Override
    public String toString() {
        return id + " | " + nombre + " | " + descripcion +
                " | Peso: " + peso +
                " | Precio neto: " + precioNeto() +
                " | Precio bruto: " + precioBruto();
    }
}


