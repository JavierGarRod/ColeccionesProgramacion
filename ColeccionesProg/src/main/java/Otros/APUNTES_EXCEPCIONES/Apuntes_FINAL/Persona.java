package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Apuntes_FINAL;

// EXCEPCIONES EN CONSTRUCTOR

public class Persona {

    //atributos
    private String nombre;
    private int edad;

    //constructor
    public Persona(String nombre, int edad) throws Exception {
        setNombre(nombre);
        setEdad(edad);
    }

    //sets de validación
    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.isBlank()) { //isBlank es que está vacío o con espacios " ", se puede poner también nombre.trim().isEmpty()), pues trim quita espacios
            throw new Exception("El nombre no puede estar vacío");  // se pone ==null y luego el black pq uno es por si el nombre no existe en memoria y el otro por si existe pero vacío
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0 || edad > 120) {
            throw new Exception("Edad fuera de rango");
        }
        this.edad = edad;
    }

    //toString
    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }

    /*
    Tipos:
            - Checked (obligan a try/catch): IOException, SQLException
    - Unchecked (Runtime): NullPointerException, IndexOutOfBounds

    Estructura:
            try {
        // código
    } catch (TipoException e) {
        // manejo
    } finally {
        // siempre se ejecuta
    }

    throw:
            - Lanza una excepción manualmente

    throws:
            - Indica que un método puede lanzar una excepción
            */

}

