package ColeccionesProg.src.main.java.Otros.APUNTES_POO.SIMULACROS_IA.RolesClase;

public class CentroInnovacion {
    private Persona[] persona;
    private Actividad[] actividad;
    private Acceso[] acceso;
    private int contPersonas;
    private int contadorActividad;
    private int contAcceso;

    public CentroInnovacion() {
        this.persona = new Persona[200];
        this.actividad = new Actividad[100];
        this.acceso = new Acceso[500];
    }

    public void registrarPersona(Persona p){
        persona[contPersonas ++] = p;
    }

    public void registrarActividad(Actividad a){
        actividad[contadorActividad ++] = a;
    }

    public void registrarAcceso(Acceso acc){
        acceso[contAcceso ++] = acc;
    }

    public void imprimirResumen(){

        System.out.println("\n---PERSONAS---");
        for (Persona p : persona){
            if (p == null) continue;
            System.out.println(p);
        }

        System.out.println("\n---ACTIVIDADES---");
        for (Actividad a : actividad){
            if(a == null) continue;
            System.out.println(a + " | Coste: "+ a.calcularCoste());
        }

        System.out.println("\n---ACCESO---");
        for (Acceso acc: acceso){
            if (acc == null) continue;
            System.out.println(acc);
        }
        System.out.println("Total accesos registrados: " +  Acceso.getContador());
    }
}
