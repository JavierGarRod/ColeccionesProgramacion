package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.CadAlimenticia;

public abstract class Animal {

    protected String especie;
    protected String familia;
    protected String habitat;

    protected Animal[] come = new Animal[10];
    protected Animal[] esComidoPor = new Animal[10];


    public abstract boolean atacar(Animal a);
    public abstract boolean huir(Animal a);
    }