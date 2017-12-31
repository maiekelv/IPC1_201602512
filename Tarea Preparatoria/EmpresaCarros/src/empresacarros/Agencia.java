/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresacarros;

/**
 *
 * @author Maiekel Vela
 */
public class Agencia {
    public Reserva reserva;

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Agencia(Reserva reserva) {
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }
}
