package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Videojuegos;

public class Caballero extends Personaje {

    public Caballero(String nombre) {
        super(nombre);
        this.arma = "Espada";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {

        String armaAtacante = atacante.getArma(); //puedo ver el arma que usa

        if (armaAtacante.equals("Hechizo")) {
            return true;
        }
        else if (armaAtacante.equals("Flecha")) {
            return true; // arquero sin distancia SÍ
        }
        else {
            return false;
        }
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {

        String armaAtacante = atacante.getArma();

        if (armaAtacante.equals("Hechizo")) {
            return true;
        }
        else if (armaAtacante.equals("Flecha")) {
            if (distancia > 100) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}




