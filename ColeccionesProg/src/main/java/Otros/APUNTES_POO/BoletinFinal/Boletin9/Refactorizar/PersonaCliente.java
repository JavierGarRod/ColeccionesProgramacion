package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Refactorizar;

public class PersonaCliente extends Persona implements ICliente {

    public PersonaCliente(String nombre) {
        super(nombre);
    }

    @Override
    public void comprar() {
        System.out.println(getNombre() + " está comprando.");
    }
}

