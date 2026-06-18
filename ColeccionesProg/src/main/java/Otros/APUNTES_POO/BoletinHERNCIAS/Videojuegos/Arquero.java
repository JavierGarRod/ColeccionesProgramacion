package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Videojuegos;

public class Arquero extends Personaje {

    public Arquero(String nombre) {
        super(nombre);
        this.arma = "Flecha";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {

        String armaAtacante = atacante.getArma();

        if (armaAtacante.equals("Hechizo")) {
            return true;
        } else if (armaAtacante.equals("Espada")) {
            return false; // caballero sin distancia NO
        } else {
            return false;
        }
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {

        String armaAtacante = atacante.getArma();

        if (armaAtacante.equals("Hechizo")) {
            return true;
        }
        else if (armaAtacante.equals("Espada")) {
            if (distancia < 50) {
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

