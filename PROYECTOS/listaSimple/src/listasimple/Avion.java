
package listasimple;


public class Avion {
    public int probabilidad;
    public int tipo;
    public int turnosDesabordaje;
    public int turnosMantenimiento;
    public int pasajeros;
    public int id;
    
    public Avion(int tipo, int id){
    this.tipo = tipo;
    this.probabilidad = 1;
    this.id = id;
    if(tipo==1){
        turnosMantenimiento = (int)(Math.random()*2)+1;
        turnosDesabordaje = 1;
        pasajeros = (int)(Math.random()*5)+5;
    }else if(tipo==2){
        turnosMantenimiento = (int)(Math.random()*2)+2;
        turnosDesabordaje = 2;
        pasajeros = (int)(Math.random()*10)+15  ;
    }else if(tipo==3){
        turnosMantenimiento = (int)(Math.random()*3)+3;
        turnosDesabordaje = 3;
        pasajeros = (int)(Math.random()*10)+30;
    }
    }
}
