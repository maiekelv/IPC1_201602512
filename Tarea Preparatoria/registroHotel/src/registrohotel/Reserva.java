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
public class Reserva {
    public Turista cliente;
    public Registro registro;

    public Reserva(Turista cliente, Registro registro) {
        this.cliente = cliente;
        this.registro = registro;
    }

    public void setCliente(Turista cliente) {
        this.cliente = cliente;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public Turista getCliente() {
        return cliente;
    }

    public Registro getRegistro() {
        return registro;
    }
    
}
