
package tarea_dinamica;


public class Cola {
    private String nombre;
    protected Nodo ptr_ini;
    protected Nodo ptr_fin;
    
    public Cola(){
    ptr_ini = ptr_fin = null;
    }
    
    public Boolean estaVacio(){
         return ptr_ini==null;
        
    }
    public void encolar(Object dato){
    if(estaVacio())
        ptr_ini = ptr_fin = null;
    else{
        ptr_ini = new Nodo(dato, ptr_ini);
} 
}
    public Object descolar(){
       if(estaVacio())
        ptr_ini = ptr_fin = null;
    else{
           Nodo dato = null;
        ptr_fin = ptr_fin.siguiente = new Nodo(dato, null);
} 
        return null;
}
    }
    
    

