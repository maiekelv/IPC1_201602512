
package medievilproject;
import javax.swing.*;

public class Tablero extends javax.swing.JFrame {
    public Dado dado;
    public int tamaño;
    public Posicion minas;
    public Posicion vidas;
    public Posicion posicion[][];
    public Jugador jugadores[];
    public Menu menu;
    
        JButton btnMedievil, btnEnviarNombre;
    JLabel lblJugador1, lblJugador2,nombre1,nombre2;
    JTextField txtJugador1, txtJugador2;
    protected static String nombreJugador1,nombreJugador2;
    JButton [][] matrixBtn = new JButton [3][3];
    

    public Tablero () {
        initComponents();   
    }
    public  void crearTablero(String jugador1, String jugador2){
        setVisible(true);
        setSize(600,400);
        setLayout(null);
        
        nombreJugador1=jugador1;
        nombreJugador2=jugador2;
        
        lblJugador1.setVisible(false);
        lblJugador2.setVisible(false);
        txtJugador1.setVisible(false);
        txtJugador2.setVisible(false);
        btnEnviarNombre.setVisible(false);
        nombre1 = new JLabel();
        nombre2 = new JLabel();
    }
    public void Tirar(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu8.setText("jMenu8");

        jMenu9.setText("File");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar4.add(jMenu10);

        jMenu11.setText("File");
        jMenuBar5.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar5.add(jMenu12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    // End of variables declaration//GEN-END:variables
}
