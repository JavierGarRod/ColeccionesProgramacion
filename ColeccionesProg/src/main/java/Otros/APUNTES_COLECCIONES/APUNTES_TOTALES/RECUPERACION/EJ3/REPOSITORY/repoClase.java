package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.REPOSITORY;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.EXCEPTIONS.AlumnoYaMatriculadoException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.EXCEPTIONS.ClaseLlenaException;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL.Alumno;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL.Clase;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ3.MODEL.Profesor;

import java.util.*;

public class repoClase {

    //atributos
    HashSet<Alumno> alumnos;
    HashSet<Profesor> profesores;
    HashSet<Clase> clases;

    //constructor
    public repoClase(HashSet<Clase> clases, HashSet<Profesor> profesores, HashSet<Alumno> alumnos) {
        this.clases = clases;
        this.profesores = profesores;
        this.alumnos = alumnos;
    }

    //métodos
    public boolean registrar_profesor(Profesor profe){
        boolean existe = false;
        boolean añadido = false;

        for(Profesor p: profesores){
            if(p.getDNI().equalsIgnoreCase(profe.getDNI())){
                existe = true;
            }
        }
        if(!existe){
            profesores.add(profe);
            añadido = true;
        }
        return añadido;
    }

    public boolean registrar_alumno(Alumno alumno){
        boolean existe = false;
        boolean añadido = false;

        for(Alumno a: alumnos){
            if(a.getDNI().equalsIgnoreCase(alumno.getDNI())){
                existe = true;
            }
        }
        if(!existe){
            alumnos.add(alumno);
            añadido = true;
        }
        return añadido;
    }

    public boolean crear_clase_y_asignar_profe(Clase clase, Profesor profesor) {
        boolean encontrado = false;
        Profesor profeReal = profesor;

        for (Profesor p : profesores) {
            if (p.getDNI().equalsIgnoreCase(profesor.getDNI())) {
                encontrado = true;
                profeReal = p;
            }
        }
        if (!encontrado) {
            profesores.add(profesor);
        }
        clase.setProfesor(profeReal); //no se crea un profe, se modifica
        clases.add(clase);
        return encontrado;
    }

    /*
    SI QUISIERA TIRAR EXCEPCION CUANDO EL PROFE NO EXISTE
    public void crear_clase_y_asignar_profe(Clase clase, Profesor profesor) {

    boolean encontrado = false;
    Profesor profeReal = null;

    for (Profesor p : profesores) {
        if (p.getDNI().equalsIgnoreCase(profesor.getDNI())) {
            encontrado = true;
            profeReal = p;
        }
    }

    if (!encontrado) {
        throw new ProfesorNoEncontradoException("El profesor no está registrado");
    }

    clase.setProfesor(profeReal);
    clases.add(clase);
}
*/

    public void matricular_alumno_en_clase(Alumno alumno, Clase clase) throws AlumnoYaMatriculadoException, ClaseLlenaException {
        boolean duplicado = false;

        for (Alumno a : clase.getAlumnos()) { //tengo que usar la lista de alumnos de la clase
            if (a.getDNI().equalsIgnoreCase(alumno.getDNI())) {
                duplicado = true;
            }
        }

        if (duplicado) {
            throw new AlumnoYaMatriculadoException("Alumno ya matriculado en esta clase");
        }

        if (clase.getAlumnos().size() >= 10) {
            throw new ClaseLlenaException("La clase está llena");
        }

        // Si todo está bien → añadir alumno a la lista de la clase
        clase.getAlumnos().add(alumno);
    }

    public void eliminar_alumno_de_clase(Alumno alumno) {
        boolean encontrado = false;

        for (Clase c : clases) {
            Iterator<Alumno> it = c.getAlumnos().iterator(); //iterator de la lista alumnos de la clase

            while (it.hasNext()) {
                Alumno a = it.next();
                if (a.getDNI().equalsIgnoreCase(alumno.getDNI())) {
                    it.remove();
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("El alumno no está matriculado en ninguna clase");
        }
    }

    public List<Alumno> mostrar_alumnos_de_clase(Clase clase){
        List<Alumno> alumnos1 = new ArrayList<>(clase.getAlumnos());
        Collections.sort(alumnos1);
        return alumnos1;
    }

    public List<Clase> clases_de_profesor(Profesor p) {
        List<Clase> lista = new ArrayList<>();

        for (Clase c : clases) {
            if (c.getProfesor().getDNI().equalsIgnoreCase(p.getDNI())) {
                lista.add(c);
            }
        }
        return lista;
    }

    public List<Clase> buscar_alumno_clases(String DNI){
        List<Clase> clases_por_alumno = new ArrayList<>();

        for(Clase c: clases){
            for(Alumno a: c.getAlumnos()){
                if(a.getDNI().equalsIgnoreCase(DNI)){
                    clases_por_alumno.add(c);
                }
            }
        }
        return clases_por_alumno;
    }
}
