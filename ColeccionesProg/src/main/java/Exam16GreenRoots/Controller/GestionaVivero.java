package Exam16GreenRoots.Controller;

import Exam16GreenRoots.Models.*;
import Exam16GreenRoots.Repository.RepositorioPlanta;

public class GestionaVivero {
    static void main() {
        PlantaInterior pi1=new PlantaInterior(-5,10, NivelLuz.MEDIA);
        PlantaExterior pe1=new PlantaExterior(12.50,80,10, true);

        try{
            pe1.vender(140);
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        PlantaInterior pi2=new PlantaInterior(8.00,40,5,NivelLuz.ALTA);
        try{
            pi2.modificarEstado(Estado.RESERVADA);
            pi2.modificarEstado(Estado.AGOTADA);
        } catch (RuntimeException e){
            System.out.println(e);
        }


        PlantaExterior pe2=new PlantaExterior(20.00,15,3,false);
        try{
            pe2.modificarEstado(Estado.AGOTADA);
            System.out.println(pe2.getResumen());
            System.out.println(pe2.calcularValorStock());

            pe2.modificarEstado(Estado.VENDIDA);
        } catch (RuntimeException e){
            System.out.println(e);
        }

        System.out.println(pe1.calcularPrecioConDescuento(0.15));
        System.out.println(pe1.getResumen());

        try{
            System.out.println(pi2.calcularPrecioConDescuento(1.10));
        } catch (RuntimeException e){
            System.out.println(e);
        }

        System.out.println("\n APARTADO DE COLECCIONES");
        RepositorioPlanta repo=new RepositorioPlanta();
        PlantaExterior pe10=new PlantaExterior("Pepito",80,true);
        repo.añadirClave(pe10.getNombreCientifico(), (int) pe10.getPrecioVenta());
        PlantaExterior pe11=new PlantaExterior("Pepe",20,false);
        repo.añadirClave(pe11.getNombreCientifico(), (int) pe11.getPrecioVenta());
        System.out.println("\nAñadir elementos");
        System.out.println(repo);



        System.out.println("\nBuscar elemento que existe");
        System.out.println(repo.buscarClave("Pepe"));

        repo.eliminarClave("Pepito");
        System.out.println("\nEliminar elemento Pepito");
        System.out.println(repo);

        repo.modificarClave("Pepe",25);
        System.out.println("\nModificar elemento Pepe de 20 a 25");
        System.out.println(repo);
    }
}
