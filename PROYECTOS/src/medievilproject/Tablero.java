
package medievilproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Tablero extends javax.swing.JFrame implements Runnable {
    public int turnoJugador = 0;
    public int direccion;
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
    public HiloDado hiloDado;
    public PanelVida panelVidaJ1[];
    public PanelVida panelVidaJ2[];
    private int seg = 0;
    private int min = 0;
    private int hora = 0;
    private boolean continuar = true;
    private Cronometro i;
    boolean predijo = false;
    public Record [] historial;
    public int contadorHistorial;
    
    
    public Tablero() {
        initComponents();
        tableroPanel = new TableroFondo();
        tableroPanel.setFondo("src\\tableroMedievil.jpg");
        tableroPanel.setBounds(0 , 100,700,700);
        tableroPanel.setLayout(null);
        getContentPane().add(tableroPanel);
        this.tableroJg = new Posicion [18][18];
        iniciarTableroCompleto();
        this.setSize(2000,2000);
        (new Thread(new Hilo(this))).start();
        jPanelCrear.setVisible(false);
        jugadores = new Jugador[2];
        this.dado = new Dado();
        this.dado.cambiarFondo(1);
        this.jPanel1.setLayout(null);
        this.dado.setBounds(0,0,50,50);
        this.jPanel1.add(this.dado);
        this.jPanel1.setVisible(true);
        this.dado.setVisible(true);
        hiloDado = new HiloDado(this.jPanel1,this.dado,this.tableroJg,this.tableroPanel,this);
        (new Thread(hiloDado)).start();
        this.panelVidaJ1 = new PanelVida [16];
        this.panelVidaJ2 = new PanelVida [16];
        this.jPanel2.setLayout(null);
        this.labelGanador.setVisible(false);
        this.historial = new Record[1000];
        this.contadorHistorial = 0;
        try{
        cargarHistorial();
        }
        catch(Exception e){}
    }  
    
    public void mostrarVidaJugador(){
    this.PanelVidaJ1.removeAll();
    this.PanelVidaJ2.removeAll();
        this.PanelVidaJ1.setLayout(new GridLayout(0,4));
        this.PanelVidaJ2.setLayout(new GridLayout(0,4));
        this.PanelVidaJ1.revalidate();
        this.PanelVidaJ2.revalidate();
        for(int i=0; i<16; i++){
            this.panelVidaJ1[i]= new PanelVida();
            if(this.jugadores[0].vidas > i){
            this.panelVidaJ1[i].cambiarFondo(1);
            }
            this.panelVidaJ1[i].setSize(30, 30);
            this.PanelVidaJ1.add(this.panelVidaJ1[i]);
            
            this.panelVidaJ2[i]= new PanelVida();
            if(this.jugadores[1].vidas > i){
            this.panelVidaJ2[i].cambiarFondo(1);
            }
            this.panelVidaJ2[i].setSize(30, 30);
            this.PanelVidaJ2.add(this.panelVidaJ2[i]);
        }
        this.PanelVidaJ1.revalidate();
        this.PanelVidaJ2.revalidate();
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
        jButtonArriba = new javax.swing.JButton();
        jButtonAbajo = new javax.swing.JButton();
        jButtonDerecha = new javax.swing.JButton();
        jButtonIzquierda = new javax.swing.JButton();
        jButtonTirar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PanelVidaJ1 = new javax.swing.JPanel();
        PanelVidaJ2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txf_cont3 = new javax.swing.JLabel();
        txf_cont2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        checkBoxAtacar = new javax.swing.JCheckBox();
        labelGanador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

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
        jLabel1.setBounds(860, 70, 80, 30);

        labelNombreJugador1.setText("Nombre Jugador 1");
        getContentPane().add(labelNombreJugador1);
        labelNombreJugador1.setBounds(960, 70, 120, 30);

        jLabel3.setText("    Personajes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1090, 50, 110, 50);

        labelJ1P1.setText("Personaje 1");
        getContentPane().add(labelJ1P1);
        labelJ1P1.setBounds(1110, 110, 80, 20);

        labelJ1P2.setText("Personaje 2");
        getContentPane().add(labelJ1P2);
        labelJ1P2.setBounds(1110, 150, 70, 20);

        labelJ1P3.setText("Personaje 3");
        getContentPane().add(labelJ1P3);
        labelJ1P3.setBounds(1110, 190, 70, 20);

        jLabel2.setText("  Jugador 2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(870, 340, 70, 20);

        labelNombreJugador2.setText("Nombre Jugador 2");
        getContentPane().add(labelNombreJugador2);
        labelNombreJugador2.setBounds(950, 330, 110, 40);

        jLabel5.setText("  Personajes");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1100, 320, 100, 50);

        labelJ2P1.setText("Personaje 1");
        getContentPane().add(labelJ2P1);
        labelJ2P1.setBounds(1110, 370, 80, 30);

        labelJ2P2.setText("Personaje 2");
        getContentPane().add(labelJ2P2);
        labelJ2P2.setBounds(1110, 420, 80, 30);

        labelJ2P3.setText("Personaje 3");
        getContentPane().add(labelJ2P3);
        labelJ2P3.setBounds(1110, 470, 80, 30);

        jButtonArriba.setText("ARRIBA");
        jButtonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArribaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonArriba);
        jButtonArriba.setBounds(870, 650, 90, 30);

        jButtonAbajo.setText("ABAJO");
        jButtonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbajoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAbajo);
        jButtonAbajo.setBounds(879, 730, 70, 30);

        jButtonDerecha.setText("DERECHA");
        jButtonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDerechaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDerecha);
        jButtonDerecha.setBounds(960, 690, 90, 30);

        jButtonIzquierda.setText("IZQUIERDA");
        jButtonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzquierdaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIzquierda);
        jButtonIzquierda.setBounds(770, 690, 100, 30);

        jButtonTirar.setText("TIRAR");
        jButtonTirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTirarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTirar);
        jButtonTirar.setBounds(870, 685, 90, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(760, 570, 100, 100);

        javax.swing.GroupLayout PanelVidaJ1Layout = new javax.swing.GroupLayout(PanelVidaJ1);
        PanelVidaJ1.setLayout(PanelVidaJ1Layout);
        PanelVidaJ1Layout.setHorizontalGroup(
            PanelVidaJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        PanelVidaJ1Layout.setVerticalGroup(
            PanelVidaJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(PanelVidaJ1);
        PanelVidaJ1.setBounds(850, 110, 250, 200);

        javax.swing.GroupLayout PanelVidaJ2Layout = new javax.swing.GroupLayout(PanelVidaJ2);
        PanelVidaJ2.setLayout(PanelVidaJ2Layout);
        PanelVidaJ2Layout.setHorizontalGroup(
            PanelVidaJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        PanelVidaJ2Layout.setVerticalGroup(
            PanelVidaJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        getContentPane().add(PanelVidaJ2);
        PanelVidaJ2.setBounds(850, 370, 240, 220);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(770, 730, 100, 100);

        txf_cont3.setText("00");
        getContentPane().add(txf_cont3);
        txf_cont3.setBounds(1100, 650, 20, 16);

        txf_cont2.setText("00");
        getContentPane().add(txf_cont2);
        txf_cont2.setBounds(1060, 650, 14, 16);

        jLabel8.setText(":");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1080, 650, 10, 16);

        jLabel9.setText("Tiempo");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1050, 620, 50, 16);

        checkBoxAtacar.setText("Atacar");
        checkBoxAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAtacarActionPerformed(evt);
            }
        });
        getContentPane().add(checkBoxAtacar);
        checkBoxAtacar.setBounds(1060, 730, 65, 25);

        labelGanador.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        labelGanador.setForeground(new java.awt.Color(255, 51, 51));
        labelGanador.setText("jLabel7");
        getContentPane().add(labelGanador);
        labelGanador.setBounds(770, 820, 850, 90);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1200, 60, 410, 720);

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

        jMenuItem1.setText("Mostrar Historial");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       jPanelCrear.setVisible(true);
       jButton1.setVisible(false);
       jButtonArriba.setVisible(false);
       jButtonAbajo.setVisible(false);
       jButtonDerecha.setVisible(false);
       jButtonIzquierda.setVisible(false);
       jButtonTirar.setVisible(false);
       jButtonArriba.setVisible(false);
       jButtonAbajo.setVisible(false);
       jButtonDerecha.setVisible(false);
       jButtonIzquierda.setVisible(false);
       jButtonTirar.setVisible(false);
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
       jButtonArriba.setVisible(true);
       jButtonAbajo.setVisible(true);
       jButtonDerecha.setVisible(true);
       jButtonIzquierda.setVisible(true);
       jButtonTirar.setVisible(true);
              
       
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
        mostrarLabelPersonajes();
        asignarPersonajes(0,0);
        asignarPersonajes(1,0);
        imprimirTablero();
        mostrarVidaJugador();
        jPanelCrear.setVisible(false);
        
        resetearSeg();
        resetearMin();
        resetearHora();
        seguir();
        i=null;
        i = new Cronometro(this);
        i.start();
        jButtonTirar.setBackground(Color.BLUE);
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
                
                this.ordenJugador = new String[3];
            
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
       this.ordenJugador = new String[3];
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
       this.ordenJugador = new String[3];
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonTirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTirarActionPerformed
        try{
        hiloDado.animarContador = 20;
        int numRandom = (int) (1+(Math.random() * 6));
        hiloDado.jugadores = this.jugadores;
        hiloDado.movimientos = numRandom;
        hiloDado.turno = this.turnoJugador;
        hiloDado.direccion =this.direccion;
        hiloDado.altoTablero = this.altoActual;
        hiloDado.anchoTablero = this.anchoActual;
        hiloDado.tablero = this.tableroJg;
        }catch(Exception e){
            System.out.println(e);
        }
        
       
    }//GEN-LAST:event_jButtonTirarActionPerformed

    private void jButtonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArribaActionPerformed
            // TODO add your handling code here:
        jPanel2.removeAll();
        PanelFlecha nuevaFlecha = new PanelFlecha();
        nuevaFlecha.cambiarFondo(1);
        nuevaFlecha.setBounds(0, 0 , 50, 50);
        jPanel2.add(nuevaFlecha);
        jPanel2.setVisible(true);
        this.direccion = 1;
        
    }//GEN-LAST:event_jButtonArribaActionPerformed

    private void jButtonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDerechaActionPerformed
        jPanel2.removeAll();
        PanelFlecha nuevaFlecha = new PanelFlecha();
        nuevaFlecha.cambiarFondo(2);
        nuevaFlecha.setBounds(0, 0 , 50, 50);
        jPanel2.add(nuevaFlecha);
        jPanel2.setVisible(true);
        this.direccion = 2;
    }//GEN-LAST:event_jButtonDerechaActionPerformed

    private void jButtonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbajoActionPerformed
        jPanel2.removeAll();
        PanelFlecha nuevaFlecha = new PanelFlecha();
        nuevaFlecha.cambiarFondo(3);
        nuevaFlecha.setBounds(0, 0 , 50, 50);
        jPanel2.add(nuevaFlecha);
        jPanel2.setVisible(true);
        this.direccion = 3;
    }//GEN-LAST:event_jButtonAbajoActionPerformed

    private void jButtonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzquierdaActionPerformed
    jPanel2.removeAll();
        PanelFlecha nuevaFlecha = new PanelFlecha();
        nuevaFlecha.cambiarFondo(4);
        nuevaFlecha.setBounds(0, 0 , 50, 50);
        jPanel2.add(nuevaFlecha);
        jPanel2.setVisible(true);
        this.direccion = 4;
    }//GEN-LAST:event_jButtonIzquierdaActionPerformed

    private void checkBoxAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAtacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAtacarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
     
    public void realizarMovimiento(Posicion actual,Posicion siguiente,int restantes){
        if(siguiente.px==-1||siguiente.py==-1){
            this.jugadores[this.turnoJugador].vidas--;
        int columnaCentro = (int)(this.anchoActual/2);
        int filaCentro = (int)(this.altoActual/2);
            while(siguiente.px==-1||siguiente.py==-1){
            if (tableroJg[columnaCentro][filaCentro].tipo==' '){
                siguiente.px = columnaCentro;
                siguiente.py = filaCentro;
            }else{columnaCentro++;}      
            }
        }
        if(this.tableroJg[siguiente.px][siguiente.py].tipo=='M'){
            this.jugadores[this.turnoJugador].vidas--;
        }
        else if(this.tableroJg[siguiente.px][siguiente.py].tipo=='V'){
            this.jugadores[this.turnoJugador].vidas++;
        
        }
        
        if(this.turnoJugador==0 && (this.tableroJg[siguiente.px][siguiente.py].tipo=='d' || this.tableroJg[siguiente.px][siguiente.py].tipo=='e' || this.tableroJg[siguiente.px][siguiente.py].tipo=='f') ){
            int nuevaDireccion = 0;
            while(nuevaDireccion==0){
                int direccionRandom =(int) (1+(Math.random() * 4));
                if(direccionRandom!=this.direccion){
                    nuevaDireccion = direccionRandom;
                }
            }
            this.direccion = nuevaDireccion;
            hiloDado.direccion = this.direccion;
            hiloDado.movimientos++;
            restantes++;
        }
        else if(this.turnoJugador==1 && (this.tableroJg[siguiente.px][siguiente.py].tipo=='a' || this.tableroJg[siguiente.px][siguiente.py].tipo=='b' || this.tableroJg[siguiente.px][siguiente.py].tipo=='c')){
            int nuevaDireccion = 0;
            while(nuevaDireccion==0){
                int direccionRandom =(int) (1+(Math.random() * 4));
                if(direccionRandom!=this.direccion){
                    nuevaDireccion = direccionRandom;
                }
            }
            this.direccion = nuevaDireccion;
            hiloDado.direccion = this.direccion;
            hiloDado.movimientos++;
            restantes++;
        }
        else{
            this.tableroJg[actual.px][actual.py].setTipo(' ');
            this.tableroJg[siguiente.px][siguiente.py].setTipo(siguiente.tipo);
            this.jugadores[this.turnoJugador].setposicionActual(siguiente);
        }
        
        
        hiloDado.tablero = this.tableroJg;
        
        
        if(restantes==0){
            int ataqueResta = 0;
            if(predijo){
                
                this.predijo = false;
                checkBoxAtacar.setVisible(true);
            }
            if(checkBoxAtacar.isSelected()){
                ataqueResta = this.jugadores[this.turnoJugador].atacar(tableroJg, anchoActual, altoActual);
            }
            if(ataqueResta>0 && this.jugadores[this.turnoJugador].ordenJuego[this.jugadores[this.turnoJugador].personajeActual].equals("princesa")){
                checkBoxAtacar.setSelected(false);
                this.predijo = true;
                checkBoxAtacar.setVisible(false);
            }
            if(this.turnoJugador==0){
            this.turnoJugador = 1;
            
        jButtonTirar.setBackground(Color.RED);
            }
            else{
                this.turnoJugador = 0;
                
        jButtonTirar.setBackground(Color.BLUE);
            }
            if(ataqueResta>0){
                if(this.jugadores[this.turnoJugador].personajeActual==2){
                this.jugadores[this.turnoJugador].personajeActual = 0;
                }
                else{
                    this.jugadores[this.turnoJugador].personajeActual++;
                }
                removerPersonajes(this.turnoJugador);
                asignarPersonajes(this.turnoJugador,this.jugadores[this.turnoJugador].personajeActual);
            }
            
            this.jugadores[this.turnoJugador].vidas = this.jugadores[this.turnoJugador].vidas -ataqueResta;
            mostrarVidaJugador();
        }
        validarVidas();
        tableroPanel.removeAll();
        this.llenarTablero(this.anchoActual, this.altoActual);
        imprimirTablero();
    }
    public void validarVidas(){
        if(this.jugadores[0].vidas<1){
            labelGanador.setVisible(true);
            labelGanador.setText(this.jugadores[1].nombre + " ha Ganado");
            parar();
            jButtonTirar.setVisible(false);
            Record nuevoRecord = new Record(this.jugadores[1].nombre, this.jugadores[1].ordenJuego, this.jugadores[1].vidas, this.min , this.seg);
            this.historial [this.contadorHistorial] = nuevoRecord;
            this.contadorHistorial++;
            try{
            guardarHistorialArchivo();
            }
            catch(Exception e){}
        
        }
        else if(this.jugadores[1].vidas<1){
            labelGanador.setVisible(true);
            labelGanador.setText(this.jugadores[0].nombre + " ha Ganado");
            parar();
            jButtonTirar.setVisible(false);
            Record nuevoRecord = new Record(this.jugadores[0].nombre, this.jugadores[0].ordenJuego, this.jugadores[0].vidas, this.min , this.seg);
            this.historial [this.contadorHistorial] = nuevoRecord;
            this.contadorHistorial++;
            try{
            guardarHistorialArchivo();
            }
            catch(Exception e){}
        }
        else{
            labelGanador.setVisible(false);
        }
        
    }
    public void imprimirTablero(){
        int altoPanel = 700/this.altoActual;
        int anchoPanel = 700/this.anchoActual;
        
        for(int i=0;i<this.anchoActual;i++){
                for(int j=0; j<this.altoActual;j++){   
                    int px = (i*anchoPanel)+1;
                    int py = (j*altoPanel)+1;
                    
                    this.tableroJg[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                    if(this.tableroJg[i][j].tipo == 'V'){
                    this.tableroJg[i][j].setFondo("src\\corazonamor.png");
                    }
                    else if(this.tableroJg[i][j].tipo =='M'){
                        this.tableroJg[i][j].setFondo("src\\tnt.jpg");
                    }
                    else if(this.tableroJg[i][j].tipo =='a'){
                        this.tableroJg[i][j].setBorder(BorderFactory.createLineBorder(Color.blue, 5));
                        this.tableroJg[i][j].setFondo("src\\Mago.jpg");
                    }
                    else if(this.tableroJg[i][j].tipo =='b'){
                        this.tableroJg[i][j].setBorder(BorderFactory.createLineBorder(Color.blue, 5));
                        this.tableroJg[i][j].setFondo("src\\princesa.jpg");
                    }
                    else if(this.tableroJg[i][j].tipo =='c'){
                        this.tableroJg[i][j].setBorder(BorderFactory.createLineBorder(Color.blue, 5));
                        this.tableroJg[i][j].setFondo("src\\Guerrero.jpg");
                    }
                    else if(this.tableroJg[i][j].tipo =='d'){
                        this.tableroJg[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 5));
                        this.tableroJg[i][j].setFondo("src\\Mago.jpg");
                    }
                    else if(this.tableroJg[i][j].tipo =='e'){
                        this.tableroJg[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 5));
                        this.tableroJg[i][j].setFondo("src\\princesa.jpg");
                    }
                    else if(this.tableroJg[i][j].tipo =='f'){
                        this.tableroJg[i][j].setBorder(BorderFactory.createLineBorder(Color.red, 5));
                        this.tableroJg[i][j].setFondo("src\\Guerrero.jpg");
                    }
                    else{this.tableroJg[i][j].setFondo();}
                    
                    
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
    public void removerPersonajes(int turno){
        for(int i=0;i<18;i++){
                for(int j=0; j<18;j++){
                    if(turno==0 && (tableroJg[i][j].tipo == 'a' || tableroJg[i][j].tipo == 'b' || tableroJg[i][j].tipo == 'c' )){
                        tableroJg[i][j].setTipo(' ');
                    }
                    else if(turno==1 && (tableroJg[i][j].tipo == 'd' || tableroJg[i][j].tipo == 'e' || tableroJg[i][j].tipo == 'f' )){
                        tableroJg[i][j].setTipo(' ');
                    }
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
        public void llenarTablero(int ancho,int alto){
            for(int i=0;i<ancho;i++){
                for(int j=0; j<alto;j++){
                    this.tableroPanel.add(this.tableroJg[i][j]);
            }
                
        }
        }
        
        public void asignarPersonajes(int jugador, int turno){
            
            if(this.jugadores[jugador].ordenJuego[turno].equals("mago")){
            boolean mj1 = false; 
            while(!mj1){
            int columnaRandom=(int) (Math.random() * this.anchoActual); 
                int filaRandom=(int) (Math.random() * this.altoActual);
                if(this.tableroJg[filaRandom][columnaRandom].tipo==' '){
                    if(jugador==0){
                        this.tableroJg[filaRandom][columnaRandom].setTipo('a');
                    }
                    else if(jugador==1){
                        this.tableroJg[filaRandom][columnaRandom].setTipo('d');
                    }
                    
                this.jugadores[jugador].mago.posicionJ = this.tableroJg[filaRandom][columnaRandom];
                mj1 = true;
                }
        }
        }
        if(this.jugadores[jugador].ordenJuego[turno].equals("princesa")){
        boolean pj1 = false; 
            while(!pj1){
            int columnaRandom=(int) (Math.random() * this.anchoActual); 
                int filaRandom=(int) (Math.random() * this.altoActual);
                if(this.tableroJg[filaRandom][columnaRandom].tipo==' '){
                    if(jugador==0){
                this.tableroJg[filaRandom][columnaRandom].setTipo('b');
                    }
                    else if(jugador==1){
                this.tableroJg[filaRandom][columnaRandom].setTipo('e');
                    }
                    
                this.jugadores[jugador].princesa.posicionJ = this.tableroJg[filaRandom][columnaRandom];
                pj1 = true;
                }
        }
        }
            if(this.jugadores[jugador].ordenJuego[turno].equals("guerrero")){
            boolean gj1 = false; 
            while(!gj1){
            int columnaRandom=(int) (Math.random() * this.anchoActual); 
                int filaRandom=(int) (Math.random() * this.altoActual);
                if(this.tableroJg[filaRandom][columnaRandom].tipo==' '){
                    if(jugador==0){
                this.tableroJg[filaRandom][columnaRandom].setTipo('c');
                    }
                    else if(jugador==1){
                this.tableroJg[filaRandom][columnaRandom].setTipo('f');
                    }
                this.jugadores[jugador].guerrero.posicionJ = this.tableroJg[filaRandom][columnaRandom];
                gj1 = true;
                }
        }
            }
        }
    
    public void mostrarLabelPersonajes(){
        labelJ1P1.setText(this.jugadores[0].ordenJuego[0]);
        labelJ1P2.setText(this.jugadores[0].ordenJuego[1]);
        labelJ1P3.setText(this.jugadores[0].ordenJuego[2]);
    
        
        labelJ2P1.setText(this.jugadores[1].ordenJuego[0]);
        labelJ2P2.setText(this.jugadores[1].ordenJuego[1]);
        labelJ2P3.setText(this.jugadores[1].ordenJuego[2]);
        
        this.labelNombreJugador1.setText(this.jugadores[0].nombre);
        this.labelNombreJugador2.setText(this.jugadores[1].nombre);
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
    private javax.swing.JPanel PanelVidaJ1;
    private javax.swing.JPanel PanelVidaJ2;
    private javax.swing.JCheckBox checkBoxAtacar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAbajo;
    private javax.swing.JButton jButtonArriba;
    private javax.swing.JButton jButtonDerecha;
    private javax.swing.JButton jButtonIzquierda;
    private javax.swing.JButton jButtonTirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanelCrear;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelGanador;
    private javax.swing.JLabel labelJ1P1;
    private javax.swing.JLabel labelJ1P2;
    private javax.swing.JLabel labelJ1P3;
    private javax.swing.JLabel labelJ2P1;
    private javax.swing.JLabel labelJ2P2;
    private javax.swing.JLabel labelJ2P3;
    private javax.swing.JLabel labelNombreJugador1;
    private javax.swing.JLabel labelNombreJugador2;
    private javax.swing.JLabel txf_cont2;
    private javax.swing.JLabel txf_cont3;
    // End of variables declaration//GEN-END:variables

     @Override
    public void run() {
        
    }
    public synchronized int aumentarSeg(){
        seg--;
        txf_cont3.setText(String.valueOf(seg));
        return seg;
    }
    public synchronized int aumentarMin(){
        min--;
        txf_cont2.setText(String.valueOf(min));
        return min;
    }
    public synchronized int aumentarHora(){
        hora--;
        return hora;
    }
    public void resetearSeg(){
        txf_cont3.setText(String.valueOf("0"));
        seg=59;
    }
    public void resetearMin(){
        txf_cont2.setText(String.valueOf("4")); 
        min=4;
    }
    public void resetearHora(){      
        hora=0;
    }
    public synchronized int getMin(){
        return min;
    }
    public synchronized int getSeg(){
        return seg;
    }    
    public synchronized int getHora(){
        return hora;
    }   
    public synchronized void seguir(){
        continuar =true;
    }
    public synchronized void parar(){
        continuar =false;
    }
    public synchronized boolean isContinuar() {
        return continuar;
    }       

    public void guardarHistorialArchivo() throws IOException{
        String ruta = "src\\Top10.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            int contadorRec = 0;
            while(contadorRec<this.contadorHistorial){
                String fila = "";
                fila= fila + this.historial[contadorRec].nombre+",";
                fila= fila + this.historial[contadorRec].ordenJuego[0]+",";
                fila= fila + this.historial[contadorRec].ordenJuego[1]+",";
                fila= fila + this.historial[contadorRec].ordenJuego[2]+",";
                fila= fila + this.historial[contadorRec].ganadorNumeroVidas+",";
                fila= fila + this.historial[contadorRec].minutosPartida+",";
                fila= fila + this.historial[contadorRec].segundoPartida+";";
                bw.write(fila);
                contadorRec++;
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            int contadorRec = 0;
            while(contadorRec<this.contadorHistorial){
                String fila = "";
                fila= fila + this.historial[contadorRec].nombre+",";
                fila= fila + this.historial[contadorRec].ordenJuego[0]+",";
                fila= fila + this.historial[contadorRec].ordenJuego[1]+",";
                fila= fila + this.historial[contadorRec].ordenJuego[2]+",";
                fila= fila + this.historial[contadorRec].ganadorNumeroVidas+",";
                fila= fila + this.historial[contadorRec].minutosPartida+",";
                fila= fila + this.historial[contadorRec].segundoPartida+";";
                bw.write(fila);
                contadorRec++;
            }
        }
        bw.close();
        mostrarHistorial();
    }
    public void cargarHistorial() throws FileNotFoundException, IOException{
        String cadena;
        FileReader f = new FileReader( "src\\Top10.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            String[] partes = cadena.split(";");
            for(int i=0;i<partes.length;i++){
                String[] datos = partes[i].split(",");
                String[] orden = new String[3];
                orden[0] = datos[1];
                orden[1] = datos[2];
                orden[2] = datos[3];
                this.historial[this.contadorHistorial] = new Record(datos[0],orden,Integer.parseInt(datos[4]),Integer.parseInt(datos[5]),Integer.parseInt(datos[6]));
                this.contadorHistorial++;
            }
        }
        b.close();
        mostrarHistorial();
    }
    public void mostrarHistorial(){
        String header = "Nombre     ,Cartas                         ,Vidas,Min,Seg\r\n";
        for(int i =0;i<this.contadorHistorial;i++){
         String fila = "";
                fila= fila + this.historial[i].nombre+",";
                fila= fila + this.historial[i].ordenJuego[0]+"-";
                fila= fila + this.historial[i].ordenJuego[1]+"-";
                fila= fila + this.historial[i].ordenJuego[2]+",";
                fila= fila + this.historial[i].ganadorNumeroVidas+",";
                fila= fila + this.historial[i].minutosPartida+",";
                fila= fila + this.historial[i].segundoPartida+"\r\n";
         header=header+fila;
        }
        jTextArea1.setText(header);
    }
}
     


