
package listasimple;

public class ListaOrdenada {
  public NodoCola ini;
  public NodoCola fin;
  public int ordenActual;
  
  public ListaOrdenada(){
  this.ini = null;
  this.fin = null;
  this.ordenActual = 0;
  }

    public void setIni(NodoCola ini) {
        this.ini = ini;
    }

    public void setFin(NodoCola fin) {
        this.fin = fin;
    }

    public void setOrdenActual(int ordenActual) {
        this.ordenActual = ordenActual;
    }

    public NodoCola getIni() {
        return ini;
    }

    public NodoCola getFin() {
        return fin;
    }

    public int getOrdenActual() {
        return ordenActual;
    }
  public boolean estaVacia(){
  return (null==ini)?true:false;
  }
  
  public void insertarAlFinal(Object data){
  if(estaVacia()){
  ini=fin=new NodoCola(null,null,data,ordenActual);
  ordenActual++;
  }else{
        NodoCola nuevo = new NodoCola(null,fin,data,ordenActual);
        fin.siguiente = nuevo;
        fin = nuevo;
        ordenActual++;
}
  }

  
  
  public void insetarAlMedio(){
  
  
  }
    public void insertarAlInicio(Object data){
  if(estaVacia()){
  ini=fin=new NodoCola(null,null,data,ordenActual);
  ordenActual++;
  }else{
        NodoCola nuevo = new NodoCola(ini,null,data,ordenActual);
        ini.anterior = nuevo;
        ini = nuevo;
        ordenActual++;

}
  }
    
    public NodoCola Remover()throws Exception{
    if(estaVacia()){
        throw new UnsupportedOperationException("Pila esta Vacia"); //To change body of generated methods, choose Tools | Templates.
        }else{
        NodoCola resultado = fin;
        if(fin.anterior == null){
        ini=null;
        fin=null;
        }else{
        fin=fin.anterior;
        
        }
        ordenActual--;
        return resultado;
        }
    }
    
}
