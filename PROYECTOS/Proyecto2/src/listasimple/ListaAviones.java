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
public class ListaAviones {
    public String nombre;
    public Nodo ini;
    public Nodo fin;
    
    public ListaAviones(String nombre){
        this.nombre = nombre;
        ini=fin=null;
    }
    public ListaAviones(){
        this("Lista");
    }
    public boolean estaVacia(){
    return (null==ini)?true:false;}
    
    public void InsertarAlFrente(Object dato){
    if(estaVacia())
        ini=fin=new Nodo(null,null,dato);
    else{
        Nodo nuevo=new Nodo(ini,null,dato);
        ini.anterior = nuevo;
        ini=nuevo;
}}
    public void InsertarAlFinal(Object dato){
    if(estaVacia())
        ini=fin=new Nodo(null,null,dato);
    else{
        Nodo nuevo=new Nodo(null,fin,dato);
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
        
        Nodo resultado = ini;
        
    if(ini==fin){
        ini=null;
        fin=null;
    }
    else{
        ini=ini.siguiente;
        ini.anterior = null;
    }
    return resultado;
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
public int obtenerNumeroElementos(){
 int resultado = 0;
 if(ini!=null){
     resultado++;
     Nodo actual = ini;
     while(actual.siguiente!= null){
     resultado++;
     actual = actual.siguiente;
     }
     
 }
 return resultado;
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
