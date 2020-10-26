
package Interface2;

import TurtleGraphics.Pen;


public class Rect implements Shape{
    private double width,hight;
    private double xPos,yPos;
    
    public Rect(){
        xPos=0;
        yPos=0;
        width=1;
        hight=1;
    }
    public Rect(double x,double y, double w,double h){
        xPos = x;
        yPos = y;
        width = w;
        hight = h;
    }
    
    @Override
    public double area() {
        return width * hight;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(hight);
        p.setDirection(-90);
        p.move(width);
        p.turn(-90);
        p.move(hight);
        
    }

    @Override
    public double getXpos() {
        return xPos;
    }

    @Override
    public double getYpos() {
        return yPos;
    }

    @Override
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    @Override
    public void stretchBy(double factor) {
        width *= factor;
        hight *= factor;
    }
    
    public String toString(){
        String str = "RECTANGLE\n";
        str += "width x hight = " + width + " x " + hight + "\n";
        str += "x Position = " + xPos + "\n";
        str += "y Position = " + yPos + "\n";
        return str;
    }
}
