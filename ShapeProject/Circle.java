package ShapeProject;

import Interface2.*;
import TurtleGraphics.Pen;

public class Circle extends Shape{
    
    protected double xPos,yPos,radius;
    
    public Circle(){
        super();
        radius = 1;
    }
    public Circle(double x,double y,double r){
        xPos = x;
        yPos = y;
        radius =r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    public void draw(Pen p) {
        double side = 2*Math.PI * radius / 120;
        p.up();
        p.move(xPos,yPos);
        p.setDirection(0);
        p.move(radius);
        p.setDirection(90);
        p.down();
        for(int i = 1; i <=120; i++){
            p.move(side);
            p.turn(3);
        }
    }

    
   

    
    public void stretchBy(double factor) {
        radius *= factor;
    }
    
    public String toString(){
        String str = "Circle\n";
        str += "Radius = " + radius + "\n";
        str += super.toString();
        return str;
    }
}
