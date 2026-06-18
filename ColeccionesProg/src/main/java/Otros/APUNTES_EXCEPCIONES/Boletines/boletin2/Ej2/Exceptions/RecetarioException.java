package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin2.Ej2.Exceptions;

public class RecetarioException extends Exception {

    public RecetarioException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "RecetarioException: Esa receta no existe :l";
    }
}
