package Exam17GestionContenido.Models;

public class Creador {
    private String username;
    private String nombreCompleto;
    private String email;
    private int seguidores;

    public Creador(String username, String nombreCompleto, String email, int seguidores) {
        this.username = username;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.seguidores = seguidores;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }


}
