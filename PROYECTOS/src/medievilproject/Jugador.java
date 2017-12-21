
package medievilproject;

public class Jugador {
    public String nombre;
    public Mago mago;
    public Princesa princesa;
    public Guerrero guerrero;
    
    public String[] ordenJuego;
    
    
    
public Jugador(){}
public Jugador(String nombre, String[] ordenJuego){
    this.nombre = nombre;
    this.ordenJuego = ordenJuego;
}

public void setMostrarNombre(String nombre){
    this.nombre = nombre;
}
}


