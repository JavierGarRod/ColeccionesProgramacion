package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej3;

public class Soldador extends Robot{

    //atributos
    private double temperatura;
    private String Esp_Seguridad;

    // constructor
    public Soldador(String modelo, int bateria, String combustible, String descripcion, double temperatura, String Esp_Seguridad) {
        super(modelo, bateria, combustible, descripcion);
        this.temperatura = temperatura;
        this.Esp_Seguridad = Esp_Seguridad;
    }

    //métodos
    @Override
    public void ejecutarTarea() {
        System.out.println("Estoy soldando");
    }

    @Override
    public boolean recargar() {
        if (this.getEstado().equals(Estado.APAGADO) && getCombustible().equalsIgnoreCase("electricidad")) {
            System.out.println("Recargando por electricidad");
            return true;
        } else {
            if (getEstado().equals(Estado.ENCENDIDO)) {
                System.out.println("Estoy encendido y no puedo recargar");
            }
            return false;
        }
    }
}
