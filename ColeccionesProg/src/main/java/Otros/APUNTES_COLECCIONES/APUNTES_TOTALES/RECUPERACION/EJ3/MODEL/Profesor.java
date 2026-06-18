package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL;

public class Profesor extends Persona {

    //atributos
    private String idioma;
    private int anios_experiencia;

    //constructor
    public Profesor(String nombre, String apellidos, String DNI, String telefono, String idioma, int anios_experiencia) {
        super(nombre, apellidos, DNI, telefono);
        this.idioma = idioma;
        setAnios_experiencia(anios_experiencia);
    }

    //getters y setters
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAnios_experiencia() {
        return anios_experiencia;
    }

    public void setAnios_experiencia(int anios_experiencia) {
        if(anios_experiencia >=  0){
            this.anios_experiencia = anios_experiencia;
        }
    }
}
