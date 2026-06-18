package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt2.Ej1;

public class Animal implements Comparable<Animal> {

    private int id;
    private String nombre;
    private String especie;
    private int edad;
    private String clasificacionComida;
    private String fechaNacimiento;
    private double peso;
    private String medio;
    private String clasificacionGestacion;

    public Animal(int id, String nombre, String especie, int edad, String clasificacionComida,
                  String fechaNacimiento, double peso, String medio, String clasificacionGestacion) {

        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.clasificacionComida = clasificacionComida;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.medio = medio;
        this.clasificacionGestacion = clasificacionGestacion;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public String getMedio() { return medio; }
    public String getClasificacionComida() { return clasificacionComida; }

    @Override
    public int compareTo(Animal o) {
        int comp = this.nombre.compareToIgnoreCase(o.nombre);
        if (comp == 0) {
            return this.id - o.id;
        }
        return comp;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Animal) {
            return this.id == ((Animal) o).id;
        }
        return false;
    }

    @Override
    public String toString() {
        return nombre + " | Nacido: " + fechaNacimiento + " | Medio: " + medio + " | Alimentación: " + clasificacionComida;
    }
}
