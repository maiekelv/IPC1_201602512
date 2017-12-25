/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareatresejercicios;

public class Jefe extends Persona {
    protected int salarioExtra;

    public Jefe(double salario, String cargo) {
        super(salario, cargo);
    }

    @Override
    public double mostrarSalario() {
        return salarioExtra;
    }
    
}
