/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareatresejercicios;

/**
 *
 * @author Maiekel Vela
 */
public abstract class Persona {
        protected String cargo;
    protected double salario;
    protected int registroPersonal;
    
    public Persona (double salario, String cargo){
        this.salario=salario;
        this.cargo=cargo;
    }
    
    public abstract double mostrarSalario();
}

    

