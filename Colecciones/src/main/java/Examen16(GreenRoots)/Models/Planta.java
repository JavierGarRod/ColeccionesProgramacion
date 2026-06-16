package Models;

import Exception.GreenRootsException;

public abstract class Planta implements Comerciable{
    public static int contador=0;
    private int codRef;
    private String nombreCientifico;
    private double precioVenta;
    private int stockDisponible;
    private int stockMinimo;
    private Estado estado;

    public Planta(double precioVenta, int stockDisponible, int stockMinimo) {
        this.codRef = contador++;
        this.precioVenta = precioVenta;
        this.stockDisponible = stockDisponible;
        this.stockMinimo = stockMinimo;
    }

    public Planta(double precioVenta, int stockDisponible) {
        this.codRef = contador++;
        this.precioVenta = precioVenta;
        this.stockDisponible = stockDisponible;
    }

    public Planta(String nombreCientifico, double precioVenta) {
        this.nombreCientifico = nombreCientifico;
        this.precioVenta = precioVenta;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Planta.contador = contador;
    }

    public int getCodRef() {
        return codRef;
    }

    public void setCodRef(int codRef) {
        this.codRef = codRef;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public void validacion(){
        if(precioVenta<=0 || stockDisponible<0 || stockMinimo<=0 || nombreCientifico==null){
            throw new GreenRootsException("Las condiciones de validez son: precio de venta mayor que cero, stock disponible mayor que cero, stock mínimo mayor a cero y el nombre científico no nulo o vacío");
        }
    }

    @Override
    public String toString() {
        return "Planta{" +
                "codRef=" + codRef +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                ", precioVenta=" + precioVenta +
                ", stockDisponible=" + stockDisponible +
                ", estado=" + estado +
                '}';
    }

    public void modificarEstado(Estado nuevoEstado){
        if(estado==null){
            estado=nuevoEstado;
        }
        else if(estado.equals(Estado.DISPONIBLE)){
            if(nuevoEstado.equals(Estado.RESERVADA)){
                estado=nuevoEstado;
            }
            else if(nuevoEstado.equals(Estado.AGOTADA)){
                estado=nuevoEstado;
            }
            else if(nuevoEstado.equals(Estado.RETIRADA)){
                estado=nuevoEstado;
            }
            else{
                throw new GreenRootsException("No es posible cambiar el estado a VENDIDA");
            }
        }
        else if(estado.equals(Estado.RESERVADA)){
            if(nuevoEstado.equals(Estado.VENDIDA)){
                estado=nuevoEstado;
            }
            else if(nuevoEstado.equals(Estado.DISPONIBLE)){
                estado=nuevoEstado;
            }
            else{
                throw new GreenRootsException("No es posible cambiar el estado a RETIRADA O AGOTADA");
            }
        }
        else if(estado.equals(Estado.AGOTADA)){
            if(nuevoEstado.equals(Estado.DISPONIBLE)){
                estado=nuevoEstado;
            }
            else{
                throw new GreenRootsException("No es posible cambiar el estado a RESERVADA, VENDIDA O RETIRADA");
            }
        }
        else{
            throw new GreenRootsException("No es posible cambiar este estado");
        }
    }

    public void vender(int cantidad){
        stockDisponible=-cantidad;
        if(cantidad<=0 || stockDisponible<stockMinimo){
            throw new GreenRootsException("No es posible hacer esta operación. Prueba con otros valores");
        }
    }

    public abstract double calcularValorStock();
}
