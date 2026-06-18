package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.RolesClase;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GestionaCentro {
    public static void main(String[] args) {

        // centro
        CentroInnovacion centro =new CentroInnovacion();

        // personas
        Persona p1 = new EstudianteBecado("Rena", "R1", LocalDate.of(2024,5,10));
        Persona p2  = new ProfesorInvestigador("Paco", "R2", LocalDate.now());
        Persona p3 = new TecnicoLaboratorio("Miguel", "R3", LocalDate.of(2007, 4, 2));
        Persona p4 = new InvestigadorSenior("Eduardo", "R4", LocalDate.of(2004, 12,30));
        Persona p5 = new ProfesorVisitante("Lucas", "R5", LocalDate.now());
        Persona p6 = new EstudianteTecnico("Storm", "R6", LocalDate.of(2008,12,9));

        // actividades
        Actividad a1 = new Seminario("Java Básico", LocalDate.now(), 3);
        Actividad a2 = new Taller("Robótica", LocalDate.now(), 5);
        Actividad a3 = new ProyectoInvestigacion("IA Avanzada", LocalDate.now(), 10);

        // accesos
        Acceso acc1 = new Acceso(p1, TipoAcceso.ENTRADA, LocalDateTime.now());
        Acceso acc2 = new Acceso(p1, TipoAcceso.SALIDA, LocalDateTime.now());

        // registro
        Persona[] personas = { p1, p2, p3, p4, p5, p6 };
        for (Persona p : personas) {
            centro.registrarPersona(p);
        }

        Actividad [] actividad= {a1,a2,a3};
        for (Actividad a: actividad){
            centro.registrarActividad(a);
        }

        Acceso [] acceso = {acc1,acc2};
        for (Acceso acc: acceso){
            centro.registrarAcceso(acc);
        }

        // recorrer lista de personas y ejecutar cada roll
        for (Persona p : personas){
            if (p == null) continue;
            p.presentarse();

            if (p instanceof Investigador inv) inv.investigar();
            if (p instanceof Profesor prf) prf.impartirClase();
            if (p instanceof Estudiante est) est.estudiar();
            if (p instanceof Tecnico tec) tec.repararEquipos();
            System.out.println();
        }

        //imprimir resumen
        centro.imprimirResumen();
    }
}
