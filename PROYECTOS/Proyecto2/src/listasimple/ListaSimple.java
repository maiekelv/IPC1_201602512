
package listasimple;

import javax.swing.JFrame;


public class ListaSimple {

    
    public static void main(String[] args) {
   
       Principal principalTablero = new Principal();
        principalTablero.setTitle("Tablero Principal");
        principalTablero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principalTablero.setSize(2000, 2000);
        principalTablero.setVisible(true);
    }
}
