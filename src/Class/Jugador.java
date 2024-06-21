
package Class;


public class Jugador {
    private String nombre;
    private String apellido;
    private String num_tel;
    private String num_cedu;
    private String direccion;
    private String num;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String num_tel, String num_cedu, String direccion, String num) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_tel = num_tel;
        this.num_cedu = num_cedu;
        this.direccion = direccion;
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public String getNum_cedu() {
        return num_cedu;
    }

    public void setNum_cedu(String num_cedu) {
        this.num_cedu = num_cedu;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    

    
    
  }
