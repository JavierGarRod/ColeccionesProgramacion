package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej3;

public class Ensamblador extends Robot{

    // constructor
    public Ensamblador(String modelo, int bateria, String combustible, String descripcion) {
        super(modelo, bateria, combustible, descripcion);
    }

    //metodos
    @Override
    public void ejecutarTarea() {
        System.out.println("Estoy ensamblando piezas");
    }
    @Override
    public boolean recargar() {
        if (getEstado().equals(Estado.APAGADO) && getCombustible().equalsIgnoreCase("gasolina")) {
            System.out.println("Recargando por gasolina");
            return true;
        } else {
            if (getEstado().equals(Estado.ENCENDIDO)) {
                System.out.println("Estoy encendido y no puedo recargar");
            }
            return false;
        }
    }
}
