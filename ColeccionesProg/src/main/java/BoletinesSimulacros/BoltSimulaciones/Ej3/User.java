package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej3;

public class User implements Comparable<User> {

    private String nombre;
    private String password;

    public User(String nombre, String password) throws UserMemoryException {

        if (nombre.length() < 6)
            throw new UserMemoryException("Usuario no es correcto");

        if (!password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}"))
            throw new UserMemoryException("La clave no cumple alguno de estos requisitos: contiene mayúsuculas, minúsculas y números y tiene 8 o más caracteres");

        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(User o) {
        return this.nombre.compareTo(o.nombre);
    }
}
