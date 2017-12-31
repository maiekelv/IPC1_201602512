/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrohotel;

/**
 *
 * @author Maiekel Vela
 */
public class Hotel {
    public int codigoHotel;
    public String direccion;
    public String nombre;
    public int numero;
    public int plazasDisponibles;
    public Asignacion asignacion;

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public Hotel(int codigoHotel, String direccion, String nombre, int numero, int plazasDisponibles) {
        this.codigoHotel = codigoHotel;
        this.direccion = direccion;
        this.nombre = nombre;
        this.numero = numero;
        this.plazasDisponibles = plazasDisponibles;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPlazasDisponibles(int plazasDisponibles) {
        this.plazasDisponibles = plazasDisponibles;
    }

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public int getPlazasDisponibles() {
        return plazasDisponibles;
    }
    
}
