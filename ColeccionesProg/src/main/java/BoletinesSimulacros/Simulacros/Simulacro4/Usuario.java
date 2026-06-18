package ColeccionesProg.src.main.java.BoletinesSimulacros.Simulacros.Simulacro4;

public class Usuario implements Comparable<Usuario> {

    private String nombre;
    private String password;

    public Usuario(String nombre, String password) throws UserMemoryException {
        if (nombre.length() < 6) {
            throw new UserMemoryException("Usuario no es correcto");
        }
        if (!password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}")) {
            throw new UserMemoryException(
                    "La clave no cumple alguno de estos requisitos: contiene mayúsculas, minúsculas y números y tiene 8 o más caracteres"
            );
        }
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Usuario o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario u = (Usuario) o;
        return nombre.equalsIgnoreCase(u.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return nombre;
    }
}

