package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.JuegoMesa;

import java.util.Arrays;

public class Partida {

    // atributos
    String nombre;
    Participante [] participantes;

    //constructor


    public Partida(String nombre, Participante[] participantes) {
        this.nombre = nombre;
        this.participantes = participantes;
    }

    //métodos
    public Participante jugador_con_mas_puntos() {

        Participante mejor = participantes[0]; // empezamos con el primero

        for (int i = 1; i < participantes.length; i++) {
            if (participantes[i].puntuacion > mejor.puntuacion) {
                mejor = participantes[i];
            }
        }

        return mejor; // devuelve a un participante completo
    }

    /*
    ¿CÓMO SE HACE ESE METODO?

      Tipo mejor = array[0];

        for (int i = 1; i < array.length; i++) {
             if (array[i] tiene más que mejor) { (EL PUNTO . SIRVE PARA ACCEDER A LOS MÉTODOS O ATRIBUTOS DEL OBJETO)
                mejor = array[i];
    }
}
        return mejor; para devolver un participante completo

    */

    @Override
    public String toString() {
        return "Partida{" +
                "nombre='" + nombre + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
