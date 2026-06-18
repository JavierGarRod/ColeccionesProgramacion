package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej3;

import java.time.LocalDate;

public class PuertaAutomatica extends DispositivoWifi{

    public PuertaAutomatica(String MAC, LocalDate fechaActualizacion) {
        super(MAC, fechaActualizacion);
    }

    @Override
    public void conectarInternet() {
        System.out.println("Conectando mediante WPA2...");
        setEstado(EstadoWifi.ON_CONECTADO);
    }

    @Override
    public boolean pendienteActualización() {
        return getFechaActualizacion().plusMonths(1).isBefore(LocalDate.now());
    }
}

