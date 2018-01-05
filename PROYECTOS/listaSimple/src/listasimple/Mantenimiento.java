/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

/**
 *
 * @author Maiekel Vela
 */
public class Mantenimiento {
    public int Estado; //1 para ocupado y 2 para libre**
    public int turnosRestantes;
    public int identificador;
    
    public Mantenimiento(int identificador){
    this.identificador = identificador;
    this.Estado = 2;
    this.turnosRestantes = 0;
    }
}
