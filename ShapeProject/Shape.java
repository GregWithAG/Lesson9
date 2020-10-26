package ShapeProject;

import Interface2.*;
import TurtleGraphics.Pen;

public abstract class Shape {
    protected double xPos,yPos;
    public Shape(){
        xPos = 0;
        yPos = 0;
    }
    public Shape(double xp, double yp){
        xPos = xp;
        yPos = yp;
    }
    abstract public double area();
    abstract public void draw(Pen p);
    
     public double getXpos() {
        return xPos;
    }

    
    public double getYpos() {
        return yPos;
    }

    
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }
    
    abstract public void stretchBy(double factor);
    
    public String toString(){
        String str = "x Position = " + xPos + "\n" + "y Position = " + yPos + "\n";
        
        
        return str;
    }
    
}
