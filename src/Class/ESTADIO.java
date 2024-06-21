
package Class;


public class ESTADIO {
   private String nombre;
   private String ciudad;
   private String capacidad;

    public ESTADIO() {
    }

    public ESTADIO(String nombre, String ciudad, String capacidad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
   
}
