package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.CONTROLLER;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.EXCEPTIONS.*;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.MODEL.*;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.REPOSITORY.RepoCitas;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Gestiona {
    public static void main(String[] args) {

        // Médicos
        Medico m1 = new Medico("Carlos", "García López", "12345678A", "611111111", Tipo_Especialidad.CIRUJANO, "COL001");
        Medico m2 = new Medico("Ana", "Martínez Ruiz", "12345678B", "622222222", Tipo_Especialidad.PEDIATRA, "COL002");
        Medico m3 = new Medico("Luis", "Pérez Soto", "12345678C", "633333333", Tipo_Especialidad.CIRUJANO, "COL003");
        Medico m4 = new Medico("María", "López Vega", "12345678D", "644444444", Tipo_Especialidad.GINECÓLOGO, "COL004");

        // Pacientes
        Paciente p1 = new Paciente("Pedro", "Sánchez Gil", "87654321A", "655555555", "PAC001", LocalDate.of(1990, 3, 15), Grupo_Sanguineo.A_POS);
        Paciente p2 = new Paciente("Laura", "Romero Cruz", "87654321B", "666666666", "PAC002", LocalDate.of(1985, 7, 22), Grupo_Sanguineo.O_NEG);
        Paciente p3 = new Paciente("Marcos", "Díaz Leal", "87654321C", "677777777", "PAC003", LocalDate.of(2000, 1, 10), Grupo_Sanguineo.B_POS);

        // Repositorio
        RepoCitas repo = new RepoCitas();

        //NOTAS ANTES DE PONER A PRUEBA LOS MÉTODOS
        //Cuando un método tiene un throw exception, tiene que ponerse dentro de un TRY y CATCH

        // Registrar médicos
        try {
            repo.registrarMedico(m1);
            repo.registrarMedico(m2);
            repo.registrarMedico(m3);
            repo.registrarMedico(m4);
        } catch (MedicoYaRegistradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Intentar médico duplicado
        try {
            repo.registrarMedico(new Medico("Copia", "García", "99999999Z", "600000000", Tipo_Especialidad.CIRUJANO, "COL001"));
        } catch (MedicoYaRegistradoException e) {
            System.out.println("Duplicado capturado: " + e.getMessage());
        }

        // Registrar pacientes
        try {
            repo.registrarPaciente(p1);
            repo.registrarPaciente(p2);
            repo.registrarPaciente(p3);
        } catch (PacienteYaRegistradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Crear citas
        try {
            repo.crearCita(m1, p1, "10/06/2026", "Revisión general");
            repo.crearCita(m1, p2, "10/06/2026", "Consulta urgente");
            repo.crearCita(m2, p1, "11/06/2026", "Control rutinario");
            repo.crearCita(m2, p3, "12/06/2026", "Primera visita");
            repo.crearCita(m3, p2, "10/06/2026", "Postoperatorio");
            repo.crearCita(m1, p3, "13/06/2026", "Análisis");
        } catch (MedicoNoEncontradoException | PacienteNoEncontradoException | MedicoOcupadoException e) {
            System.out.println("Error al crear cita: " + e.getMessage());
        }

        // Intentar médico ocupado ese día
        try {
            repo.crearCita(m1, p3, "10/06/2026", "Consulta duplicada");
        } catch (MedicoNoEncontradoException | PacienteNoEncontradoException | MedicoOcupadoException e) {
            System.out.println("Ocupado capturado: " + e.getMessage());
        }

        // Marcar citas como realizadas (las dos primeras)
        List<Cita> pendientesM1 = repo.mostrarCitasPendientesMedico(m1);
        if (!pendientesM1.isEmpty()) {
            repo.citaRealizada(pendientesM1.get(0));
        }

        List<Cita> pendientesM2 = repo.mostrarCitasPendientesMedico(m2);
        if (!pendientesM2.isEmpty()) {
            repo.citaRealizada(pendientesM2.get(0));
        }

        // Cancelar una cita
        try {
            repo.cancelarCita(3);
        } catch (CitaNoModificableException | CitaNoExistente e) {
            System.out.println("Error al cancelar: " + e.getMessage());
        }

        // Intentar cancelar una cita ya realizada
        try {
            repo.cancelarCita(0);
        } catch (CitaNoModificableException | CitaNoExistente e) {
            System.out.println("No modificable capturado: " + e.getMessage());
        }

        // Citas pendientes de m1
        System.out.println("\n--- CITAS PENDIENTES DE " + m1.getNobre() + " ---");
        for (Cita c : repo.mostrarCitasPendientesMedico(m1)) {
            System.out.println(c);
        }

        // Historial de p1
        System.out.println("\n--- HISTORIAL DE " + p1.getNobre() + " ---");
        for (Cita c : repo.mostrarCitasPacientes(p1)) {
            System.out.println(c);
        }

        // Médicos cirujanos
        System.out.println("\n--- CIRUJANOS ---");
        for (Medico m : repo.mostrarMedicosMismaEspecialidad(Tipo_Especialidad.CIRUJANO)) {
            System.out.println(m);
        }

        // Resumen por médico
        System.out.println("\n--- RESUMEN CITAS REALIZADAS ---");
        for (Map.Entry<Medico, Integer> entry : repo.obtenerResumenMedico().entrySet()) {
            System.out.println(entry.getKey().getNobre() + " → " + entry.getValue() + " citas realizadas");
        }
    }
}