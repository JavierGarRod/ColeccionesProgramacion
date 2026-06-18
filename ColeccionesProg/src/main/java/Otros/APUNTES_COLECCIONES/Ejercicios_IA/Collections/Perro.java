package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.Ejercicios_IA.Collections;

public class Perro extends Animal implements Adoptable {
    //atributos
    private String familiaAdoptante;

    //constructor
    public Perro(String familiaAdoptante, String nombre, int edad, double peso, TipoSangre tipe_blood) {
        super(nombre, edad, peso, tipe_blood);
        this.familiaAdoptante = familiaAdoptante;
    }

    @Override
    public String emitirSonido() {
        return "Guau Guau!!!";
    }

    @Override
    public boolean adoptado() {
        return familiaAdoptante != null;
    }

    @Override
    public void registrarAdopcion(String familia) {
        this.familiaAdoptante = familia;
    }

    public String getFamiliaAdoptante() {
        return familiaAdoptante;
    }

    public void setFamiliaAdoptante(String familiaAdoptante) {
        this.familiaAdoptante = familiaAdoptante;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", peso=" + getPeso() +
                ", tipoSangre=" + getTipe_blood() +
                ", familia='" + getFamiliaAdoptante() + '\'' +
                '}';
    }
}
