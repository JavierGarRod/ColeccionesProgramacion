package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin1.Ej1.Model;

import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin1.Ej1.Exception.EstudianteNoEncontradoException;
import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin1.Ej1.Exception.GrupoNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    // ATRIBUTOS

    private String descripcion;
    private String tutor;
    private String aula;
    private Horario horario;
    private List<Estudiante> estudiantes;


    // CONSTRUCTOR

    public Grupo(String descripcion, String tutor, String aula) {
        this.descripcion = descripcion;
        this.tutor = tutor;
        this.aula = aula;
        this.horario = new Horario();
        this.estudiantes = new ArrayList<>();
    }


    // MÉTODOS

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public Estudiante buscarEstudiante(String id) throws EstudianteNoEncontradoException {
        boolean encontrado=false;
        int i =0;
        Estudiante e=null;
        while(!encontrado && i<this.estudiantes.size()){
            if (estudiantes.get(i).getId().equalsIgnoreCase(id)){
                encontrado=true;
                e=estudiantes.get(i);
            }
            else{
                i++;
            }
        }
        return e;
    }

    public double calcularPromedioEstudiante(String id){
        Estudiante e = buscarEstudiante(id);
        double resultado=0;
        if(e==null){
            throw new EstudianteNoEncontradoException("No existe un estudiante con ID: " + id);
        }
        else{
            resultado=e.calcularPromedio();
        }
        return resultado;
    }

    public double promedioGrupo() throws GrupoNoEncontradoException {
        double suma = 0;
        int contador = 0;

        for (Estudiante e : estudiantes) {
            for (double nota : e.getNotas()) {
                suma += nota;
                contador++;
            }
        }

        if (contador == 0) {
            throw new GrupoNoEncontradoException("No hay notas registradas en el grupo.");
        }

        return (suma / contador);
    }

    public void muestraGrupoYEstudiante(){
        for(int i=0;i<this.estudiantes.size();i++){
            System.out.println(this.descripcion+" - "+this.estudiantes.get(i).toString());
        }
    }

    // GETTERS Y SETTERS

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


    // TOSTRING

    @Override
    public String toString() {
        return "Grupo: " + descripcion + " | Tutor: " + tutor + " | Estudiantes: " + estudiantes.size();
    }
}
