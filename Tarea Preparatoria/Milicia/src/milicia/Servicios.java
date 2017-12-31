/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milicia;

/**
 *
 * @author Maiekel Vela
 */
public class Servicios {
    public Compania servicio;

    public void setServicio(Compania servicio) {
        this.servicio = servicio;
    }

    public Servicios(Compania servicio) {
        this.servicio = servicio;
    }

    public Compania getServicio() {
        return servicio;
    }
}
