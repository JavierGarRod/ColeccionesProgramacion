package ColeccionesProg.src.main.java.BoletinesSimulacros.Bolt2.Ej1;

public class GestionaAnimales {

    public static void main(String[] args) {

        RepositorioAnimal repo = new RepositorioAnimal("Reserva Doñana", "Huelva", 500000);

        repo.agregarAnimal(new Animal(1, "León", "a ", 5, "Carnívoro", "2019-03-10", 190, "Tierra", "Vivíparo"));
        repo.agregarAnimal(new Animal(2, "Águila", "b", 3, "Carnívoro", "2021-05-12", 6, "Aire", "Ovíparo"));
        repo.agregarAnimal(new Animal(3, "Tortuga", "c", 80, "Herbívoro", "1944-07-22", 200, "Agua", "Ovíparo"));

        repo.mostrarAnimales();
    }
}

