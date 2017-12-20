
package medievilproject;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;



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
    
    public Tablero() {
        initComponents();
        this.tableroJg = new Posicion [18][18];
        iniciarTableroCompleto();
        this.setSize(2000,2000);
        (new Thread(new Hilo(this))).start();
        jPanelCrear.setVisible(false);
        
        // TODO add your handling code here:
        
    }   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanelCrear = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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

        javax.swing.GroupLayout jPanelCrearLayout = new javax.swing.GroupLayout(jPanelCrear);
        jPanelCrear.setLayout(jPanelCrearLayout);
        jPanelCrearLayout.setHorizontalGroup(
            jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanelCrearLayout.setVerticalGroup(
            jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearLayout.createSequentialGroup()
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2)
                    .addComponent(jButton1))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCrear);
        jPanelCrear.setBounds(0, 0, 400, 30);

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
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
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
    
    public void paint(Graphics g){
        super.paintComponents(g);
    }
    
    public void imprimirTablero(){
        int altoPanel = 700/this.altoActual;
        int anchoPanel = 700/this.anchoActual;
        
        for(int i=0;i<this.anchoActual;i++){
                for(int j=0; j<this.altoActual;j++){   
                    int px = (i*anchoPanel)+1;
                    int py = (j*altoPanel)+1+101;
                    
                    if(this.tableroJg[i][j].tipo == 'V'){
                    this.tableroJg[i][j].setFondo("C:\\Users\\Maiekel Vela\\Desktop\\Imagenes Medievil\\corazonamor.png");
                    }
                    else if(this.tableroJg[i][j].tipo =='M'){
                        this.tableroJg[i][j].setFondo("C:\\Users\\Maiekel Vela\\Desktop\\Imagenes Medievil\\tnt.jpg");
                    }
                    else{this.tableroJg[i][j].setFondo();}
                    
                    this.tableroJg[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                    this.tableroJg[i][j].setBounds(px,py,anchoPanel, altoPanel);
                    
                    
                    this.tableroJg[i][j].setVisible(true);
            }  
        }
        
    }    
    public void iniciarTableroCompleto(){
        for(int i=0;i<18;i++){
                for(int j=0; j<18;j++){
                    this.tableroJg[i][j] = new Posicion(i,j,'0');    
            }
                
        }
        }
        public void llenarTableroVacio(int ancho,int alto){
            for(int i=0;i<ancho;i++){
                for(int j=0; j<alto;j++){
                    this.tableroJg[i][j] = new Posicion(i,j,' ');
                    getContentPane().add(this.tableroJg[i][j]);
                    
                     
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
    // End of variables declaration//GEN-END:variables

    
}
