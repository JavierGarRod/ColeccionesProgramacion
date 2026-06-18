package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin2.Ej3.Exceptions;

public class SensorException extends Exception{

    //atributos
    private int id;

    //constructor
    public SensorException(int id,String mensaje){
        super(mensaje);
        this.id = id;
    }

    //toString
    @Override
    public String toString() {
        return "SensorException: " +
                + id +
                " | " + getMessage(); //para obtener el mensaje que se escribe
    }
}
