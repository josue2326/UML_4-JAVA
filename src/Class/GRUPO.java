package Class;

import java.util.ArrayList;

public class GRUPO {
    private String nombre;
    private ArrayList<String> equipos; // Asumiendo que equipos es una lista de nombres de equipos

    public GRUPO() {
        this.equipos = new ArrayList<>();  // Inicializar la lista de equipos
    }

    public GRUPO(String nombre, ArrayList<String> equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<String> equipos) {
        this.equipos = equipos;
    }
}
