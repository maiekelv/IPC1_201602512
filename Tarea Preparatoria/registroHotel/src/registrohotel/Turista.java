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
public class Turista {
    public String nombre;
    public String direccion;
    public int telefono;
    public Asignacion asignacion;

    public Turista(String nombre, String direccion, int telefono, Asignacion asignacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.asignacion = asignacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }
}
