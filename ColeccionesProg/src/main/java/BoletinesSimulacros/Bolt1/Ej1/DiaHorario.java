package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt1.Ej1;

import java.util.ArrayList;
import java.util.List;

public class DiaHorario {

    private String nombreDia;
    private List<String> modulos;

    public DiaHorario(String nombreDia) {
        this.nombreDia = nombreDia;
        this.modulos = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            modulos.add(null);
        }
    }

    public void setModulo(int hora, String modulo) {
        modulos.set(hora, modulo);
    }

    @Override
    public String toString() {
        String s = nombreDia + ": ";

        for (int i = 0; i < modulos.size(); i++) {
            String m = modulos.get(i);

            if (m == null) {
                s += "[-]";
            } else {
                s += "[" + m + "]";
            }
        }

        return s;
    }
}
