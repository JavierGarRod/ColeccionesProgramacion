package Controller;

import Models.Animal;
import Models.CentroAcogida;
import Repository.RepositorioPawShelter;
import Exception.MiExcepcion;

import java.time.LocalDate;

public class GestionaPawShelter {
    static void main() {

        RepositorioPawShelter repo=new RepositorioPawShelter();

        Animal a1=new Animal("a","Pepe","Caniche", LocalDate.now());
        Animal a2=new Animal("b","Pepa","Caniche", LocalDate.now().plusDays(5));
        Animal a3=new Animal("c","Elena","Pinche Enano", LocalDate.now().plusMonths(1));
        Animal a4=new Animal("d","Javi","Chiguagua", LocalDate.now().plusDays(2));
        Animal a5=new Animal("f","Soraya","Dalmata", LocalDate.now());
        Animal a6=new Animal("g","Ale","Perro Alemán", LocalDate.now().plusWeeks(2));

        System.out.println("\n APARTADO 3 | REGISTRO DE CENTROS CON SUS ANIMALITOS");
        CentroAcogida c1=new CentroAcogida("Perro Center",null,30);
        repo.registrarCentro(c1);
        repo.registrarAnimal("Perro Center",null,30,a1);
        CentroAcogida c2=new CentroAcogida("Dog Center",null,30);
        repo.registrarCentro(c2);
        repo.registrarAnimal("Dog Center",null,30,a2);
        CentroAcogida c3=new CentroAcogida("Pet Center",null,30);
        repo.registrarCentro(c3);
        repo.registrarAnimal("Pet Center",null,30,a3);
        CentroAcogida c4=new CentroAcogida("Tu Mascota De Confi",null,30);
        repo.registrarCentro(c4);
        repo.registrarAnimal("Tu Mascota De Confi",null,30,a4);
        System.out.println(repo);

        System.out.println("\n APARTADO 3 | REGISTRO DE UN ANIMAL ADICIONAL A UN CENTRO");
        repo.registrarAnimal("Perro Center",null, 0,a5);
        System.out.println(repo);

        try{
            System.out.println("\n APARTADO 3 | REGISTRO DE UN ANIMAL YA REGISTRADO AL UN CENTRO");
            repo.registrarAnimal("Pet Center",null, 0,a3);
            System.out.println(repo);
        } catch (MiExcepcion e){
            System.out.println(e);
        }

        System.out.println("\n APARTADO 3 | REGISTRO DE UN ANIMAL NUEVO A UN CENTRO NUEVO");
        repo.registrarAnimal("Tu Futura Mascota",null,30,a6);
        System.out.println(repo);

        System.out.println("\n APARTADO 4");
        try{
            System.out.println(repo.getAnimalesCentro(c1));
            System.out.println(repo.getAnimalesCentro(new CentroAcogida("Pepito el grillo",null,0)));
        } catch (MiExcepcion e){
            System.out.println(e);
        }

        System.out.println("\n APARTADO 5  NO ME FUNCIONAAAAAAAAA");
        System.out.println(repo.obtenerAnimalesPorEspecie());
    }
}