package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Combustible;

public class Vehículo {

    // atributos
    String marca;
    String modelo;
    int año_fabricacion;
    String tipo_combustible;
    double capacidad_tanque;
    double combustible_actual; // ← NECESARIO

    // constructor
    public Vehículo(String marca, String modelo, int año_fabricacion, String tipo_combustible, double capacidad_tanque, double combustible_actual) {
        this.marca = marca;
        this.modelo = modelo;
        this.año_fabricacion = año_fabricacion;
        this.tipo_combustible = tipo_combustible;
        this.capacidad_tanque = capacidad_tanque;
        this.combustible_actual = combustible_actual;
    }

    // calcular consumo
    public double calculo_consumo_combustible(double km){
        double consumoMedio = 0.07; // 7 litros cada 100 km (ejemplo)
        return km * consumoMedio;
    }

    // comprobar si necesita repostar
    public boolean necesitaRepostar() {
        return combustible_actual < capacidad_tanque * 0.20;
    }

    @Override
    public String toString() {
        return "Vehículo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año_fabricacion=" + año_fabricacion +
                ", tipo_combustible='" + tipo_combustible + '\'' +
                ", capacidad_tanque=" + capacidad_tanque +
                ", combustible_actual=" + combustible_actual +
                '}';
    }
}
