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
public class Asignacion {
    public Hotel favorable;
    public Vuelo favorable2;
    public Reserva reserva;

    public Hotel getFavorable() {
        return favorable;
    }

    public Vuelo getFavorable2() {
        return favorable2;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setFavorable(Hotel favorable) {
        this.favorable = favorable;
    }

    public void setFavorable2(Vuelo favorable2) {
        this.favorable2 = favorable2;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Asignacion(Hotel favorable, Vuelo favorable2, Reserva reserva) {
        this.favorable = favorable;
        this.favorable2 = favorable2;
        this.reserva = reserva;
    }
}
