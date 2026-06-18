package ColeccionesProg.src.main.java.Otros.APUNTES_POO.BoletinINIT.Notas;

public class NotaAsignatura {
    // atributos
    String asignatura;
    int nota1; // mejor que sea double
    int nota2;
    int nota3;

    // constructor
    public NotaAsignatura(String asignatura, int nota1, int nota2, int nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // metodos
    public int calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    int trimestres_aprobados() {
        int contador = 0;

        if (nota1 >= 5) contador++;
        if (nota2 >= 5) contador++;
        if (nota3 >= 5) contador++;

        return contador;
    }

    @Override
    public String toString() {
        return "NotaAsignatura{" +
                "asignatura='" + asignatura + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }
}