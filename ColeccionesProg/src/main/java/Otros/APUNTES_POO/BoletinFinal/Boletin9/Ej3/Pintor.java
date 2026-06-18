package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej3;

public class Pintor extends Robot{

    // constructor
    public Pintor(String modelo, int bateria, String combustible, String descripcion) {
        super(modelo, bateria, combustible, descripcion);
    }

    // métodos
    @Override
    public void ejecutarTarea() {
        System.out.println("Estoy aplicando pintura a los vehículos");
    }
    @Override
    public boolean recargar() {
        if(getCombustible().equalsIgnoreCase("electricidad")){
            System.out.println("Recargando por electricidad");
            return true;
        }
        else{
            System.out.println("No funciono si no es con electricidad");
            return false;
        }
    }
}
