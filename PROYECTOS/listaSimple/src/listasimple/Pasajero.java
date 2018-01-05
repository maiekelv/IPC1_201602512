/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

public class Pasajero {
    public int identificacion;
    public int cantidadMaletas;
    public int cantidadDocumentos;
    public int turnoRegistro;
    
    public Pasajero(int identificacion){
    this.identificacion = identificacion;
        
    
    this.cantidadMaletas = (int)(Math.random()*3)+1;
    this.cantidadDocumentos = (int)(Math.random()*9)+1;
    this.turnoRegistro = (int)(Math.random()*2)+1;
    }
}
