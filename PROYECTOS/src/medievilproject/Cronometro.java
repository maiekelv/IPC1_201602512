
package medievilproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Cronometro extends JFrame implements Runnable, ActionListener {
    public int minutos;
    public int segundos;
    
public Cronometro(){}
public Cronometro(int minutos, int segundos){
    this.minutos = minutos;
    this.segundos = segundos;
}

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

