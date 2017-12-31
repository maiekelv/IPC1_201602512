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
public class CuerpoEjercito {
    public String codigoCuerpo;
    public String denominacion;

    public CuerpoEjercito(String codigoCuerpo, String denominacion) {
        this.codigoCuerpo = codigoCuerpo;
        this.denominacion = denominacion;
    }

    public String getCodigoCuerpo() {
        return codigoCuerpo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setCodigoCuerpo(String codigoCuerpo) {
        this.codigoCuerpo = codigoCuerpo;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
