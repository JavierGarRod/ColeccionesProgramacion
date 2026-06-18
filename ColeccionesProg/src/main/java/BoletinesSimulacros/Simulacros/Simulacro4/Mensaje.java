package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Mensaje {

    protected int id;
    protected String contenido;
    protected LocalDateTime fechaCreacion;
    protected Usuario usuario;
    protected List<Valoracion> valoraciones;
    protected int lecturas;

    public Mensaje(int id, String contenido, Usuario usuario) {
        this.id = id;
        this.contenido = contenido;
        this.usuario = usuario;
        this.fechaCreacion = LocalDateTime.now();
        this.valoraciones = new ArrayList<>();
        this.lecturas = 0;
    }

    public void addValoracion(Valoracion v) {
        this.valoraciones.add(v);
        this.lecturas++;
    }

    public abstract int calcularPuntuacion();

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public int getId() {
        return id;
    }
}

