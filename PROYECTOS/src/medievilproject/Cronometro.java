
package medievilproject;


public class Cronometro extends Thread{
    private Tablero v;
    private int seg;
    private int min;
    private int hora;
  
    public Cronometro(Tablero v){
        this.v=v;
        seg = v.getSeg();
        min = v.getMin();
        hora = v.getHora();       
    }
    @Override
    public void run() {
        for (; ;){
            if (seg!=0){
                seg=v.aumentarSeg();
            }else{
                 seg=59;
                 v.resetearSeg();
                if(min!=0){            
                    min=v.aumentarMin();
                }else{
                    hora=v.aumentarHora();
                    min=0;
                    v.resetearMin();
                }           
            }
             try {
                sleep(999);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
            if(!v.isContinuar()){
                try {
                    synchronized(this){
                       this.wait(); 
                    } 
                } catch (InterruptedException ex) {
                    System.err.println(ex.getMessage());
                }
            }    
        }       
    }    
    public void seguir(){
        synchronized(this){
            notifyAll();
        }
    }   
}