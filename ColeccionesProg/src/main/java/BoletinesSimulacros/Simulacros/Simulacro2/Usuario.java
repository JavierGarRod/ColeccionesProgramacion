package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro2;

public class Usuario {

    private static int contador = 1;

    private int id;
    private String nombreCompleto;
    private String email;

    public Usuario(String nombreCompleto, String email) {
        this.id = contador++;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Usuario{id=" + id + ", nombre='" + nombreCompleto + "', email='" + email + "'}";
    }
}

