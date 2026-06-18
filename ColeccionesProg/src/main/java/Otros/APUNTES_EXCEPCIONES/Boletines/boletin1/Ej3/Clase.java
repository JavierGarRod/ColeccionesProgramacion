package ColeccionesProg.src.main.java.Otros.APUNTES_EXCEPCIONES.Boletines.boletin1.Ej3;

public class Clase {

        public void comprobarLista(Integer[] lista) {
            for (Integer num : lista) {
                if (num != null && num > 0) {
                    throw new ArithmeticException("Número positivo detectado: " + num);
                }
            }
            System.out.println("Todos los números son negativos o cero.");
        }
    }

