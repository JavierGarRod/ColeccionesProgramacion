package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin4.Models;

import java.util.*;

public class RegistroEntradas{
    Map<Influencer, EntradaVip> registro;

    public RegistroEntradas() {
        this.registro = new HashMap<>();
    }

    public void addEntrada(Influencer i, EntradaVip e, EstadoEntradaVip estadoEntradaVip){
        estadoEntradaVip.equals(EstadoEntradaVip.ENVIADA);
        if(i.entradaVip==null){
            registro.put(i,e);
            estadoEntradaVip.equals(EstadoEntradaVip.CONFIRMADA);
        }
        else{

            System.out.println("El influencer ya tiene una entrada Vip");
            estadoEntradaVip.equals(EstadoEntradaVip.CANCELADA);
        }
    }
    // Buscar entrada por nick + plataforma, si no la encuentra da null
    public EntradaVip buscar(String nick, String plataforma) {
        Influencer inf=new Influencer(nick, plataforma);
        EntradaVip e= registro.get(inf);
        return e;
    }

    // Confirmar asistencia
    public boolean confirmar(String nick, String plataforma) {
        EntradaVip e = buscar(nick, plataforma);
        boolean confirmacion;
        if (e != null) {
            e.estadoDeEntrada.equals(EstadoEntradaVip.CONFIRMADA);
            confirmacion= true;
        }
        confirmacion= false;
        return confirmacion;
    }

    // Cancelar asistencia
    public boolean cancelar(String nick, String plataforma) {
        EntradaVip e = buscar(nick, plataforma);
        boolean cancelacion;
        if (e != null) {
            e.estadoDeEntrada.equals(EstadoEntradaVip.CANCELADA);
            cancelacion= true;
        }
        cancelacion= false;
        return cancelacion;
    }

    /*public void listadoConfirmados(){
        Set<Influencer> influencersConfirmados=new HashSet<Influencer>();
        Iterator<Map.Entry<Influencer,EntradaVip>> it= this.registro.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Influencer,EntradaVip> pareja=it.next();
            if(pareja.getValue().getEstadoDeEntrada(EstadoEntradaVip.CONFIRMADA){
                influencersConfirmados.add(pareja.getKey());
            }
        }
    }*/

    @Override
    public String toString() {
        return "RegistroEntradas{" +
                "registro=" + registro +
                '}';
    }
}
