package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc2;

public class GestionaProductos {

    private Producto[] detergentes = new Producto[10];
    private Producto[] pescados = new Producto[10];
    private Producto[] vinos = new Producto[10];

    public int totalCalorias() {
        int total = 0;

        for (Producto p : pescados)
            if (p instanceof Alimento a) total += a.getCalorias();

        for (Producto p : vinos)
            if (p instanceof Alimento a) total += a.getCalorias();

        return total;
    }
}

