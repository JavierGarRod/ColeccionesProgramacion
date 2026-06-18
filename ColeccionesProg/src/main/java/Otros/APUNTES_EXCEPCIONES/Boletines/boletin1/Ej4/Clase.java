package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin1.Ej4;

import java.util.Random;

public class Clase {

    Random r = new Random();

    public void hacerDivisiones(){
      double [] tabla = new double[20]; //  el array va de 0 a 19
      for(int i = 0; i < 20; i++){
          int num1 = r.nextInt(11);
          int num2 = r.nextInt(11);

          try{
              double resultado = num1/num2;
              tabla[i] = resultado;
          }
          catch (ArithmeticException e){
              System.out.println("No se puede dividir entre 0");
          }
          catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Intentando guardar en la posición 10");
          }
      }
        System.out.println("Proceso terminado");
    }
}


//División por 0 → ArithmeticException

//Índice fuera del array → ArrayIndexOutOfBoundsException

//Texto a número → NumberFormatException

//Objeto null → NullPointerException

// Abrir un archivo que no existe -> FileNotFoundException

// Problemas de entrada/salida	-> IOException

// Clase no encontrada -> ClassNotFoundException