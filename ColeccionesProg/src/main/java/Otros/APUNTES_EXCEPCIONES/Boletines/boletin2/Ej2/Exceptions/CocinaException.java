package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin2.Ej2.Exceptions;

public class CocinaException extends Exception{

    //atributos
    private String mensaje;

    //constructor
    public CocinaException(String mensaje) {
        this.mensaje = mensaje;
    }

    //toString

    @Override
    public String toString() {
        return "CocinaException: "
                + mensaje ;
    }
}
