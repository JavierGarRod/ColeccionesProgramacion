package ColeccionesProg.src.main.java.BoletinesSimulacros.BoltSimulaciones.Ej2;

public class Usuario {

    private int contadorIds; // ID autogenerado
    private int id;
    private String nombreCompleto;
    private String email;

    // Parte del enunciado: "id autogenerado"
    public Usuario(String nombreCompleto, String email) {
        this.id = contadorIds++;
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

    // "Dos usuarios son iguales si tienen el mismo id"
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Usuario)) return false;

        Usuario otro = (Usuario) obj;
        return this.id == otro.id;
    }

    @Override
    public String toString() {
        return id + " - " + nombreCompleto + " (" + email + ")";
    }
}

