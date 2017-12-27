
package medievilproject;


public class Mago implements Ipersonaje {
    private int alcance;
    private int daño;
    public Posicion posicionJ;

    public Mago() {
        this.alcance = 4;
        this.daño = 1;
        
    }

   @Override
    public void mover() {
        
    }

   

    @Override
    public int atacar(Posicion[][] tablero,int anchoActual,int altoActual) {
        int vidasARestar =0;
        int contXMas = 4;
        while(contXMas>0){
            if((posicionJ.px+contXMas)< (anchoActual-1) ){
                if(tablero[posicionJ.px+contXMas][posicionJ.py].tipo != ' ' && tablero[posicionJ.px+contXMas][posicionJ.py].tipo != 'M' && tablero[posicionJ.px+contXMas][posicionJ.py].tipo != 'V'){
                    vidasARestar = 1;
                }
            }
            contXMas--;
        }
        int contXMenos = 4;
        while(contXMenos>0){
            if((posicionJ.px-contXMenos)>=0 ){
                if(tablero[posicionJ.px-contXMenos][posicionJ.py].tipo != ' ' && tablero[posicionJ.px-contXMenos][posicionJ.py].tipo != 'M' && tablero[posicionJ.px-contXMenos][posicionJ.py].tipo != 'V'){
                    vidasARestar = 1;
                }
            }
            contXMenos--;
        }
        
        int contYMas = 4;
        while(contYMas>0){
            if((posicionJ.py+contYMas)< (altoActual-1) ){
                if(tablero[posicionJ.px][posicionJ.py+contYMas].tipo != ' ' && tablero[posicionJ.px][posicionJ.py+contYMas].tipo != 'M' && tablero[posicionJ.px][posicionJ.py+contYMas].tipo != 'V'){
                    vidasARestar = 1;
                }
            }
            contYMas--;
        }
        int contYMenos = 4;
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

   
}
