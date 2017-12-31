
public class Itinierario {
    public int fecha;
    public String direccion;

    public int getFecha() {
        return fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Itinierario(int fecha, String direccion) {
        this.fecha = fecha;
        this.direccion = direccion;
    }
}
