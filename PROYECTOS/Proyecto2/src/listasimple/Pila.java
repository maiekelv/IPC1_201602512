
package listasimple;


public class Pila{
     Nodo ini;
     Nodo fin;
    public Pila(){
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
    public void push(Object objeto){
        if (estaVacia()){
        ini=new Nodo(null,null,objeto);
        fin=ini;
        }else{
        Nodo nuevo = new Nodo(this.ini, null, objeto);
        ini=nuevo;
        
        }
            
    }
    public Nodo pop() throws Exception{
        if(estaVacia()){
        throw new UnsupportedOperationException("Pila esta Vacia"); //To change body of generated methods, choose Tools | Templates.
        }else{
        Nodo resultado = ini;
        if(resultado.siguiente == null){
        ini = null;
        fin = null;
        }else{
        ini = resultado.siguiente;
        }
        return resultado;
        }
    }
    public void recorrer(){
        if(estaVacia()){
        System.out.println("Pila Vacia");
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
