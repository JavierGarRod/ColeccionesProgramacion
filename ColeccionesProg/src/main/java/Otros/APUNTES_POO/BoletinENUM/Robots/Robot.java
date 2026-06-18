package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinENUM.Robots;

public class Robot {

    // atributos

    String identificador;
    double nvl_suciedad;
    EstadoRobot estado;
    double bateria;
    Habitacion habitacionAsignada;

    // constructor

    public Robot(String identificador, double nvl_suciedad, EstadoRobot estado, double bateria) {
        this.identificador = identificador;
        this.nvl_suciedad = nvl_suciedad;
        this.estado = estado;
        this.bateria = bateria;
        this.habitacionAsignada = null;
    }

    // métodos

    public boolean asignarHabitacion(Habitacion h){
        if (this.estado == EstadoRobot.AUTO){
            this.habitacionAsignada = h;
            h.ponerEnLimpieza(); // la habitacion pasa a LIMPIANDO
            return true;
        }
        else{
            System.out.println("Como el robot "+ identificador + " no está en modo AUTO, no se puede asignar una habitación");
            return false;
        }
    }

    public void vaciarDeposito(){
        this.nvl_suciedad = 0;
    }

    public void recargar(){
        this.bateria = 100;
    }
}
