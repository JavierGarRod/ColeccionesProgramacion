package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Libro;

public class GestionoLibro {
    public static void main(String[] args) {

        // se usa cuando necesitas modificar atributos uno por uno en distintos momentos.
        // y cuando quieres crear un objeto vacío y rellenarlo después
        Libro libro1 = new Libro();
        libro1.titulo = "Don Quijote";
        libro1.autor = "Cervantes";
        libro1.num_páginas = 896;
        libro1.isbn = 1234567;

        Libro libro2 = new Libro();
        libro2.titulo = "Alas de Sangre";
        libro2.autor = "Ana Torres";
        libro2.num_páginas = 800;
        libro2.isbn = 1234;


        Libro libro3 = new Libro();
        libro3.titulo = "Sombra de dioses";
        libro3.autor = "Miguel Rodriguez";
        libro3.num_páginas = 506;
        libro3.isbn = 1267;

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
    }
}
