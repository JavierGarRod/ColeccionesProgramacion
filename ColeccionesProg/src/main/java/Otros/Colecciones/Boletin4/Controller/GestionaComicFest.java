package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin4.Controller;

import programacion.Tema1.ActividadesU1Java.Colecciones.Boletin4.Models.*;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;

public class GestionaComicFest {

    public static void main(String[] args) {

        RegistroEntradas registro = new RegistroEntradas();

        Influencer i1 = new Influencer("Laura Pérez", "LauGames", 500000, "Twitch");
        Influencer i2 = new Influencer("Carlos Ruiz", "Carlitros", 800000, "YouTube");

        EntradaVip e1 = new EntradaVip("VIP001", LocalDate.of(2026,1,15), TipoEntradaVip.GOLD);
        EntradaVip e2 = new EntradaVip("VIP002", LocalDate.of(2026,1,20), TipoEntradaVip.PLATINIUM);

        registro.addEntrada(i1, e1, EstadoEntradaVip.CONFIRMADA);
        registro.addEntrada(i2, e2, EstadoEntradaVip.CONFIRMADA);

        System.out.println(registro);

        registro.confirmar("LauGames", "Twitch");
        registro.cancelar("Carlitros", "YouTube");

        System.out.println(registro);


    }
}

