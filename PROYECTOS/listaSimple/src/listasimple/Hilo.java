/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maiekel Vela
 */
    public class Hilo implements Runnable {
    Principal principal;
    boolean repintar;
    public Hilo(Principal a){
    this.principal = a;
    }

    @Override
    public void run() {
        while(true){
            if(repintar){
                principal.repintarImagen();
            repintar=false;
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE,null,ex);
            }
            
            }
            
        }
        
    }
    
}

