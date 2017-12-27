
package medievilproject;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

/**
 *
 * @author Maiekel Vela
 */
public class ImagenFondo extends JComponent {
    Image i;
    
    public ImagenFondo(Image i){
    this.i = i;
    }
    @Override
    public void paintComponent(Graphics g){
    g.drawImage(i,0,0, null);
    }
}
