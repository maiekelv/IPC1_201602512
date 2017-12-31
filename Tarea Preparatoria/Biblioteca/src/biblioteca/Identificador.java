/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Maiekel Vela
 */
public class Identificador {
    public TipoLibro estado;

    public Identificador(TipoLibro estado) {
        this.estado = estado;
    }

    public TipoLibro getEstado() {
        return estado;
    }

    public void setEstado(TipoLibro estado) {
        this.estado = estado;
    }
}
