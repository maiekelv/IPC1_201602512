
package listasimple;


public class Cola {
    Nodo ini;
    Nodo fin;
    
    
public Cola(){
    this.ini = null;
    this.fin = null;
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

public boolean estaVacia(){
    if (this.ini==null&&this.fin==null){
    return true;
    }else{
        return false;}
        
    }

public void encolar(Object objeto){
 if (estaVacia()){
        ini=new Nodo(null,null,objeto);
        fin=ini;
        }else{
        Nodo nuevo = new Nodo(null, null, objeto);
        fin.setSiguiente(nuevo);
        fin=nuevo;
        }
}

public Nodo descolar()throws Exception{
     if(estaVacia()){
        throw new UnsupportedOperationException("Cola esta Vacia"); //To change body of generated methods, choose Tools | Templates.
        }else{
         Nodo resultado   = ini;
         if(ini.siguiente == null){
         ini=null;
         fin=null;
         }else{
         ini = ini.siguiente;
         
         }
         return resultado;
     }
}

    public void recorrer(){
        if(estaVacia()){
        System.out.println("Cola Vacia");
        }else{
        Nodo nodoActual = ini;
        System.out.println(nodoActual.data.toString());
        while(nodoActual.siguiente!= null){
        nodoActual = nodoActual.siguiente;
        System.out.println(nodoActual.data.toString());
        }
        }
    }
    
}
