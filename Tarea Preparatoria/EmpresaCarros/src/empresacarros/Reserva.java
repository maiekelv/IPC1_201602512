/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresacarros;


public class Reserva {
    public Cliente cliente;
    public Cliente clienteEmp;

    public Reserva(Cliente cliente, Cliente clienteEmp) {
        this.cliente = cliente;
        this.clienteEmp = clienteEmp;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cliente getClienteEmp() {
        return clienteEmp;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setClienteEmp(Cliente clienteEmp) {
        this.clienteEmp = clienteEmp;
    }
}
