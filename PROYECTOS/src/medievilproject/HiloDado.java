/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievilproject;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Maiekel Vela
 */
public class HiloDado implements Runnable {
    JPanel panelDado;
    int turno;
    Tablero tableroFrame;
    int direccion;
    Posicion[][] tablero ;
    TableroFondo tableroFondo;
    Dado dado;
    int animarContador;
    int movimientos;
    Jugador[] jugadores;
    int altoTablero;
    int anchoTablero;
    public HiloDado(JPanel a,Dado dado,Posicion[][] tablero,TableroFondo tableroFondo,Tablero tableroFrame){
    this.panelDado = a;
    this.animarContador =0 ;
    this.movimientos = 0;
    this.dado =dado;
    this.tablero = tablero;
    this.tableroFondo = tableroFondo;
    this.tableroFrame = tableroFrame;
    }
    public Posicion mover(int direccion,Posicion actual){
        Posicion siguiente = new Posicion(actual.px,actual.py,actual.tipo);
        if(direccion==1){
            if(siguiente.py==0){
               siguiente.px = -1;
               siguiente.py = -1;
               this.movimientos =1;
            }
            else{
                siguiente.py = siguiente.py-1;
            }
        }
        else if(direccion==2){
            if(siguiente.px==(anchoTablero-1)){
                 siguiente.px = -1;
               siguiente.py = -1;
               this.movimientos =1;
            }
            else{
                siguiente.px = siguiente.px+1;
            }
        }
        else if(direccion==3){
            if(siguiente.py==(altoTablero-1)){
             siguiente.px = -1;
               siguiente.py = -1;
               this.movimientos =1;
            }
            else{
                siguiente.py = siguiente.py+1;
            }
        }
        else if(direccion==4){
            if(siguiente.px==0){
             siguiente.px = -1;
               siguiente.py = -1;
               this.movimientos =1;
            }
            else{
                siguiente.px = siguiente.px-1;
            }
        }
            return siguiente;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(100);
            }catch(InterruptedException ex){
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE,null,ex);
            }
            int numRandom = 0;
            if(animarContador>0){
                numRandom = (int) (1+(Math.random() * 6));
           this.dado.cambiarFondo(numRandom);
           this.panelDado.removeAll();
           this.panelDado.add(this.dado);
                panelDado.repaint();
                animarContador--;
                if(animarContador==0){
                    this.dado.cambiarFondo(this.movimientos);
                    this.panelDado.removeAll();
                    this.panelDado.add(this.dado);
                    while(this.movimientos>0){
                            Posicion actual = this.jugadores[this.turno].posicionActual();
                            
                            Posicion siguiente = mover(this.direccion,actual);
                            
                        try{
                            Thread.sleep(500);
                        }catch(InterruptedException ex){
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE,null,ex);
                        }
                        this.movimientos --;
                        this.tableroFrame.realizarMovimiento(actual,siguiente,this.movimientos);
                    }
                }
            }
            
            
        }
        
    }
}
