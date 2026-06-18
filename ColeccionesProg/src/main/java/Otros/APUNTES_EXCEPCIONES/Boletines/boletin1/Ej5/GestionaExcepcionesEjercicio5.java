package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin1.Ej5;

public class GestionaExcepcionesEjercicio5 {
    public static void main(String[] args) {

        try {
            metodo1(7);   // prueba con un número impar
        }
        catch (MiExcepcion e) {
            System.out.println(e);   // llama a tu toString()
        }

        System.out.println("Programa finalizado.");
    }

public static void metodo1(int n) throws MiExcepcion { //lanzo la excepción

        if (n % 2 != 0) {   // si es impar
            throw new MiExcepcion(n); // la declaro
        }

        System.out.println("El número " + n + " es par. Todo correcto.");
    }

}
