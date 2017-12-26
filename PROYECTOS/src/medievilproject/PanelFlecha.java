/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievilproject;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Maiekel Vela
 */
public class PanelFlecha extends JPanel {
    private Image fondo;
    
        


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
            setFondo("C:\\Users\\Maiekel Vela\\Desktop\\Imagenes Medievil\\flechaarriba.png");
        }else if(numRandom == 2){
            setFondo("C:\\Users\\Maiekel Vela\\Desktop\\Imagenes Medievil\\flechaderecha.png");
        }else if(numRandom == 3){
            setFondo("C:\\Users\\Maiekel Vela\\Desktop\\Imagenes Medievil\\flechaabajo.png");
        }else if(numRandom == 4){
            setFondo("C:\\Users\\Maiekel Vela\\Desktop\\Imagenes Medievil\\flechaizquierda.png");            
        }else{
            setFondo();
        }
        
        
            
    }
    }

    

