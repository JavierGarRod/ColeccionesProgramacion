package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin3.Ej1.Models;

import java.util.TreeSet;

public class RepositorioReservas {
    TreeSet<Reserva> listaDeReservas=new TreeSet<Reserva>();

    public void addReserva(Reserva r){
        for (Reserva re : listaDeReservas) {
            if(!listaDeReservas.contains(re)){
                listaDeReservas.add(re);
            }
        }
    }

    public boolean añadirReservaColeccion(Reserva r){
        return listaDeReservas.add(r);
    }

    public Reserva buscarPorId(int id){
        for (Reserva r : listaDeReservas) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }

    public void mostrarReservas(){
        for (Reserva r : listaDeReservas) {
            System.out.println(r);
        }
    }

    public Reserva cambiarAsiento(int id, String nuevoAsiento, boolean confirmar) {
        Reserva r = buscarPorId(id);

        if (r == null) {
            return null;
        }

        if (!confirmar) {
            // Simulación: devolver copia modificada
            Reserva copia = r;
            copia.setNumAsiento(nuevoAsiento);
            return copia;
        } else {
            // Confirmación: modificar la reserva real
            r.setNumAsiento(nuevoAsiento);
            return r;
        }
    }
}
