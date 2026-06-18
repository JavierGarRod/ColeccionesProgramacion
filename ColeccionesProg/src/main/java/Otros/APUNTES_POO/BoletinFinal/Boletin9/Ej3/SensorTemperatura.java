package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej3;

import java.time.LocalDate;

public class SensorTemperatura extends DispositivoWifi{

    private double temperatura;

    public SensorTemperatura(String MAC, LocalDate fechaActualizacion, double temperatura) {
        super(MAC, fechaActualizacion);
        this.temperatura = temperatura;
    }

    @Override
    public void conectarInternet() {
        System.out.println("Conectando mediante WPA...");
        setEstado(EstadoWifi.ON_CONECTADO);
    }

    @Override
    public boolean pendienteActualización() {
        return getFechaActualizacion().plusMonths(3).isBefore(LocalDate.now());
    }
}


