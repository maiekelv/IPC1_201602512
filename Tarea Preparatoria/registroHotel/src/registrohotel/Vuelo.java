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
public class Vuelo {
    public String nombre;
    public Asignacion asignacion;

    public Vuelo(String nombre, Asignacion asignacion) {
        this.nombre = nombre;
        this.asignacion = asignacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }
    
}
