package ColeccionesProg.src.main.java.Otros.Colecciones.Boletin4.Models;

import java.util.Objects;

public class Influencer {
    private String nombre;
    private String nick;
    private int numSeguidores;
    private String plataforma;
    EntradaVip entradaVip;

    public Influencer(String nombre, String nick, int numSeguidores, String plataforma) {
        this.nombre = nombre;
        this.nick = nick;
        this.numSeguidores = numSeguidores;
        this.plataforma = plataforma;
    }

    public Influencer(String nick, String plataforma) {
        this.nick = nick;
        this.plataforma = plataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getNumSeguidores() {
        return numSeguidores;
    }

    public void setNumSeguidores(int numSeguidores) {
        this.numSeguidores = numSeguidores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public EntradaVip getEntradaVip() {
        return entradaVip;
    }

    public void setEntradaVip(EntradaVip entradaVip) {
        this.entradaVip = entradaVip;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Influencer that = (Influencer) o;
        return Objects.equals(nick, that.nick) && Objects.equals(plataforma, that.plataforma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, plataforma);
    }
}
