
package ShapeProject;

import Interface2.*;
import TurtleGraphics.Pen;


public class Rect extends Shape{
    private double width,hight;
    private double xPos,yPos;
    
    public Rect(){
        super();
        width=1;
        hight=1;
    }
    public Rect(double x,double y, double w,double h){
        xPos = x;
        yPos = y;
        width = w;
        hight = h;
    }
    

    public double area() {
        return width * hight;
    }


    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(hight);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(hight);
        
    }

    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }
    
    public void stretchBy(double factor) {
        width *= factor;
        hight *= factor;
    }
    
    public String toString(){
        String str = "RECTANGLE\n";
        str += "width x hight = " + width + " x " + hight + "\n";
        str += super.toString();
        return str;
    }
}
