package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.Ejercicios_IA.Mapas;

public class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private String especie;
    private Estado tipo_Estado;

    public Animal(String nombre, int edad, double peso, String especie, Estado tipo_Estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
        this.tipo_Estado = tipo_Estado;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", especie= " + especie +
                ", estado= " + tipo_Estado +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Estado getTipo_Estado() {
        return tipo_Estado;
    }

    public void setTipo_Estado(Estado tipo_Estado) {
        this.tipo_Estado = tipo_Estado;
    }
}
