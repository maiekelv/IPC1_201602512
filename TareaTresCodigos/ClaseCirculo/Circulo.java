/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseCirculo;

import java.awt.Point;

/**
 *
 * @author Maiekel Vela
 */
public class Circulo extends Point {
    protected float Radius;
    private float radius;
	public Circulo(){
	super(0,0);
	setRadius(0);
	}
public Circulo(float r, float x, float y){
	setRadius(r);
	}

 

    private Circulo(float x, float y) {
       
    }
public void setRadius(float r){
         radius = (r >0.0 ? : r);
    }
	public float getRadius(){return radius;}
	public float area(){
	return (float) (3.1416*radius*radius);}
	
        @Override
	public String toString(){
            
            return "centro=" + "[" + "," + y + "]" + "; Radio=" + Radius;
	}
}
	
    

