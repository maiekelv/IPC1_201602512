
package medievilproject;


public class Guerrero implements Ipersonaje {
    private int alcance;
    private int daño;
    private int atacar;

    public Guerrero(int alcance, int daño, int atacar) {
        this.alcance = alcance;
        this.daño = daño;
        this.atacar = atacar;
    }

    @Override
    public int alcance() {
        return(2);
    }

    @Override
    public int daño() {
        return(2);
    }

    @Override
    public int atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
