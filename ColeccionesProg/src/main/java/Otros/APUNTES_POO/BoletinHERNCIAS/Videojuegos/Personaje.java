package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Videojuegos;

public class Personaje {

    // atributos
    protected String nombre;
    protected String arma;

    // constructor
    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    // metodos
    public boolean esAtacado(Personaje atacante) {
        return false; // por defecto nadie te ataca
    }

    public boolean esAtacado(Personaje atacante, int distancia) {
        return false; // por defecto nadie te ataca
    }
}



