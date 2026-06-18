package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt3.Ej1;

import java.util.LinkedHashSet;
public class RepositorioReservas {
    // ATRIBUTOS

    private LinkedHashSet<Reserva> reservas = new LinkedHashSet<>();

    // MÉTODOS

    public void addReserva(Reserva r) {
        reservas.add(r);
    }

    public Reserva buscar(int id) {
        for (Reserva r : reservas) {
            if (r.getId() == id) {
                return r;
            }
        }

        return null;
    }

    public void mostrar() {
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    public Reserva cambiarAsiento(int id, String nuevoAsiento, boolean confirmar) {

        Reserva original = buscar(id);

        if (original == null) {
            System.out.println("No existe la reserva.");
            return null;
        }

        if (!confirmar) {
            // clonación
            Reserva copia = original.clone();
            copia.setAsiento(nuevoAsiento);
            return copia;
        } else {
            // modificación
            original.setAsiento(nuevoAsiento);
            return original;
        }
    }
}

