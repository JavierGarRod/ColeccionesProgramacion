package ColeccionesProg.src.main.java.Otros.APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.REPOSITORY;

import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.EXCEPTIONS.*;
import APUNTES_COLECCIONES.APUNTES_TOTALES.RECUPERACION.EJ5.MODEL.*;

import java.util.*;

public class RepoCitas {

    //atributos
    private Map<String, Paciente> pacientes;
    private Map<String, Medico> medicos;
    private List<Cita> citas;

    //constructor
    public RepoCitas() {
        this.pacientes = new HashMap<>();
        this.medicos = new HashMap<>();
        this.citas = new ArrayList<>();
    }

    //métodos

    public void registrarMedico(Medico medico) throws MedicoYaRegistradoException {
        if(medicos.containsKey(medico.getNum_Unico())){
            throw new MedicoYaRegistradoException("Médico ya existe");
        }
        medicos.put(medico.getNum_Unico(), medico);
    }

    public void registrarPaciente(Paciente paciente) throws PacienteYaRegistradoException {
        if(pacientes.containsKey(paciente.getNum_Unico())){
            throw new PacienteYaRegistradoException("Paciente ya existe");
        }
        pacientes.put(paciente.getNum_Unico(), paciente);
    }

    public void crearCita(Medico medico, Paciente paciente, String fecha, String motivo) throws MedicoNoEncontradoException, PacienteNoEncontradoException, MedicoOcupadoException {

        if (!medicos.containsKey(medico.getNum_Unico())) {
            throw new MedicoNoEncontradoException("Médico no encontrado");
        }
        if (!pacientes.containsKey(paciente.getNum_Unico())) {
            throw new PacienteNoEncontradoException("Paciente no encontrado");
        }
        for (Cita c : citas) {
            if (c.getMedico().equals(medico) &&
                    c.getFechaCita().equals(fecha) &&
                    c.getEstadoCita() == Tipo_Estado.PENDIENTE) {
                throw new MedicoOcupadoException("El médico ya tiene una cita ese día");
            }
        }
        citas.add(new Cita(paciente, medico, fecha, motivo, Tipo_Estado.PENDIENTE));
    }

    public void cancelarCita(int id) throws CitaNoModificableException, CitaNoExistente{
        boolean encontrada = false;
        for(Cita c: citas){
            if(c.getId() == id) {
                encontrada = true;

                if(c.getEstadoCita() == Tipo_Estado.REALIZADA){
                    throw new CitaNoModificableException("Cita no modificable");
                }
                c.setEstadoCita(Tipo_Estado.CANCELADA);
            }
        }
        if(!encontrada){
            throw new CitaNoExistente("La cita no existe");
        }
    }

    public void citaRealizada(Cita c){
        c.setEstadoCita(Tipo_Estado.REALIZADA);
    }

    public List<Cita> mostrarCitasPendientesMedico(Medico medico){
        List<Cita> citasMedico = new ArrayList<>();
        for(Cita c: citas){
            if(c.getMedico().equals(medico) && c.getEstadoCita() == Tipo_Estado.PENDIENTE){
                citasMedico.add(c);
            }
        }
        Collections.sort(citasMedico);
        return citasMedico;
    }

    public List<Cita> mostrarCitasPacientes(Paciente paciente){
        List<Cita> citasPaciente = new ArrayList<>();
        for(Cita c: citas){
            if(c.getPaciente().equals(paciente)){
                citasPaciente.add(c);
            }
        }
        Collections.sort(citasPaciente);
        return citasPaciente;
    }

    public List<Medico> mostrarMedicosMismaEspecialidad(Tipo_Especialidad especialidad){
        List<Medico> medicoList = new ArrayList<>();
        for(Medico m: medicos.values()){ //se recorren los valores (.keyset recorre llaves y .entrySet las dos cosas)
            if(m.getEspecialidad() == especialidad){
                medicoList.add(m);
            }
        }
        Collections.sort(medicoList);
        return medicoList;
    }

    public Map<Medico,Integer> obtenerResumenMedico(){
        Map<Medico, Integer> resumen = new HashMap<>();
        for(Cita c: citas){
            if(c.getEstadoCita() == Tipo_Estado.REALIZADA){
                if(resumen.containsKey(c.getMedico())){
                    resumen.put(c.getMedico(), resumen.get(c.getMedico())+1);
                }
                else{
                    resumen.put(c.getMedico(), 1);
                }
            }
        }
        return resumen;
    }
}
