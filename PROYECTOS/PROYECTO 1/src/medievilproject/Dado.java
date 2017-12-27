
package medievilproject;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.random;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dado extends JPanel{
    private Image fondo;
    public int resultados;
    public Jugador turno;
    public int direccion;
    
    
    
    public int rodar(JPanel jPanel1) throws InterruptedException{
       
        int numRandom = 1;
       
       int contadorDado = 20;
       while(contadorDado > 0){
           numRandom = (int) (1+(Math.random() * 6));
           cambiarFondo(numRandom);
           jPanel1.removeAll();
           jPanel1.add(this);
           jPanel1.repaint();
           contadorDado--;
           
       }
       
        return numRandom;
    
    
    
    }
@Override
public void paintComponent(Graphics g){
        int ancho = this.getSize().width;
        int alto = this.getSize().height;
        
        if(this.fondo !=null){
        g.drawImage(this.fondo, 0,0, ancho, alto, null);
        }
        super.paintComponent(g);
    }
    public void setFondo(String ruta){
        try{
        this.fondo = ImageIO.read(new File(ruta));
        this.setOpaque(false);
        }catch(IOException e){
        this.fondo = null;
        }
        repaint();
        
        
    }
    public void setFondo(){
        
        this.fondo = null;
        this.setOpaque(false);
        
        repaint();
        
        
    }
    
    public void cambiarFondo(int numRandom){
        if(numRandom == 1){
            setFondo("src/dadoface1.JPG");
        }else if(numRandom == 2){
            setFondo("src/dadoface2.JPG");
        }else if(numRandom == 3){
            setFondo("src/dadoface3.jpg");
        }else if(numRandom == 4){
            setFondo("src/dadoface4.JPG");
        }else if(numRandom == 5){
        setFondo("src/dadoface5.png");
        }else if(numRandom == 6){
        setFondo("src/dadoface6.JPG");
        }
        
        
            
    
    }
}

