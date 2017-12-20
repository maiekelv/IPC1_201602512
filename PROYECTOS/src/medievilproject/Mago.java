
package medievilproject;


public class Mago implements Ipersonaje {
    private int alcance;
    private int daño;
    private int atacar;

    public Mago(int alcance, int daño, int atacar) {
        this.alcance = alcance;
        this.daño = daño;
        this.atacar = atacar;
    }

    @Override
    public int alcance() {
        return(4);
    }

    @Override
    public int daño() {
        return(1);
    }

    @Override
    public int atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
