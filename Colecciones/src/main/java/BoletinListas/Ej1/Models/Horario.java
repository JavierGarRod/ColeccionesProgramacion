package BoletinListas.Ej1.Models;

public class Horario {

    // Nombres de los 5 días de clase
    private String[] dias = {"Lunes","Martes","Miércoles","Jueves","Viernes"};

    // Tabla 5x6: 5 días, 6 horas por día
    private String[][] tabla = new String[5][6];

    // Constructor: inicializa todas las horas como "Libre"
    public Horario() {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 6; j++)
                tabla[i][j] = "Libre";
    }

    // Asigna un módulo a un día y hora específicos
    public void asignarModulo(int dia, int hora, String modulo) {
        tabla[dia][hora] = modulo;
    }

    // Muestra el horario completo
    public void mostrar() {
        for (int i = 0; i < 5; i++) {
            System.out.println(dias[i] + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.println("  Hora " + (j+1) + ": " + tabla[i][j]);
            }
        }
    }
}