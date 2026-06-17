package Exam17GestionContenido.Models;

import java.time.LocalDateTime;
import java.util.*;

import Exam17GestionContenido.Exception.ContenidoException;

public class Contenido {
    public static int contador=0;
    private int idContenido;
    private String titulo;
    TipoContenido tipo;
    LocalDateTime fechaPublicacion;
    Creador creador;
    EstadoContenido estado;
    private int visualizaciones;
    Set<Etiqueta> etiquetas;  //He elegido un TreeSet ya que el orden de inserción no es relevante

    public Contenido(String titulo, TipoContenido tipo, LocalDateTime fechaPublicacion, Creador creador, EstadoContenido estado, int visualizaciones, Map<String, String> etiquetas) {
        this.idContenido = contador++;
        this.titulo = titulo;
        this.tipo = tipo;
        this.fechaPublicacion = fechaPublicacion;
        this.creador = creador;
        this.estado = EstadoContenido.BORRADOR;
        this.visualizaciones = visualizaciones;
        this.etiquetas = new TreeSet<>();
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contenido.contador = contador;
    }

    public int getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public TipoContenido getTipo() {
        return tipo;
    }

    public void setTipo(TipoContenido tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Creador getCreador() {
        return creador;
    }

    public void setCreador(Creador creador) {
        this.creador = creador;
    }

    public EstadoContenido getEstado() {
        return estado;
    }

    public void setEstado(EstadoContenido estado) {
        this.estado = estado;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public Set<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(Set<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contenido contenido = (Contenido) o;
        return idContenido == contenido.idContenido;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idContenido);
    }

    public void agregarEtiqueta(Etiqueta etiquetaAgregar) throws ContenidoException {
        if(estado.equals(EstadoContenido.ELIMINADO) || estado.equals(EstadoContenido.ARCHIVADO)){
            throw new ContenidoException("No se puede añadir una etiqueta con un contenido: "+estado);
        }
        else{
            etiquetas.add(etiquetaAgregar);
        }
    }
}
