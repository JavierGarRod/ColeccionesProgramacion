package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej1.Model;

public class Horario {
    // ATRIBUTOS

    private String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
    private String[][] modulos = new String[5][6]; //5 días de clase y 6 horas para cada día


    // CONSTRUCTOR

    public Horario() {}


    // MÉTODOS

    public void asignarModulo(int dia, int hora, String modulo) {
        modulos[dia][hora] = modulo;
    }

    public void mostrarHorario() {
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i] + ":");
            for (int j = 0; j < 6; j++) { // para cada día se recorren 6 horas
                System.out.println("  Hora " + (j+1) + ": " + modulos[i][j]); //0.0, 0.1, 0.2...0.5 :)....1.0... "estantería de 5 baldas, cada balda con 6 cajas y cada una con un módulo"
            }
        }
    }


    // GETTERS Y SETTERS


    public String[] getDias() {
        return dias;
    }

    public void setDias(String[] dias) {
        this.dias = dias;
    }

    public String[][] getModulos() {
        return modulos;
    }

    public void setModulos(String[][] modulos) {
        this.modulos = modulos;
    }
}
