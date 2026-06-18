package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro4;

public class Valoracion {

    private Usuario usuario;
    private ValoracionTipo tipo;

    public Valoracion(Usuario usuario, ValoracionTipo tipo) {
        this.usuario = usuario;
        this.tipo = tipo;
    }

    public ValoracionTipo getTipo() {
        return tipo;
    }
}

