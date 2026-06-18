package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Ej3;

import java.time.LocalDate;
import java.util.Objects;

public abstract class DispositivoWifi {

    private static int contador;
        private int id;
        private String MAC;
        private EstadoWifi estado;
        private LocalDate fechaActualizacion;

        public DispositivoWifi(String MAC, LocalDate fechaActualizacion) {
            this.id = contador++;
            this.MAC = MAC;
            this.estado = EstadoWifi.OFF;
            this.fechaActualizacion = fechaActualizacion;
        }

        public String getMAC() { return MAC; }
        public EstadoWifi getEstado() { return estado; }
        public void setEstado(EstadoWifi estado) { this.estado = estado; }
        public LocalDate getFechaActualizacion() { return fechaActualizacion; }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof DispositivoWifi d)) return false;
            return this.MAC.equalsIgnoreCase(d.MAC);
        }

        @Override
        public int hashCode() {
            return Objects.hash(MAC);
        }

        public void apagar() {
            this.estado = EstadoWifi.OFF;
            System.out.println("Dispositivo apagado");
        }

        public abstract void conectarInternet();
        public abstract boolean pendienteActualización();

        @Override
        public String toString() {
            return id + " | " + this.getClass().getSimpleName() +
                    " | MAC: " + MAC +
                    " | Estado: " + estado +
                    " | Última actualización: " + fechaActualizacion;
        }
    }


