package Exam16GreenRoots.Models;

import Exam16GreenRoots.Exception.GreenRootsException;

public class PlantaInterior extends Planta{
    private NivelLuz nivelLuz;

    public PlantaInterior(double precioVenta, int stockDisponible, NivelLuz nivelLuz) {
        super(precioVenta, stockDisponible);
        this.nivelLuz = nivelLuz;
    }

    public PlantaInterior(double precioVenta, int stockDisponible, int stockMinimo, NivelLuz nivelLuz) {
        super(precioVenta, stockDisponible, stockMinimo);
        this.nivelLuz = nivelLuz;
    }

    public PlantaInterior(String nombreCientifico, double precioVenta, NivelLuz nivelLuz) {
        super(nombreCientifico, precioVenta);
        this.nivelLuz = nivelLuz;
    }

    @Override
    public double calcularValorStock() {
        double valorStock=0;
        if(nivelLuz.equals(NivelLuz.BAJA)){
            valorStock=getPrecioVenta()*getStockDisponible()*1.10;
        }
        else if(nivelLuz.equals(NivelLuz.MEDIA)){
            valorStock=getPrecioVenta()*getStockDisponible();
        }
        else{
            valorStock=getPrecioVenta()*getStockDisponible()*0.85;
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
