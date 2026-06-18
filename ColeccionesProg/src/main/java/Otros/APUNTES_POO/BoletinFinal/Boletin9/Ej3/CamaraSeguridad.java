package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej3;

import java.time.LocalDate;

public class CamaraSeguridad extends DispositivoWifi{

    public CamaraSeguridad(String MAC, LocalDate fechaActualizacion) {
        super(MAC, fechaActualizacion);
    }

    @Override
    public void conectarInternet() {
        System.out.println("Conectando mediante WPA3...");
        setEstado(EstadoWifi.ON_CONECTADO);
    }

    @Override
    public boolean pendienteActualización() {
        return getFechaActualizacion().plusWeeks(2).isBefore(LocalDate.now());
    }
}

