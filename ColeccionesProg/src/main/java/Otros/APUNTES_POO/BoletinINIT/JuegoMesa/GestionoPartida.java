package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.JuegoMesa;

public class GestionoPartida {
    public static void main(String[] args) {
        // Crear participantes
        Participante p1 = new Participante("Luna", "Lucía", 20, 50);
        Participante p2 = new Participante("Shadow", "Carlos", 22, 70);
        Participante p3 = new Participante("Rex", "Andrés", 19, 40);
        Participante p4 = new Participante("Nova", "María", 21, 90);

        // Meterlos en un array
        Participante[] jugadores = {p1, p2, p3, p4};

        // Crear partida (escena donde ocurre todo)
        Partida partida = new Partida("Catan", jugadores);

        // Mostrar quién tiene más puntos
        Participante ganador = partida.jugador_con_mas_puntos(); //objeto-metodo/atributo
        System.out.println("El jugador con más puntos es: " + ganador);
    }
}
