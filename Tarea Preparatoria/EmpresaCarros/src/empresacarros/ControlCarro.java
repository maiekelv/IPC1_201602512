
package empresacarros;


class ControlCarro {
   public Reserva reserva; 

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public ControlCarro(Reserva reserva) {
        this.reserva = reserva;
    }
}
