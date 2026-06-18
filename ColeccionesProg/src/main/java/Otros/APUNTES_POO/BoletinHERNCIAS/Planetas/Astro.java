package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Planetas;

import java.util.Objects;

public abstract class Astro {

    //atributos

    protected String nombre;
    protected double masa;
    protected double diametro;
    protected double periodoRotacion;
    protected double periodoTraslacion;
    protected double distanciaMedia;

    // constructor

    public Astro(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    // Getters y setters

    public String getNombre() { return nombre; }
    public double getMasa() { return masa; }
    public double getDiametro() { return diametro; }
    public double getPeriodoRotacion() { return periodoRotacion; }
    public double getPeriodoTraslacion() { return periodoTraslacion; }
    public double getDistanciaMedia() { return distanciaMedia; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMasa(double masa) { this.masa = masa; }
    public void setDiametro(double diametro) { this.diametro = diametro; }
    public void setPeriodoRotacion(double periodoRotacion) { this.periodoRotacion = periodoRotacion; }
    public void setPeriodoTraslacion(double periodoTraslacion) { this.periodoTraslacion = periodoTraslacion; }
    public void setDistanciaMedia(double distanciaMedia) { this.distanciaMedia = distanciaMedia; }

    // Métodos

    public abstract void muestra(); //es abstract porque no existe por sí misma

    // toString

    @Override
    public String toString() {
        return "Astro: " + nombre + " | Masa: " + masa + " | Diámetro: " + diametro;
    }

    // equals

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Astro astro = (Astro) o;
        return Double.compare(masa, astro.masa) == 0 && Double.compare(distanciaMedia, astro.distanciaMedia) == 0 && Objects.equals(nombre, astro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, masa, distanciaMedia);
    }
}


