/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresacarros;

/**
 *
 * @author Maiekel Vela
 */
public class Indicador {
    public ControlCarro control;

    public ControlCarro getControl() {
        return control;
    }

    public void setControl(ControlCarro control) {
        this.control = control;
    }

    public Indicador(ControlCarro control) {
        this.control = control;
    }
}
