
package medievilproject;


public class Guerrero implements Ipersonaje {

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
