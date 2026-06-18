package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Gato;

public class Gato {
    String color;
    int edad;
    int peso;
    String raza;
    String sexo;

    public Gato(String color, int edad, int peso, String raza, String sexo) {
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.sexo = sexo;
    }

    public void ronronea(){
        System.out.println("Prrrr");
    }
    public void maulla(){
        System.out.println("Miau");
    }
    public void come(String comida){
        if (comida.equals("pienso")){
            System.out.println("Yummy yummy");
        }
        else{
            System.out.println("Buaaah, mejor no");
        }
    }
    public void pelear(Gato enemigo){
        if(enemigo.sexo.equals(this.sexo)){
            System.out.println("Ven aquí que te vas a enterar");
        }
        else{
            System.out.println("La violencia nunca es la solución");
        }
    }
}
