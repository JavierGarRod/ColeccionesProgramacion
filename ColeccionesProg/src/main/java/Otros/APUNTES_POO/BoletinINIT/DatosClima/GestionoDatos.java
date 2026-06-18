package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.DatosClima;

import java.time.LocalDate;

public class GestionoDatos {
    public static void main(String[] args) {

        // 1. Crear los datos de cada día
        Datos d1 = new Datos(-2, 8, 5);
        Datos d2 = new Datos(0, 0, 0);   // para probar validar()
        Datos d3 = new Datos(-6, 3, 10); // riesgo de nieve
        Datos d4 = new Datos(5, 15, 0);
        Datos d5 = new Datos(2, 12, 1);
        Datos d6 = new Datos(-1, 9, 3);
        Datos d7 = new Datos(4, 14, 0);

        // 2. Crear los registros diarios (1 por día)
        RegistroDiario r1 = new RegistroDiario(d1, LocalDate.of(2024, 1, 1), "Sevilla");
        RegistroDiario r2 = new RegistroDiario(d2, LocalDate.of(2024, 1, 2), "Sevilla");
        RegistroDiario r3 = new RegistroDiario(d3, LocalDate.of(2024, 1, 3), "Sevilla");
        RegistroDiario r4 = new RegistroDiario(d4, LocalDate.of(2024, 1, 4), "Sevilla");
        RegistroDiario r5 = new RegistroDiario(d5, LocalDate.of(2024, 1, 5), "Sevilla");
        RegistroDiario r6 = new RegistroDiario(d6, LocalDate.of(2024, 1, 6), "Sevilla");
        RegistroDiario r7 = new RegistroDiario(d7, LocalDate.of(2024, 1, 7), "Sevilla");

        // 3. Meterlos en un array de semana
        RegistroDiario[] semana = {r1, r2, r3, r4, r5, r6, r7};

        System.out.println("Riesgo de nieve día 3:");
        d3.calculo_riesgo_nieve();

        System.out.println("¿Error en toma de datos día 2?");
        d2.alertarPosibleErrorEnTomaDatos();
    }
}
