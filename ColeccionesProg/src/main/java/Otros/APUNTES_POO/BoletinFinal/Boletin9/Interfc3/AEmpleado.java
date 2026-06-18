package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinFinal.Boletin9.Interfc3;

public abstract class AEmpleado implements INomina {

    protected String nombre;
    protected String identificador;
    protected String apellidos;
    protected double salario;
    protected boolean tieneReduccionHoraria;
    protected Categoria categoria;

    public AEmpleado(String nombre, String identificador, String apellidos,
                     double salario, Categoria categoria, boolean reduccion) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.apellidos = apellidos;
        this.salario = salario;
        this.categoria = categoria;
        this.tieneReduccionHoraria = reduccion;
    }

    public abstract void imprimeHorario();
    public abstract String[] devuelveFunciones();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AEmpleado e)) return false;
        return this.identificador.equalsIgnoreCase(e.identificador);
    }

    @Override
    public String toString() {
        return identificador + " | " + nombre + " | " + salario;
    }
}

