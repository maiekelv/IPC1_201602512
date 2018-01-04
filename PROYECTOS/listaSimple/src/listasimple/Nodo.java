/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;
public class Nodo {
    public Nodo siguiente;
    public Nodo anterior;
    public Object data;
    
    
    public Nodo(Nodo siguiente,Nodo anterior, Object data){
    setSiguiente(siguiente);
    setDato(data);
    setAnterior(anterior);
    }
    
        
    public void setSiguiente(Nodo siguiente){
    this.siguiente = siguiente;
    }
    public void setAnterior(Nodo anterior){
    this.anterior = anterior;
    }
    public Nodo getAnterior(){
    return this.anterior;
    }
    
    public Nodo getSiguiente(){
    return this.siguiente;
    }
    
    public void setDato(Object data){
    this.data = data;
    }
    
    public Object getDato(){
    return this.data;
    }

    Nodo(Object dato, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}

