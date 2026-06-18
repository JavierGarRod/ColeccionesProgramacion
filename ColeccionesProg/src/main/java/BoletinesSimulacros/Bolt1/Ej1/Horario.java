package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej1;

public class Horario {
    private DiaHorario[] dias;

    public Horario() {
        dias = new DiaHorario[5];
        dias[0] = new DiaHorario("Lunes");
        dias[1] = new DiaHorario("Martes");
        dias[2] = new DiaHorario("Miércoles");
        dias[3] = new DiaHorario("Jueves");
        dias[4] = new DiaHorario("Viernes");
    }

    public DiaHorario getDia(int i) {
        return dias[i];
    }

    public String toString() {
        String s = "";
        for (DiaHorario d : dias) s += d;
        return s;
    }
}
