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
public class Princesa implements Ipersonaje {
    private int alcance;
    private int daño;
    private int predecir;
    private int atacar;

    public Princesa(int alcance, int daño, int predecir, int atacar) {
        this.alcance = alcance;
        this.daño = daño;
        this.predecir = predecir;
        this.atacar = atacar;
    }

    @Override
    public int alcance() {
        return(1);
    }

    @Override
    public int daño() {
        return(1);
    }

    @Override
    public int atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void predecir(){
    
    }
    
    
    
}
