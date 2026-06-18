package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.CadAlimenticia;

public class Serpiente extends Animal{
    public Serpiente(String especie, String habitat) {
        this.especie = especie;
        this.familia = "serpiente";
        this.habitat = habitat;
    }

    @Override
    public boolean atacar(Animal a) {
        return a instanceof Roedor; // ratas y conejos
    }

    @Override
    public boolean huir(Animal a) {
        return false; // nunca huye
    }
}