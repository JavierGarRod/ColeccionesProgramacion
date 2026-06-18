package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.CadAlimenticia;

public class Leon extends Animal{
    public Leon(String especie, String habitat) {
        this.especie = especie;
        this.familia = "leon";
        this.habitat = habitat;
    }

    @Override
    public boolean atacar(Animal a) {
        return !(a instanceof Leon);
    }

    @Override
    public boolean huir(Animal a) {
        return false; // no huye de nadie
    }
}