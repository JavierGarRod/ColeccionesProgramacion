package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc2;

import java.time.LocalDate;

public class Pescado extends Producto implements Alimento {

    private String origen;
    private int duracionDias;
    private TipoPescado tipo;
    private LocalDate caducidad;

    public Pescado(String id, String nombre, String descripcion,
                   double peso, double precioCompra, double precioVenta,
                   String origen, int duracionDias, TipoPescado tipo) {

        super(id, nombre, descripcion, peso, precioCompra, precioVenta, 0.07);
        this.origen = origen;
        this.duracionDias = duracionDias;
        this.tipo = tipo;
    }

    public void setCaducidad(LocalDate fecha) {
        this.caducidad = fecha;
    }
    public LocalDate getCaducidad() {
        return caducidad;
    }

    public int getCalorias() {
        return switch (tipo) {
            case AZUL -> (int)(peso * 3);
            case BLANCO -> (int)(peso * 2);
            case MARISCO -> (int)(peso * 1);
        };
    }
}


