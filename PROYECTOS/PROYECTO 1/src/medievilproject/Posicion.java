
package medievilproject;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Posicion extends JPanel {
    private Image fondo;
    public int px;
    public int py;
    public char tipo;
    

    public Posicion(){}
    public Posicion(int x, int y,char  tipo ){
    this.px = x;
    this.py = y;
    this.tipo = tipo;
}
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

    public int getpX() {
        return px;
    }

    public int getpY() {
        return py;
    }

    public char getTipo() {
        return tipo;
    }

    public void setpX(int x) {
        this.px = x;
    }

    public void setpY(int y) {
        this.py = y;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

}

