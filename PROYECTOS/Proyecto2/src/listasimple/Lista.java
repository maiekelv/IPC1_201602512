/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;


public class Lista {
    public String nombre;
    public Nodo ini;
    public Nodo fin;
    
    public Lista(String nombre){
        this.nombre = nombre;
        ini=fin=null;
    }
    public Lista(){
        this("Lista");
    }
    public boolean estaVacia(){
    return (null==ini)?true:false;}
    
    public void InsertarAlFrente(Object dato){
    if(estaVacia())
        ini=fin=new Nodo(null,null,dato);
    else{
        Nodo nuevo=new Nodo(ini,null,dato);
        
        ini=nuevo;
}}
    public void InsertarAlFinal(Object dato){
    if(estaVacia())
        ini=fin=new Nodo(null,null,dato);
    else{
        Nodo nuevo=new Nodo(null,null,dato);
        fin.siguiente = nuevo;
        fin=nuevo;
    }
    }

    /**
     *
     * @return
     * @throws ExceptionListaVacia
     */
    public Object removerDelFrente()throws ExceptionListaVacia{
        
    if (estaVacia())
        throw new ExceptionListaVacia(nombre);
        java.lang.Object datoEliminado = ini.data;
        
        
    if(ini==fin)
        ini=ini.siguiente;
    return (Object) datoEliminado;
}
    public Object removerDelFinal()throws ExceptionListaVacia{
        if(estaVacia())
            throw new ExceptionListaVacia(nombre);
            java.lang.Object datoEliminado = ini.data;
            
    if(ini==fin)
        ini=fin=null;
    else{
        Nodo actual = ini;
        
        while(actual.siguiente!=fin)
            actual.siguiente=null;
    }
    return (Object) datoEliminado;
    }

    private void ExceptionListaVacia(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class ExceptionListaVacia extends Exception {

        public ExceptionListaVacia() {
        }

        private ExceptionListaVacia(String nombre) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }}
}
