package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.CadAlimenticia;

public class AveRapaz extends Animal{

    public AveRapaz(String especie, String habitat) {
        this.especie = especie;
        this.familia = "rapaz";
        this.habitat = habitat;
    }

    @Override
    public boolean atacar(Animal a) {
        return a instanceof Serpiente || a instanceof Roedor;
    }

    @Override
    public boolean huir(Animal a) {
        return a instanceof Leon;
    }
}