package Models;

public interface Comerciable {
    public double calcularPrecioConDescuento(double porcentaje);

    public boolean esRentable();

    public String getResumen();
}
