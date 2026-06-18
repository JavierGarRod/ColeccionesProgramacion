package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej3;

public class RobotWifi extends Robot implements ConectableWifi{

    public RobotWifi(String modelo, int bateria, String combustible, String descripcion) {
        super(modelo, bateria, combustible, descripcion);
    }

    @Override
    public void conectarInternet() {

    }

    @Override
    public boolean pendienteActualizacion() {
        return false;
    }

    @Override
    public void apagarWifi() {

    }

    @Override
    public void ejecutarTarea() {

    }

    @Override
    public boolean recargar() {
        return false;
    }
}
// hasta ahí llego
