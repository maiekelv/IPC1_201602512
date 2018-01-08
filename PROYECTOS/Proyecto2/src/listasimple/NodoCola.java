/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

public class NodoCola {
    public NodoCola siguiente;
    public NodoCola anterior;
    public Object data;
    public Cola cola;
    public int orden;
    public Pila documentos;
    
    public NodoCola(NodoCola siguiente, NodoCola anterior, Object data, int orden){
    cola = new Cola();
    setSiguiente(siguiente);
    setDato(data);
    setAnterior(anterior);
    this.orden = orden;
    this.documentos = new Pila();
    }
    public void setOrden(int orden){
    this.orden = orden;
    }
    
    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoCola anterior) {
        this.anterior = anterior;
    }

    public void setDato(Object data) {
        this.data = data;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }

    public int getOrden() {
        return orden;
    }
    

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public NodoCola getAnterior() {
        return anterior;
    }

    public Object getData() {
        return data;
    }

    public Cola getCola() {
        return cola;
    }

}
