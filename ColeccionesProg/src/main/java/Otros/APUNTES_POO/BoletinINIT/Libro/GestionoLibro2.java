package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Libro;

public class GestionoLibro2 {
    public static void main(String[] args) {

        //Se usa cuando quieres que todos los objetos nazcan completos.
        Libro2 libro1 = new Libro2("Sombra de dioses", "Miguel Rodriguez", 200, 123545667);
        System.out.println(libro1.toString());

        Libro2 libro2 = new Libro2("Alas de sangre", "Ana Torre", 400, 143567);
        System.out.println(libro2.toString());

        Libro2 libro3 = new Libro2("Berserk", "Kentaro Miura", 149, 1245767);
        System.out.println(libro3.toString());
    }
}
