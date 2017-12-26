
package medievilproject;


public class Guerrero implements Ipersonaje {
    private int alcance;
    private int daño;
    public Posicion posicionJ;

    public Guerrero() {
        this.alcance = 2;
        this.daño = 2;
            
    }

    

    @Override
    public int atacar(Posicion[][] tablero,int anchoActual,int altoActual) {
        int vidasARestar =0;
        int contXMas = 2;
        while(contXMas>0){
            if((posicionJ.px+contXMas)< (anchoActual-1) ){
                if(tablero[posicionJ.px+contXMas][posicionJ.py].tipo != ' ' && tablero[posicionJ.px+contXMas][posicionJ.py].tipo != 'M' && tablero[posicionJ.px+contXMas][posicionJ.py].tipo != 'V'){
                    vidasARestar = 2;
                }
            }
            contXMas--;
        }
        int contXMenos = 2;
        while(contXMenos>0){
            if((posicionJ.px-contXMenos)>=0 ){
                if(tablero[posicionJ.px-contXMenos][posicionJ.py].tipo != ' ' && tablero[posicionJ.px-contXMenos][posicionJ.py].tipo != 'M' && tablero[posicionJ.px-contXMenos][posicionJ.py].tipo != 'V'){
                    vidasARestar = 2;
                }
            }
            contXMenos--;
        }
        
        int contYMas = 2;
        while(contYMas>0){
            if((posicionJ.py+contYMas)< (altoActual-1) ){
                if(tablero[posicionJ.px][posicionJ.py+contYMas].tipo != ' ' && tablero[posicionJ.px][posicionJ.py+contYMas].tipo != 'M' && tablero[posicionJ.px][posicionJ.py+contYMas].tipo != 'V'){
                    vidasARestar = 2;
                }
            }
            contYMas--;
        }
        int contYMenos = 2;
        while(contYMenos>0){
            if((posicionJ.py-contYMenos)>=0 ){
                if(tablero[posicionJ.px][posicionJ.py-contYMenos].tipo != ' ' && tablero[posicionJ.px][posicionJ.py-contYMenos].tipo != 'M' && tablero[posicionJ.px][posicionJ.py-contYMenos].tipo != 'V'){
                    vidasARestar = 2;
                }
            }
            contYMenos--;
        }
        
        return vidasARestar;
    }
    
    @Override
    public void mover() {
        
    }
    
    
    
    
}
