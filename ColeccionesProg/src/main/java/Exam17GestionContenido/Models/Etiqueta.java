package Exam17GestionContenido.Models;

import java.util.Objects;

public class Etiqueta implements Comparable<Etiqueta>{
    private String nombre;
    CategoriaEtiqueta categoria;

    public Etiqueta(String nombre, CategoriaEtiqueta categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaEtiqueta getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEtiqueta categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Etiqueta etiqueta = (Etiqueta) o;
        return Objects.equals(nombre, etiqueta.nombre) && categoria == etiqueta.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, categoria);
    }

    @Override
    public int compareTo(Etiqueta o) {
        int resultado=this.categoria.compareTo(o.getCategoria());
        if(resultado == 0)
        {
            resultado = this.nombre.compareTo(o.getNombre());
        }
        return resultado;
    }
}
