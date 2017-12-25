
package ClaseCirculo;


public class Point {
    protected float x,y = (float) 0.0;
    
    public Point(){x=y=(float) 0.0;}
    public Point(float x, float y){
        
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    
    public String toString(){
        return "["+ x + ", " + y + "]";}
    
    }

