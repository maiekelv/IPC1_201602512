
public class Avion {
    public int asientos;
    public int numeroAvion;
    public String nombre;
    public Pasajero pasajero;

    public Avion(int asientos, int numeroAvion, String nombre, Pasajero pasajero){}
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setNumeroAvion(int numeroAvion) {
        this.numeroAvion = numeroAvion;
    }

    public int getAsientos() {
        return asientos;
    }

    public String getNombre() {
        return nombre;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getNumeroAvion() {
        return numeroAvion;
    }
    
}
