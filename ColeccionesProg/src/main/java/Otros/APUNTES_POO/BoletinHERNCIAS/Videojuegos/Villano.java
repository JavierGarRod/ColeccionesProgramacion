package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Videojuegos;

public class Villano extends Personaje {

    public Villano(String nombre) {
        super(nombre);
        this.arma = ""; // el tio mete puñazos en la boca
    }

    @Override
    public boolean esAtacado(Personaje atacante) {

        return true; // lo ataca todo el mundo
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {

        return true; // desde cualquier distancia
    }
}


