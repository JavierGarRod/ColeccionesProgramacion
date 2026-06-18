package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt3.Ej2;
public class Motor implements Cloneable {

    // ATRIBUTOS

    private String tipo;   // gasolina, diesel, electrico
    private int cv;
    private boolean enMarcha;

    // CONSTRUCTOR

    public Motor(String tipo, int cv) {
        this.tipo = tipo;
        this.cv = cv;
        this.enMarcha = false;
    }

    // GETTERS Y SETTERS

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    // CLONE (SHALLOW OK)

    @Override
    public Motor clone() {
        try {
            return (Motor) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    // TOSTRING

    @Override
    public String toString() {
        return "Motor: " + tipo + ", " + cv + "cv";
    }
}

