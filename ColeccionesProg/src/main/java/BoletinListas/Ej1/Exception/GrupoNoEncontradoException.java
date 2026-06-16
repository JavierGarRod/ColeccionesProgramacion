package BoletinListas.Ej1.Exception;

// Excepción cuando un grupo no existe en el instituto
public class GrupoNoEncontradoException extends Exception {
    public GrupoNoEncontradoException(String msg) {
        super(msg);
    }
}
