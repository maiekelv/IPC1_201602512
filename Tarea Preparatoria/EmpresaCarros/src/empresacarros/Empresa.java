/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresacarros;


public class Empresa {
    public Cliente cliente;
    public Cliente clienteEmp;
    public Garage garage;

    public Empresa(Cliente cliente, Cliente clienteEmp, Garage garage) {
        this.cliente = cliente;
        this.clienteEmp = clienteEmp;
        this.garage = garage;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cliente getClienteEmp() {
        return clienteEmp;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setClienteEmp(Cliente clienteEmp) {
        this.clienteEmp = clienteEmp;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }
}
