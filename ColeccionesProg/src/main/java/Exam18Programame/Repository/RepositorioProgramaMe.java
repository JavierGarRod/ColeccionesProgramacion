package Exam18Programame.Repository;

import Exam18Programame.Exceptions.ProgramaMeException;
import Exam18Programame.Models.*;

import java.time.LocalDateTime;
import java.util.*;

public class RepositorioProgramaMe{
    private Map<Equipo, List<IntentoReto>>registroProgramaMe;  //He escogido esta estructura ya que necesito guardar equipos con sus intentos de retos con duplicados

    public RepositorioProgramaMe(Map<Equipo, List<IntentoReto>> registroProgramaMe) {
        this.registroProgramaMe = new HashMap<Equipo, List<IntentoReto>>();
    }

    public void registrarEquipo(Equipo equipoRegistar){
        if(registroProgramaMe.containsKey(equipoRegistar)){
            throw new ProgramaMeException("Ese equipo ya se encuentra registrado");
        }
        registroProgramaMe.put(equipoRegistar,new ArrayList<>());
    }

    public boolean estaAgregado(String idBuscar){
        boolean existe = false;
        List<Equipo> equipos = new ArrayList<>(registroProgramaMe.keySet());
        for(Equipo e: equipos){
            if(e.getIdEquipo().equalsIgnoreCase(idBuscar)){
                existe = true;
            }
        }
        return existe;
    }

    public void registrarEnvio(String idEquipo, Reto retoRegistrar, ListaErrores tipoError){
        IntentoReto intento= null;
        if(tipoError == null)
        {
            if(intento.getEstadoReto()==Estado.SUPERADO){
                throw new ProgramaMeException("Ese reto ya ha sido registrado y superado por el grupo");
            }
            else{
                intento = new IntentoReto(retoRegistrar, Estado.SUPERADO, null, LocalDateTime.now());
            }
        }
        else
        {

             intento = new IntentoReto(retoRegistrar, Estado.NO_SUPERADO, tipoError, LocalDateTime.now());
        }
        Equipo e = new Equipo(idEquipo);
        if(!registroProgramaMe.containsKey(e)){
            List<IntentoReto> intentos=new ArrayList<IntentoReto>();
            intentos.add(intento);
            registroProgramaMe.put(e,intentos);
        }
        else{
            List<IntentoReto> intentosDeEquipo=this.registroProgramaMe.get(e);
            intentosDeEquipo.add(intento);
        }
    }

    public List<IntentoReto> getRetoSuperado(String idEquipo){
        List<IntentoReto> resultado=new ArrayList<IntentoReto>();
        Equipo e = new Equipo(idEquipo);
        if(registroProgramaMe.containsKey(e)){
            List<IntentoReto> todosIntentosEquipo = registroProgramaMe.get(e);
            for(IntentoReto i: todosIntentosEquipo )
            {
                if(i.getEstadoReto().equals( Estado.SUPERADO))
                {
                    resultado.add(i);
                }
            }
            Collections.sort(resultado, new ComparadorFechaEId());
        }
        else {
            throw new ProgramaMeException("Ese equipo no se encuentra registrado");
        }

        return resultado;
    }
    /*
    *Este método devolverá la lista de los 3 equipos con más retos superados.
    *En caso de empate, si dos o más equipos tienen el mismo número de retos superados, devolverá los que han sido más rápidos
    */
    public List<Equipo> getTop3(){
        List<Equipo> resultado=new ArrayList<>();
        return resultado;
    }

}
