/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_dinamica;

/**
 *
 * @author Maiekel Vela
 */
public class Nodo {
    public Nodo siguiente;
    public Object dato;
    
    public Nodo(Nodo siguiente, Object dato){
    setSiguiente(siguiente);
    setDato(dato);
    }
    
    public Nodo(Object dato){
    this(dato, null);
    }
    
    public void setSiguiente(Nodo siguiente){
    this.siguiente = siguiente;
    }
    
    public Nodo getSiguiente(){
    return this.siguiente;
    }
    
    public void setDato(Object dato){
    this.dato = dato;
    }
    
    public Object getDato(){
    return this.dato;
    }

    Nodo(Object dato, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
