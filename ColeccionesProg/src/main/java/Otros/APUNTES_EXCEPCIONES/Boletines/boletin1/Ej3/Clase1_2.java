package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin1.Ej3; // IA, es para ver el Scanner (auqnue pone el gestiona e la misma clase)

import java.util.Scanner;

public class Clase1_2 {

    // Método que lee números y lanza excepción si alguno es positivo
    public static void leerNumeros() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres introducir?: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();

            if (num > 0) {
                throw new ArithmeticException("Número positivo detectado: " + num);
            }
        }

        System.out.println("Todos los números eran negativos o cero.");
    }

    public static void main(String[] args) {

        try {
            leerNumeros();
        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }
}

