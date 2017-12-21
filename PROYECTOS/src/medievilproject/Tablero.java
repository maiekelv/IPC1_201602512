
package medievilproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class Tablero extends javax.swing.JFrame {
    public Dado dado;
    public int tamaño;
    public Posicion minas;
    public int anchoActual = 7;
    public int altoActual = 7;
    public Posicion vidas;
    public Posicion tableroJg[][];
    public Jugador jugadores[];
    public Menu menu;
    private Image fondo;
    public TableroFondo tableroPanel;
    public int jugadorConfig;
    public int jugadorPersonajePos;
    public String[] ordenJugador;
    
    public Tablero() {
        initComponents();
        tableroPanel = new TableroFondo();
        tableroPanel.setFondo("C:\\Users\\Maiekel Vela\\Desktop\\Imagenes Medievil\\imagenTablero.jpg");
        tableroPanel.setBounds(0 , 100,701,701);
        tableroPanel.setLayout(null);
        getContentPane().add(tableroPanel);
        this.tableroJg = new Posicion [18][18];
        iniciarTableroCompleto();
        this.setSize(2000,2000);
        (new Thread(new Hilo(this))).start();
        jPanelCrear.setVisible(false);
        jugadores = new Jugador[2];
        
        
        
      
        
    }   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanelCrear = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelNombreJugador1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelJ1P1 = new javax.swing.JLabel();
        labelJ1P2 = new javax.swing.JLabel();
        labelJ1P3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelNombreJugador2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelJ2P1 = new javax.swing.JLabel();
        labelJ2P2 = new javax.swing.JLabel();
        labelJ2P3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setText("7");

        jTextField2.setText("7");

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Tamaño");

        jTextField3.setText("Nombre Jugador");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setText("Mago");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Princesa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Guerrero");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanelCrearLayout = new javax.swing.GroupLayout(jPanelCrear);
        jPanelCrear.setLayout(jPanelCrearLayout);
        jPanelCrearLayout.setHorizontalGroup(
            jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanelCrearLayout.setVerticalGroup(
            jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearLayout.createSequentialGroup()
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2)
                    .addComponent(jButton1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jLabel6))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCrear);
        jPanelCrear.setBounds(0, 0, 1040, 30);

        jLabel1.setText("   Jugador 1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(710, 120, 80, 30);

        labelNombreJugador1.setText("Nombre Jugador 1");
        getContentPane().add(labelNombreJugador1);
        labelNombreJugador1.setBounds(810, 120, 120, 30);

        jLabel3.setText("    Personajes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(940, 100, 110, 50);

        labelJ1P1.setText("Personaje 1");
        getContentPane().add(labelJ1P1);
        labelJ1P1.setBounds(960, 160, 80, 20);

        labelJ1P2.setText("Personaje 2");
        getContentPane().add(labelJ1P2);
        labelJ1P2.setBounds(960, 200, 70, 20);

        labelJ1P3.setText("Personaje 3");
        getContentPane().add(labelJ1P3);
        labelJ1P3.setBounds(960, 240, 70, 20);

        jLabel2.setText("  Jugador 2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(730, 330, 70, 20);

        labelNombreJugador2.setText("Nombre Jugador 2");
        getContentPane().add(labelNombreJugador2);
        labelNombreJugador2.setBounds(810, 320, 110, 40);

        jLabel5.setText("  Personajes");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(960, 310, 100, 50);

        labelJ2P1.setText("Personaje 1");
        getContentPane().add(labelJ2P1);
        labelJ2P1.setBounds(970, 360, 80, 30);

        labelJ2P2.setText("Personaje 2");
        getContentPane().add(labelJ2P2);
        labelJ2P2.setBounds(970, 410, 80, 30);

        labelJ2P3.setText("Personaje 3");
        getContentPane().add(labelJ2P3);
        labelJ2P3.setBounds(970, 460, 80, 30);

        jMenu1.setText("Archivo");
        jMenu1.add(jSeparator1);
        jMenu1.add(jSeparator2);

        jMenuItem3.setText("Nuevo Tablero");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       jPanelCrear.setVisible(true);
       jButton1.setVisible(false);
       jugadores[0]= new Jugador();
       jugadores[1]= new Jugador();
       jLabel6.setText("Informacion Jugador 1");
       jugadorConfig = 0;
       jugadorPersonajePos = 0;
       this.ordenJugador = new String[3];
       jButton2.setVisible(true);
       jButton3.setVisible(true);
       jButton4.setVisible(true);
        
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //BOTON GENERAR
        tableroPanel.removeAll();
        this.iniciarTableroCompleto();
        int nuevoAncho =Integer.parseInt( jTextField1.getText());
        int nuevoAlto =Integer.parseInt( jTextField2.getText());
        llenarTableroVacio(nuevoAncho,nuevoAlto);
        this.anchoActual=nuevoAncho;
        this.altoActual=nuevoAlto;
        int totalPosiciones = nuevoAncho * nuevoAlto;
         
        int contadorMinas=(int)  (totalPosiciones * 0.10);
        int contadorVidas=(int)  (totalPosiciones * 0.05);
        
        
        while(contadorMinas>0){
            int columnaRandom=(int) (Math.random() * nuevoAncho); 
                int filaRandom=(int) (Math.random() * nuevoAlto);
                if(this.tableroJg[filaRandom][columnaRandom].tipo==' '){
                    this.tableroJg[filaRandom][columnaRandom].setTipo('M');
                    contadorMinas--;
                }
        }
        
        while(contadorVidas>0){
            int columnaRandom=(int) (Math.random() * nuevoAncho); 
                int filaRandom=(int) (Math.random() * nuevoAlto);
                if(this.tableroJg[filaRandom][columnaRandom].tipo==' '){
                this.tableroJg[filaRandom][columnaRandom].setTipo('V');
                contadorVidas--;
                }
        }
        imprimirTablero();
        jPanelCrear.setVisible(false);
        
              
        
        
        
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jButton2.setVisible(false);
    this.ordenJugador[jugadorPersonajePos] = "mago";
        jugadorPersonajePos++;
        if(jugadorPersonajePos>2){
            this.jugadores[jugadorConfig] = new Jugador(jTextField3.getText(),this.ordenJugador);
            jugadorConfig++;
            if(jugadorConfig>1){
                jButton1.setVisible(true);
            }else{
                jButton2.setVisible(true);
                jButton3.setVisible(true);
                jButton4.setVisible(true);
                jLabel6.setText("Informacion Jugador 2");
                jugadorPersonajePos = 0;
            
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         jButton3.setVisible(false);
        this.ordenJugador[jugadorPersonajePos] = "princesa";
        jugadorPersonajePos++;
            if(jugadorPersonajePos>2){
            this.jugadores[jugadorConfig] = new Jugador(jTextField3.getText(),this.ordenJugador);
            jugadorConfig++;
            if(jugadorConfig>1){
                
               jButton1.setVisible(true);
            }else{
                jButton2.setVisible(true);
                jButton3.setVisible(true);
                jButton4.setVisible(true);
                jLabel6.setText("Informacion Jugador 2");
                jugadorPersonajePos = 0;
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setVisible(false);
    this.ordenJugador[jugadorPersonajePos] = "guerrero";
        jugadorPersonajePos++;
            if(jugadorPersonajePos>2){
            this.jugadores[jugadorConfig] = new Jugador(jTextField3.getText(),this.ordenJugador);
            jugadorConfig++;
            
            if(jugadorConfig>1){
                jButton1.setVisible(true);
            }else{
                jButton2.setVisible(true);
                jButton3.setVisible(true);
                jButton4.setVisible(true);
                jLabel6.setText("Informacion Jugador 2");
                jugadorPersonajePos = 0;
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed
      
    public void imprimirTablero(){
        int altoPanel = 700/this.altoActual;
        int anchoPanel = 700/this.anchoActual;
        
        for(int i=0;i<this.anchoActual;i++){
                for(int j=0; j<this.altoActual;j++){   
                    int px = (i*anchoPanel)+1;
                    int py = (j*altoPanel)+1;
                    
                    if(this.tableroJg[i][j].tipo == 'V'){
                    this.tableroJg[i][j].setFondo("C:\\Users\\Maiekel Vela\\Desktop\\Imagenes Medievil\\corazonamor.png");
                    }
                    else if(this.tableroJg[i][j].tipo =='M'){
                        this.tableroJg[i][j].setFondo("C:\\Users\\Maiekel Vela\\Desktop\\Imagenes Medievil\\tnt.jpg");
                    }
                    else{this.tableroJg[i][j].setFondo();}
                    
                    this.tableroJg[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                    this.tableroJg[i][j].setBounds(px,py,anchoPanel, altoPanel);
                    
                    
            
                    
                }  
        }
        
    }    
    public void iniciarTableroCompleto(){
        for(int i=0;i<18;i++){
                for(int j=0; j<18;j++){
                    this.tableroJg[i][j] = new Posicion(i,j,'0');
                    this.tableroJg[i][j].setFondo();
            }
                
        }
        }
        public void llenarTableroVacio(int ancho,int alto){
            for(int i=0;i<ancho;i++){
                for(int j=0; j<alto;j++){
                    this.tableroJg[i][j].setpX(i);                    
                    this.tableroJg[i][j].setpY(j);
                    this.tableroJg[i][j].setTipo(' ');
                    this.tableroPanel.add(this.tableroJg[i][j]);
            }
                
        }
        }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanelCrear;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelJ1P1;
    private javax.swing.JLabel labelJ1P2;
    private javax.swing.JLabel labelJ1P3;
    private javax.swing.JLabel labelJ2P1;
    private javax.swing.JLabel labelJ2P2;
    private javax.swing.JLabel labelJ2P3;
    private javax.swing.JLabel labelNombreJugador1;
    private javax.swing.JLabel labelNombreJugador2;
    // End of variables declaration//GEN-END:variables

    
}
