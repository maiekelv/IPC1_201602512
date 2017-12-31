
public class Pasajero {
    public String nombre;
    public int identificacion;
    public int maletas;

    public Pasajero(String nombre, int identificacion, int maletas) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.maletas = maletas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getMaletas() {
        return maletas;
    }
    
}
