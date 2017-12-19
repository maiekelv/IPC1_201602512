/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievilproject;

/**
 *
 * @author Maiekel Vela
 */
public class Mago implements Ipersonaje {

    @Override
    public int alcance() {
        return(4);
    }

    @Override
    public int daño() {
        return(1);
    }

    @Override
    public int atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
