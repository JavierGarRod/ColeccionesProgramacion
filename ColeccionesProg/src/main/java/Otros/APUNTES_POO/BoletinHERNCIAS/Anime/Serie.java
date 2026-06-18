package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinHERNCIAS.Anime;

public class Serie {

    private String nombre;
    private int numeroTemporadas;
    private int numeroCapitulos;
    private String autor;

    public Serie(String nombre, int numeroTemporadas, int numeroCapitulos, String autor) {
        this.nombre = nombre;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroCapitulos = numeroCapitulos;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }
}
