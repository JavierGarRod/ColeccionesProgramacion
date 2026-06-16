package ExamRecuSonorama.Controller;


import ExamRecuSonorama.Exception.MiException;
import ExamRecuSonorama.Models.Actuacion;
import ExamRecuSonorama.Models.Escenario;
import ExamRecuSonorama.Repository.RepositorioSonorama;

import java.time.LocalDateTime;

public class GestionaSonorama {
    public static void main(String[] args) {

        //Actuaciones
        Actuacion a1 = new Actuacion("NOsEaYUdA", "Elena", LocalDateTime.now(), 60);
        Actuacion a2 = new Actuacion("HOLI", "Soraya", LocalDateTime.of(2000,12,3,3,4,2), 60);
        Actuacion a3 = new Actuacion("needVACATIONS", "Rena", LocalDateTime.of(2012,11,5,5,6,2), 100);
        Actuacion a4 = new Actuacion("Programacion", "Ali", LocalDateTime.of(2020,2,3,4,5,6), 600);
        Actuacion a5 = new Actuacion("holiholi", "Yina", LocalDateTime.of(2010,3,4,5,6,7,2), 340);
        Actuacion a6 = new Actuacion("Base de datos", "Jesus", LocalDateTime.of(2017,11,24,3,5,7), 50);

        //Escenarios
        Escenario e1 = new Escenario("Los TT", "POP",100);
        Escenario e2 = new Escenario("Las RR", "ROCK",3000);
        Escenario e3 = new Escenario("Los NN", "CLASICA",2700);
        Escenario e4 = new Escenario("Los LL", "JAZZ",2300);

        //Repositorio
        RepositorioSonorama repo = new RepositorioSonorama();

        //Registrar escenarios y validar si se registraron bien
        try{
            repo.registrarEscenario(e1);
            repo.registrarEscenario(e2);
            repo.registrarEscenario(e3);
            repo.registrarEscenario(e4);
        } catch (MiException e){
            System.out.println(e);
        }

        //Asignar actuaciones
        try{
            repo.asignarActuacionAEscenario("Los TT", "POP", 39,a1);
            repo.asignarActuacionAEscenario("Las RR", "ROCK", 3000,a2);
            repo.asignarActuacionAEscenario("Los NN", "CLASICA", 2700,a3);
            repo.asignarActuacionAEscenario("Los LL", "JAZZ", 2300,a4);
        } catch (MiException e){
            System.out.println(e);
        }

        //Asignar una segunda actuación al primer escenario
        try{
            repo.asignarActuacionAEscenario("Los TT", "POP",100, a5);
        } catch (MiException e) {
            System.out.println(e);;
        }

        //Intentar asignar a un escenario una actuacion ya asignada
        try{
            repo.asignarActuacionAEscenario("Los TT", "POP", 39, a3);
        }catch (MiException e){
            System.out.println(e);
        }

        //Asignar actuación a un escenario con nuevo nombre (comprobar que se crea el escenario)
        try{
            repo.asignarActuacionAEscenario("Los diozes", "Regaetton", 50, a6);
        }catch (MiException e){
            System.out.println(e);
        }

        //Probar listar las actuaciones por escenario con uno que existe y otro que no
        System.out.println("\n---LISTA ACTUACIONES DE UN ESCENARIO REGISTRADO---");
        try {
            for (Actuacion a : repo.mostrarActuacionesEscenario(e2)) { //se ha registrado
                System.out.println(a);
            }
        } catch (MiException e){
            System.out.println(e);
        }

        System.out.println("\n---LISTA ACTUACIONES DE UN ESCENARIO NO REGISTRADO---");
        try {
            for (Actuacion a : repo.mostrarActuacionesEscenario(new Escenario("Los caracoles", "POP", 40))) { //no se ha registrado
                System.out.println(a);
            }
        } catch (MiException e){
            System.out.println(e);
        }

        //Mostrar Mapa apartado 5
        System.out.println("\n---MAPA TIPO_MUSICA Y ACTUACIONES PARA ESCENARIO---");
        System.out.println(repo.obtenerNumeroActuacionesPorTipoMusica());
    }
}
