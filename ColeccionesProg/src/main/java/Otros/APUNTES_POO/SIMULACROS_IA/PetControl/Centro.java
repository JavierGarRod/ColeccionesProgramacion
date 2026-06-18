package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.PetControl;

public class Centro {

    // atributos
    private Animal [] animales;

    public Centro() {
        this.animales = new Animal[30];
    }

    // métodos
    public boolean registrarAnimal(Animal a) {

        for (Animal an : animales) { // si existe o no
            if (an != null && an.getId() == a.getId()) {
                return false;
            }

        }

        for (int i = 0; i < animales.length; i++) { // buscar hueco libre
            if (animales[i] == null) {
                animales[i] = a;
                return true;
            }
        }
        return false; // no hay hueco (else)
    }

    public double suma(){
        double total = 0;
        for (Animal a : animales){
            if (a != null){
                total += a.coste_mantenimiento_diario();
            }
        }
        return total;
    }

    // getters y setters

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }
}
