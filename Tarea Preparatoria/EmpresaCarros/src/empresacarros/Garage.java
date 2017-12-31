/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresacarros;

public class Garage {
    public int dreccion;
    public Automovil carro;

    public Garage(int dreccion, Automovil carro) {
        this.dreccion = dreccion;
        this.carro = carro;
    }

    public void setDreccion(int dreccion) {
        this.dreccion = dreccion;
    }

    public void setCarro(Automovil carro) {
        this.carro = carro;
    }

    public int getDreccion() {
        return dreccion;
    }

    public Automovil getCarro() {
        return carro;
    }
}
