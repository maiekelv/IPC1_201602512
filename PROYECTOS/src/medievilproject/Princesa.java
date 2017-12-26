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
    public Posicion posicionJ;

    public Princesa() {
        this.alcance = 1;
        this.daño = 1;
        this.predecir = predecir;
        
    }


   

    @Override
    public int atacar(Posicion[][] tablero,int anchoActual,int altoActual) {
        int vidasARestar =0;
        int contXMas = 1;
        while(contXMas>0){
            if((posicionJ.px+contXMas)< (anchoActual-1) ){
                if(tablero[posicionJ.px+contXMas][posicionJ.py].tipo != ' ' && tablero[posicionJ.px+contXMas][posicionJ.py].tipo != 'M' && tablero[posicionJ.px+contXMas][posicionJ.py].tipo != 'V'){
                    vidasARestar = 1;
                }
            }
            contXMas--;
        }
        int contXMenos = 1;
        while(contXMenos>0){
            if((posicionJ.px-contXMenos)>=0 ){
                if(tablero[posicionJ.px-contXMenos][posicionJ.py].tipo != ' ' && tablero[posicionJ.px-contXMenos][posicionJ.py].tipo != 'M' && tablero[posicionJ.px-contXMenos][posicionJ.py].tipo != 'V'){
                    vidasARestar = 1;
                }
            }
            contXMenos--;
        }
        
        int contYMas = 1;
        while(contYMas>0){
            if((posicionJ.py+contYMas)< (altoActual-1) ){
                if(tablero[posicionJ.px][posicionJ.py+contYMas].tipo != ' ' && tablero[posicionJ.px][posicionJ.py+contYMas].tipo != 'M' && tablero[posicionJ.px][posicionJ.py+contYMas].tipo != 'V'){
                    vidasARestar = 1;
                }
            }
            contYMas--;
        }
        int contYMenos = 1;
        while(contYMenos>0){
            if((posicionJ.py-contYMenos)>=0 ){
                if(tablero[posicionJ.px][posicionJ.py-contYMenos].tipo != ' ' && tablero[posicionJ.px][posicionJ.py-contYMenos].tipo != 'M' && tablero[posicionJ.px][posicionJ.py-contYMenos].tipo != 'V'){
                    vidasARestar = 1;
                }
            }
            contYMenos--;
        }
        
        return vidasARestar;
    }
    
    @Override
    public void mover(){
    }
    
    public void predecir(){
    
    }

      
   
    
    
}
