package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Videojuegos;

    public class Mago extends Personaje {

        public Mago(String nombre) {
            super(nombre);
            this.arma = "Hechizo";
        }

        @Override
        public boolean esAtacado(Personaje atacante) {
            return false; // nadie lo ataca
        }

        @Override
        public boolean esAtacado(Personaje atacante, int distancia) {
            return false; // nadie lo ataca
        }
    }


