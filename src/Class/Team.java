package Class;

import java.util.ArrayList;

public class Team {
    private String nombre;
    private String tecnico;
    private String telefono;
    private String horario;
    private String color;
    private String categoria;
    private ArrayList<String> Players;

    public Team() {
    }

    public Team(String nombre, String tecnico, String telefono, String horario, String color, String categoria, ArrayList<String> Players) {
        this.nombre = nombre;
        this.tecnico = tecnico;
        this.telefono = telefono;
        this.horario = horario;
        this.color = color;
        this.categoria = categoria;
        this.Players = Players;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getPlayers() {
        return Players;
    }

    public void setPlayers(ArrayList<String> Players) {
        this.Players = Players;
    }
}
