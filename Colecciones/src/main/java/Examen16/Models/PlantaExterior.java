package Models;

import Exception.GreenRootsException;

public class PlantaExterior extends Planta{
    private boolean resistenciaAHeladas;

    public PlantaExterior(double precioVenta, int stockDisponible, int stockMinimo, boolean resistenciaAHeladas) {
        super(precioVenta, stockDisponible, stockMinimo);
        this.resistenciaAHeladas = resistenciaAHeladas;
    }

    public PlantaExterior(String nombreCientifico, double precioVenta, boolean resistenciaAHeladas) {
        super(nombreCientifico, precioVenta);
        this.resistenciaAHeladas = resistenciaAHeladas;
    }

    @Override
    public double calcularValorStock() {
        double valorStock=0;
        if(resistenciaAHeladas){
            valorStock=getStockDisponible()*getPrecioVenta()*1.20;
        }
        else{
            valorStock=getStockDisponible()*getPrecioVenta();
        }
        return valorStock;
    }

    @Override
    public double calcularPrecioConDescuento(double porcentaje) {
        double precioUnitario=0;
        if(porcentaje<0 && porcentaje>100){
            throw new GreenRootsException("El porcentaje de descuento no es válido: " +porcentaje);
        }
        precioUnitario=getPrecioVenta()*porcentaje;
        return precioUnitario;
    }

    @Override
    public boolean esRentable() {
        boolean esRentable=false;
        if(calcularValorStock()>500){
            esRentable=true;
        }
        return esRentable;
    }

    @Override
    public String getResumen() {
        return "[REF-"+getCodRef()+"]"+getNombreCientifico()+" | Precio: "+getPrecioVenta()+"$ | Stock: "+getStockDisponible()+" uds | Rentable: "+esRentable()+"/Nota: "+calcularValorStock();
    }
}
