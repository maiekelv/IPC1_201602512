
package listasimple;


public class DoblementeEnlazadaCircular {
    public Nodo actual;
    public int contadorElementos;
    
    public DoblementeEnlazadaCircular(){
    this.actual = null;
    this.contadorElementos=0;
    }
     public boolean estaVacia(){
    if (this.actual==null){
    return true;
    }else{
        return false;}
        
    }
    public void push(Object objeto){
        if (estaVacia()){
        actual=new Nodo(null,null,objeto);
        actual.siguiente=actual;
        actual.anterior=actual;
        }else{
        Nodo nuevo = new Nodo(actual.siguiente, actual, objeto);
        actual.siguiente = nuevo;
        actual.anterior.anterior = nuevo;
        }contadorElementos++;
    }
    public Nodo pop() throws Exception{
     if(estaVacia()){
        throw new UnsupportedOperationException("Esta Vacia"); //To change body of generated methods, choose Tools | Templates.
        }else{
         Nodo resultado = actual;
         contadorElementos--;
         if(contadorElementos==0){
         actual=null;
         }else{
         actual.siguiente.anterior = actual.anterior;
         actual.anterior.siguiente = actual.siguiente;
         }
         return resultado;
     }
    }
    public void recorrer(){
        if(estaVacia()){
        System.out.println("Esta Vacia");
        }else{
        Nodo nodoActual = actual;
        System.out.println(nodoActual.data.toString());
        int contadorRecorrer=1;
        while(contadorRecorrer<contadorElementos){
        nodoActual = nodoActual.siguiente;
        System.out.println(nodoActual.data.toString());
        contadorRecorrer++;
        }
        }
    }
}
