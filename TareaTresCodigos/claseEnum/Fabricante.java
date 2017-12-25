
package claseEnum;


public class Fabricante {
    enum NombreFabricante {
        
        HUAWEI("H"), SAMSUNG("S"),  IPHONE("I"), XIAOMI("X");
	
        private String abreviado;
	
        NombreFabricante (String abreviado){
		this.abreviado=abreviado;
        }
        
	public String toString (){
            return abreviado;
        }
    } 

}

