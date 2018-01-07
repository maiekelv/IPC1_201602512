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
public class EscritorioRegistro {
    public int clienteAtendido;
    public int Estado; //1 para ocupado y 2 para libre**
    public int cantidadDocARegistrar;
    public int turnosRestantes;
    public String identificador;
    public Pasajero pasajero;
    
    public EscritorioRegistro (int identificador){
    this.clienteAtendido = 0;
    this.Estado = 2;
    this.cantidadDocARegistrar = 0;
    this.turnosRestantes = 0;
    
    if(identificador==1){
        this.identificador = ("A");
    }
    if(identificador==2){
        this.identificador = ("B");
    }
    if(identificador==3){
        this.identificador = ("C");
    }
    if(identificador==4){
        this.identificador = ("D");
    }
    if(identificador==5){
        this.identificador = ("E");
    }
    if(identificador==6){
        this.identificador = ("F");
    }
    if(identificador==7){
        this.identificador = ("G");
    }
    if(identificador==8){
        this.identificador = ("H");
    }
    if(identificador==9){
        this.identificador = ("I");
    }
    if(identificador==10){
        this.identificador = ("J");
    }
    if(identificador==11){
        this.identificador = ("K");
    }
    if(identificador==12){
        this.identificador = ("L");
    }
    if(identificador==13){
        this.identificador = ("M");
    }
    if(identificador==14){
        this.identificador = ("N");
    }
    if(identificador==15){
        this.identificador = ("O");
    }
    if(identificador==16){
        this.identificador = ("P");
    }
    if(identificador==17){
        this.identificador = ("Q");
    }
    if(identificador==18){
        this.identificador = ("R");
    }
    if(identificador==19){
        this.identificador = ("S");
    }
    if(identificador==20){
        this.identificador = ("T");
    }
    if(identificador==21){
        this.identificador = ("U");
    }
    if(identificador==22){
        this.identificador = ("V");
    }
    if(identificador==23){
        this.identificador = ("W");
    }
    if(identificador==24){
        this.identificador = ("X");
    }
    if(identificador==25){
        this.identificador = ("Y");
    }
    if(identificador==26){
        this.identificador = ("Z");
    }
    }
    
}
