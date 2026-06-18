package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.CadAlimenticia;

public class Roedor extends Animal{
    public Roedor(String especie, String habitat) {
        this.especie = especie;
        this.familia = "roedor";
        this.habitat = habitat;
    }

    @Override
    public boolean atacar(Animal a) {
        return false; // solo come plantas
    }

    @Override
    public boolean huir(Animal a) {
        if (a instanceof Serpiente) return true;
        if (a instanceof AveRapaz) return false;
        return false;
    }
}