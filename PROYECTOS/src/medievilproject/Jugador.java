
package medievilproject;

public class Jugador {
    public String nombre;
    public Mago mago;
    public Princesa princesa;
    public Guerrero guerrero;
    public int vidas;
    public String[] ordenJuego;
    public int personajeActual;
    
    
public Jugador(){}
public Jugador(String nombre, String[] ordenJuego){
    this.nombre = nombre;
    this.ordenJuego = ordenJuego;
    mago = new Mago();
    princesa = new Princesa();
    guerrero = new Guerrero();
    this.vidas = 5;
    this.personajeActual = 0;
    
    
    
}
    
    
public void setMostrarNombre(String nombre){
    this.nombre = nombre;
}
public Posicion posicionActual(){
    if(this.ordenJuego[this.personajeActual].equals("mago")){
        return this.mago.posicionJ;
    }
    else if(this.ordenJuego[this.personajeActual].equals("princesa")){
        return this.princesa.posicionJ;
    }
    else {
        return this.guerrero.posicionJ;
    }
}
public void setposicionActual(Posicion pos){
    if(this.ordenJuego[this.personajeActual].equals("mago")){
        this.mago.posicionJ=pos;
    }
    else if(this.ordenJuego[this.personajeActual].equals("princesa")){
        this.princesa.posicionJ=pos;
    }
    else {
        this.guerrero.posicionJ=pos;
    }
}
public int atacar(Posicion[][] tablero,int anchoActual,int altoActual){
        int vidasARestar =0;
        if(this.ordenJuego[this.personajeActual].equals("mago")){
            vidasARestar = this.mago.atacar(tablero,anchoActual,altoActual);
        }
        else if(this.ordenJuego[this.personajeActual].equals("princesa")){
            vidasARestar=this.princesa.atacar(tablero,anchoActual,altoActual);
        }
        else {
            vidasARestar=this.guerrero.atacar(tablero,anchoActual,altoActual);
        }
    
    return vidasARestar;
}

   
}


