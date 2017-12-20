/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievilproject;
import java.util.logging.Level;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maiekel Vela
 */
public class Hilo implements Runnable {
    Tablero tableroJuego;
    public Hilo(Tablero a){
    this.tableroJuego = a;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(100);
            }catch(InterruptedException ex){
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE,null,ex);
            }
            tableroJuego.imprimirTablero();
        }
        
    }
    
}
