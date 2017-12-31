/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milicia;

/**
 *
 * @author Maiekel Vela
 */
public class UnionAmbas {
    public Cuartel cuartel;
    public Compania compania;

    public UnionAmbas(Cuartel cuartel, Compania compania) {
        this.cuartel = cuartel;
        this.compania = compania;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public Compania getCompania() {
        return compania;
    }
}
