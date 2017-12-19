
package medievilproject;

public class Jugador {
    public String nombre;
    public Ipersonaje personajes;
    public String apellido;
    
public Jugador(){}
public Jugador(String nombre,String apellido){
    this.nombre = nombre;
    this.apellido = apellido;
}

public void setMostrarNombre(String nombre){
    this.nombre = nombre;
}

public void setMostrarApellido(String apellido){
    this.apellido = apellido;
}

}

