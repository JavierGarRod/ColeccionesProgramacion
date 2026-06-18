package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Apuntes_FINAL.Ej1.Exceptions;

public class StockInvalidoException extends RuntimeException {
    public StockInvalidoException(String message) {
        super(message);
    }
}
