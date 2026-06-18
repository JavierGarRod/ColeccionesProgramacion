package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.EXAMEN_COLECCIONES.CORRECCION.modelos;

import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.excepciones.BatallaException;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.Casa;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.Comandante;
import APUNTES_COLECCIONES.EXAMEN_COLECCIONES.modelos.TipoBatalla;

import java.time.LocalDate;
import java.util.*;

public class Batalla implements Comparable<Batalla> {

    // atributos
    private String idBatalla;
    private String nombre;
    private LocalDate fecha;
    private TipoBatalla tipo;
    private Casa casaGanadora;
    private int bajas;
    private List<Comandante> comandante_batalla;

    // constructor
    public Batalla(String idBatalla, String nombre, LocalDate fecha, TipoBatalla tipo, Casa casaGanadora) {
        this.idBatalla = idBatalla;
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        this.casaGanadora = casaGanadora;
        this.bajas = 0;
        this.comandante_batalla = new ArrayList<>();
    }

    // métodos

    public void agregarComandante(Comandante c) throws BatallaException {
        // no se pueden añadir comandantes a batallas pasadas
        if (this.fecha.isBefore(LocalDate.now())) {
            throw new BatallaException("No se puede agregar comandante: la batalla ya ha ocurrido");
        }
        if (!comandante_batalla.contains(c)) {
            comandante_batalla.add(c);
        }
    }

    public String getIdBatalla() {
        return idBatalla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoBatalla getTipo() {
        return tipo;
    }

    public void setTipo(TipoBatalla tipo) {
        this.tipo = tipo;
    }

    public Casa getCasaGanadora() {
        return casaGanadora;
    }

    public void setCasaGanadora(Casa casaGanadora) {
        this.casaGanadora = casaGanadora;
    }

    public int getBajas() {
        return bajas;
    }

    public void setBajas(int bajas) {
        this.bajas = bajas;
    }

    public List<Comandante> getComandantes() {
        return comandante_batalla;
    }

    // equals y hashcode (por id)

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Batalla batalla)) return false;
        return Objects.equals(idBatalla, batalla.idBatalla);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idBatalla);
    }

    // toString

    @Override
    public String toString() {
        return nombre + " (" + fecha + ")";
    }

    // compareTo (por bajas, de menos a más sangrienta)

    @Override
    public int compareTo(Batalla b) {
        return Integer.compare(this.bajas, b.bajas);
    }
}

